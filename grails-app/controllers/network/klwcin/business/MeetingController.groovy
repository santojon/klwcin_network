package network.klwcin.business

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class MeetingController {

     static allowedMethods = [save: "POST", update: "PUT", delete: ["DELETE", 'GET'], edit: ["PUT", 'GET']]
	def springSecurityService
	
	private redirectToIndex() {
		redirect (['params': session['meetingParams']] << [action:'index', method:'GET'])
	}
	
	private saveParams() {
		session['meetingParams'] = [
			'search': params.search,
			'offset': params.offset,
			'max': params.max,
			'sort': params.sort,
			'order': params.order
		]
	}
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        String search = ''
		
		saveParams()
		
		if (params.search) {
			search = params.search.replace('*', '%')
			search = search.replace('?', '_')
			search = search.trim()
		}
		
		if (params.sort == null || params.sort == '') {
			params.sort = 'place'
		}
		
		respond Meeting.createCriteria().list(params) {
			or {
				like('place', "%${search}%")
				like('description' , "%${search}%")
				like('type', "%${search}%")
			}
		}, model: [meetingInstanceCount: Meeting.count()]
    }
	
	def goToMeeting(Meeting meetingInstance) {
		meetingInstance.participants.add(springSecurityService.currentUser)
		respond meetingInstance
	}
	
	@Transactional
	def participate(Meeting meetingInstance) {
		        if (meetingInstance.date > new Date(hours: (new Date()).hours -= 3)) {
            meetingInstance.participants.add(springSecurityService.currentUser)
            
            meetingInstance.save flush:true
            
            request.withFormat {
                form multipartForm {
                    flash.successMessage = message(code: 'Participation confirmed!')
                    redirectToIndex()
                }
                '*'{ respond meetingInstance, [status: OK] }
            }
		} else {
			flash.message = message(code: 'This is a past meeting, you cannot participate anymore!')
			redirectToIndex()
		}
	}

    def create() {
		if(springSecurityService.currentUser.getType() == "Counselor") {
			Meeting m = new Meeting(params)
			m.setCreator(springSecurityService.currentUser)
			
			m.participants = []
			m.participants.add(springSecurityService.currentUser)
			
			//the server is UTC (GMT)
			m.date = new Date()
			m.date.hours -= 3
			
	        respond m
		} else {
			flash.message = message(code: 'You don\'t have sufficient privileges to create a new meeting!')
			redirectToIndex()
		}
    }

    @Transactional
    def save(Meeting meetingInstance) {
        if (meetingInstance == null) {
            notFound()
            return
        }

        if (meetingInstance.hasErrors()) {
            flash.errors = meetingInstance.errors
			redirect action:'create'
            return
        }
		
		meetingInstance.participants = []
		meetingInstance.participants.add(springSecurityService.currentUser)
		meetingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.successMessage = message(code: 'meeting.created.message', args: [message(code: 'meeting.label', default: 'Meeting'), meetingInstance.place, meetingInstance.date])
                redirectToIndex()
            }
            '*' { respond meetingInstance, [status: CREATED] }
        }
    }

    def edit(Meeting meetingInstance) {
		respond meetingInstance
    }

    @Transactional
    def update(Meeting meetingInstance) {
        if (meetingInstance == null) {
            notFound()
            return
        }

        if (meetingInstance.hasErrors()) {
            flash.errors = meetingInstance.errors
            respond meetingInstance.errors, view: 'edit'
            return
        }
		
		if(meetingInstance.getType() == 'Council') {
			if(!springSecurityService.currentUser.getType().equals('Counselor')) {
				flash.message = message(code: 'You are not a Councelor!')
				redirectToIndex()
			} else {
				meetingInstance.participants.add(springSecurityService.currentUser)
			
				meetingInstance.save flush:true
							
				request.withFormat {
					form multipartForm {
						flash.successMessage = message(code: 'meeting.updated.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.place, meetingInstance.date])
						redirectToIndex()
					}
					'*'{ respond meetingInstance, [status: OK] }
				}
			}
		} else {
			if(!springSecurityService.currentUser.getType().equals('Counselor')) {
				flash.message = message(code: 'You don\'t have sufficient privileges to update a meeting!')
				redirectToIndex()
			} else {
				meetingInstance.participants.add(springSecurityService.currentUser)
					
				meetingInstance.save flush:true
				
				request.withFormat {
					form multipartForm {
						flash.successMessage = message(code: 'meeting.updated.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.place, meetingInstance.date])
						redirectToIndex()
					}
					'*'{ respond meetingInstance, [status: OK] }
				}
			}
		}
    }

    @Transactional
    def delete(Meeting meetingInstance) {
		if(springSecurityService.currentUser.getType() != "Counselor") {
			flash.message = message(code: 'You don\'t have sufficient privileges to delete meetings!')
		} else {
	        if (meetingInstance == null) {
	            notFound()
	            return
	        }
			
			if(meetingInstance.getCreator() == springSecurityService.currentUser) {
				meetingInstance.delete flush:true
				
				request.withFormat {
					form multipartForm {
						flash.successMessage = message(code: 'meeting.deleted.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.place, meetingInstance.date])
					}
					'*'{ render status: NO_CONTENT }
				}
			} else {
				flash.message = message(code: 'You are not the creator of this meeting!')
			}
		}
		redirectToIndex()
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
