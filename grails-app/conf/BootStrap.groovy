import org.codehaus.groovy.grails.commons.GrailsApplication

class BootStrap {

	GrailsApplication grailsApplication
	
    def init = { servletContext ->
		
		//service for fill up the database with the basic users, roles etc
		def applicationContext = grailsApplication.mainContext
		applicationContext.databaseService.fill()
    }
    def destroy = {
    }
}
