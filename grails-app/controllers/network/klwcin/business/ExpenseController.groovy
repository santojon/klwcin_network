package network.klwcin.business

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class ExpenseController {

    static allowedMethods = [save: "POST", update: "PUT", delete: ["DELETE", 'GET'], edit: ["PUT", 'GET']]
	def springSecurityService
	
	private redirectToIndex() {
		redirect (['params': session["expenseParams"]] << [action:'index', method:'GET'])
	}
	
	private saveParams() {
		session["expenseParams"] = [
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
			params.sort = 'id'
		}
		
		//modify here to implant search by the field you want
		respond Expense.createCriteria().list(params) {
			like('description', "%${search}%")
		}, model:[expenseInstanceCount: Expense.count()]
    }

    def create() {
		if(springSecurityService.currentUser.getType() == "Counselor") {
			Expense expenseInstance = new Expense(params)
			respond expenseInstance
		} else {
			flash.message = message(code: "You don't have sufficient privileges to create a new expense!")
			redirectToIndex()
		}
    }

    @Transactional
    def save(Expense expenseInstance) {
        if (expenseInstance == null) {
            notFound()
            return
        }

        if (expenseInstance.hasErrors()) {
            flash.errors = expenseInstance.errors
			redirect action:'create'
            return
        }

        expenseInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.successMessage = message(code: 'default.created.message', args: [message(code: 'expense.label', default: 'Expense'), expenseInstance.id])
                redirectToIndex()
            }
            '*' { respond expenseInstance, [status: CREATED] }
        }
    }

    def edit(Expense expenseInstance) {
        respond expenseInstance
    }

    @Transactional
    def update(Expense expenseInstance) {
        if (expenseInstance == null) {
            notFound()
            return
        }

        if (expenseInstance.hasErrors()) {
            flash.errors = expenseInstance.errors
            respond expenseInstance.errors, view: 'edit'
            return
        }

        expenseInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.successMessage = message(code: 'default.updated.message', args: [message(code: 'Expense.label', default: 'Expense'), expenseInstance.id])
                redirectToIndex()
            }
            '*'{ respond expenseInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Expense expenseInstance) {

        if (expenseInstance == null) {
            notFound()
            return
        }

		if(springSecurityService.currentUser.getType() != "Counselor") {
			flash.message = message(code: "You don't have sufficient privileges to delete expenses!")
		} else {
	        expenseInstance.delete flush:true
	
	        request.withFormat {
	            form multipartForm {
	                flash.successMessage = message(code: 'default.deleted.message', args: [message(code: 'Expense.label', default: 'Expense'), expenseInstance.id])
	            }
	            '*'{ render status: NO_CONTENT }
	        }
		}
		redirectToIndex()
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'expense.label', default: 'Expense'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
