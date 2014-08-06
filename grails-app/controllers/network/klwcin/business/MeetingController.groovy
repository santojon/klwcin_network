package network.klwcin.business

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class MeetingController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Meeting.list(params), model:[meetingInstanceCount: Meeting.count()]
    }

    def show(Meeting meetingInstance) {
        respond meetingInstance
    }

	@Secured(['ROLE_ADMIN'])
    def create() {
        respond new Meeting(params)
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
        respond meetingInstance
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

        meetingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
                redirect meetingInstance
            }
            '*'{ respond meetingInstance, [status: OK] }
        }
    }

    @Transactional
	@Secured(['ROLE_ADMIN'])
    def delete(Meeting meetingInstance) {

        if (meetingInstance == null) {
            notFound()
            return
        }

        meetingInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
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
