import network.klwcin.security.User

class UrlMappings {
	
	def springSecurityService

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
        //"/"(view:"/index")
		"/"(controller:"index")
        "500"(view:'/error')
	}
}
