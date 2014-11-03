import grails.util.Environment

import org.codehaus.groovy.grails.commons.GrailsApplication

class BootStrap {

	GrailsApplication grailsApplication
	
    def init = { servletContext ->
		
		def applicationContext = grailsApplication.mainContext
		
		if (Environment.current == Environment.DEVELOPMENT) {
			
			//services for fill up the database with the basic users, roles etc
			applicationContext.databaseService.fill()
		} else if (Environment.current == Environment.TEST) {
			
		} else if (Environment.current == Environment.PRODUCTION) {
		
			//service for fill up the database with the basic users, roles etc
			applicationContext.databaseService.fill()
		}
    }
    def destroy = {
    }
}
