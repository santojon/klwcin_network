package network.klwcin.security

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def springSecurityService
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond User.list(params), model:[userInstanceCount: User.count()]
    }

    def show(User userInstance) {
        respond userInstance
    }

	@Secured(['ROLE_ADMIN'])
    def create() {
        respond new User(params)
    }

    @Transactional
    def save(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view:'create'
            return
        }

        userInstance.save flush:true
		
		//business rule (member types)
		if(userInstance.getType() == "Counselor") {
			UserRole.create userInstance, Role.findAll().getAt(0), true
		}
		
		if(userInstance.getType() == "Common") {
			UserRole.create userInstance, Role.findAll().getAt(1), true
		}
		
		if(userInstance.getType() == "Aspirant") {
			UserRole.create userInstance, Role.findAll().getAt(2), true
		}

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*' { respond userInstance, [status: CREATED] }
        }
    }

    def edit(User userInstance) {
		if(springSecurityService.currentUser.getType() == "Counselor") {
			respond userInstance
		} else {
			if(springSecurityService.currentUser == userInstance) {
				respond userInstance
			} else {
				flash.message = message(code: 'You cannot modify this account!')
				redirect action: "index", method: "GET"
			}
		}
    }

    @Transactional
    def update(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view:'edit'
            return
        }

        userInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*'{ respond userInstance, [status: OK] }
        }
    }

    @Transactional
	@Secured(['ROLE_ADMIN'])
    def delete(User userInstance) {

        if (userInstance == null) {
            notFound()
            return
        }
		
		//business rule (member types)
		if(userInstance.getType() == "Counselor") {
			UserRole.remove userInstance, Role.findAll().getAt(0), true
		}
		
		if(userInstance.getType() == "Common") {
			UserRole.remove userInstance, Role.findAll().getAt(1), true
		}
		
		if(userInstance.getType() == "Aspirant") {
			UserRole.remove userInstance, Role.findAll().getAt(2), true
		} 

        userInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
