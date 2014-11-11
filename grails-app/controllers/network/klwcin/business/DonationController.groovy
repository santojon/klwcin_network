package network.klwcin.business

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class DonationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: ["DELETE", 'GET'], edit: ["PUT", 'GET']]
	def springSecurityService
	
	private redirectToIndex() {
		redirect (['params': session["donationParams"]] << [action:'index', method:'GET'])
	}
	
	private saveParams() {
		session["donationParams"] = [
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
		respond Donation.createCriteria().list(params) {
			or {
				like('type', "%${search}%")
				like('description', "%${search}%")
			}
		}, model:[donationInstanceCount: Donation.count()]
    }

    def create() {
		if(springSecurityService.currentUser.getType() == "Counselor") {
			Donation donationInstance = new Donation(params)
			respond donationInstance
		} else {
			flash.message = message(code: "You don't have sufficient privileges to create a new donation!")
			redirectToIndex()
		}
    }

    @Transactional
    def save(Donation donationInstance) {
        if (donationInstance == null) {
            notFound()
            return
        }

        if (donationInstance.hasErrors()) {
            flash.errors = donationInstance.errors
			redirect action:'create'
            return
        }

        donationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.successMessage = message(code: 'default.created.message', args: [message(code: 'donation.label', default: 'Donation'), donationInstance.id])
                redirectToIndex()
            }
            '*' { respond donationInstance, [status: CREATED] }
        }
    }

    def edit(Donation donationInstance) {
        respond donationInstance
    }

    @Transactional
    def update(Donation donationInstance) {
        if (donationInstance == null) {
            notFound()
            return
        }

        if (donationInstance.hasErrors()) {
            flash.errors = donationInstance.errors
            respond donationInstance.errors, view: 'edit'
            return
        }

        donationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.successMessage = message(code: 'default.updated.message', args: [message(code: 'Donation.label', default: 'Donation'), donationInstance.id])
                redirectToIndex()
            }
            '*'{ respond donationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Donation donationInstance) {

        if (donationInstance == null) {
            notFound()
            return
        }

		if(springSecurityService.currentUser.getType() != "Counselor") {
			flash.message = message(code: "You don't have sufficient privileges to delete donations!")
		} else {
	        donationInstance.delete flush:true
	
	        request.withFormat {
	            form multipartForm {
	                flash.successMessage = message(code: 'default.deleted.message', args: [message(code: 'Donation.label', default: 'Donation'), donationInstance.id])
	            }
	            '*'{ render status: NO_CONTENT }
	        }
		}
		redirectToIndex()
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'donation.label', default: 'Donation'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
