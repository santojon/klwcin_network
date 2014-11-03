package network.klwcin.security

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: ["DELETE", 'GET'], edit: ["PUT", 'GET']]
	def springSecurityService
	
	private redirectToIndex() {
		redirect (['params': session['userParams']] << [action:'index', method:'GET'])
	}
	
	private saveParams() {
		session['userParams'] = [
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
			params.sort = 'username'
		}
		
		respond User.createCriteria().list(params) {
			or {
				like('name', "%${search}%")
				like('username' , "%${search}%")
				like('phone', "%${search}%")
				like('email', "%${search}%")
			}
		}, model: [userInstanceCount: User.count()]
    }

    def create() {
		if(springSecurityService.currentUser.getType() == "Counselor") {
			respond new User(params)
		} else {
			flash.message = message(code: 'You don\'t have sufficient privileges to create a new user!')
			redirectToIndex()
		}
    }

    @Transactional
    def save(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            flash.errors = userInstance.errors
			redirect action:'create'
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
                flash.successMessage = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.username])
                redirectToIndex()
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
				flash.message = message(code: 'You don\'t have sufficient privileges to modify an account that isn\'t yours!')
				redirectToIndex()
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
			flash.errors = userInstance.errors
            respond userInstance.errors, view: 'edit'
            return
        } 

        userInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.successMessage = message(code: 'default.updated.message', args: [message(code: 'User.label', default: 'User'), userInstance.username])
                redirectToIndex()
            }
            '*'{ respond userInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(User userInstance) {
		if(springSecurityService.currentUser.getType() != "Counselor") {
			flash.message = message(code: 'You don\'t have sufficient privileges to delete accounts!')
		} else {

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
	
	        flash.successMessage = message(code: 'default.deleted.message', args: [message(code: 'User.label', default: 'User'), userInstance.username])
		}
		redirectToIndex()
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), params.id])
                redirectToIndex()
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
