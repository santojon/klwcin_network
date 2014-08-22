package network.klwcin.business

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional
import network.klwcin.security.User

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class MeetingController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def springSecurityService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Meeting.list(params), model:[meetingInstanceCount: Meeting.count()]
    }

    def show(Meeting meetingInstance) {
		respond meetingInstance
    }
	
	def goToMeeting(Meeting meetingInstance) {
		meetingInstance.participants.add(springSecurityService.currentUser)
		respond meetingInstance
	}

	@Secured(['ROLE_ADMIN'])
    def create() {
		
		Meeting m = new Meeting(params)
		m.setCreator(springSecurityService.currentUser)
		
		m.participants = []
		m.participants.add(springSecurityService.currentUser)
		
		//the server is UTC (GMT)
		m.date = new Date()
		m.date.hours -= 3
		
        respond m
    }

    @Transactional
    def save(Meeting meetingInstance) {
        if (meetingInstance == null) {
            notFound()
            return
        }

        if (meetingInstance.hasErrors()) {
            respond meetingInstance.errors, view:'create'
            return
        }

		meetingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'meeting.label', default: 'Meeting'), meetingInstance.id])
                redirect meetingInstance
            }
            '*' { respond meetingInstance, [status: CREATED] }
        }
    }

	@Secured(['ROLE_ADMIN'])
    def edit(Meeting meetingInstance) {
		
		if(meetingInstance.getCreator() == springSecurityService.currentUser) {
			respond meetingInstance
		} else {
			flash.message = message(code: 'You are not the creator of this meeting!')
			redirect action: "index", method: "GET"
		}
    }

    @Transactional
    def update(Meeting meetingInstance) {
        if (meetingInstance == null) {
            notFound()
            return
        }

        if (meetingInstance.hasErrors()) {
            respond meetingInstance.errors, view:'edit'
            return
        }
		
		if(meetingInstance.getType() == 'Council') {
			if(!springSecurityService.currentUser.getType().equals('Counselor')) {
				flash.message = message(code: 'You are not a Councelor!')
				redirect meetingInstance
			} else {
				meetingInstance.participants.add(springSecurityService.currentUser)
			
				meetingInstance.save flush:true
							
				request.withFormat {
					form multipartForm {
						flash.message = message(code: 'default.updated.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
						redirect meetingInstance
					}
					'*'{ respond meetingInstance, [status: OK] }
				}
			}
		} else {
			meetingInstance.participants.add(springSecurityService.currentUser)
				
			meetingInstance.save flush:true
			
			request.withFormat {
				form multipartForm {
					flash.message = message(code: 'default.updated.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
					redirect meetingInstance
				}
				'*'{ respond meetingInstance, [status: OK] }
			}
		}
    }

    @Transactional
	@Secured(['ROLE_ADMIN'])
    def delete(Meeting meetingInstance) {

        if (meetingInstance == null) {
            notFound()
            return
        }
		
		if(meetingInstance.getCreator() == springSecurityService.currentUser) {
			meetingInstance.delete flush:true
			
			request.withFormat {
				form multipartForm {
					flash.message = message(code: 'default.deleted.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
					redirect action:"index", method:"GET"
				}
				'*'{ render status: NO_CONTENT }
			}
		} else {
			flash.message = message(code: 'You are not the creator of this meeting!')
			redirect action: "index", method: "GET"
		}
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'meeting.label', default: 'Meeting'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
