import network.klwcin.security.Role
import network.klwcin.security.User
import network.klwcin.security.UserRole

class BootStrap {

    def init = { servletContext ->
		
		//roles
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
		def noneRole = new Role(authority: 'ROLE_NONE').save(flush: true)
		
		//first user
		def adminUser = new User(name:'Jonathan Santos', email:'jgs@cin.ufpe.br', type:'Counselor', username:'jgs' , password:'jgs')
		adminUser.save(flush: true)
		
		//linking user to roles
		UserRole.create adminUser, adminRole, true
		
		//tests
		println User.find {name: adminUser.getName()}
		println adminUser.getUsername()
		println adminRole
		println userRole
		
		println UserRole.count()
		println UserRole.findAll {}
		println UserRole.findAll {}
    }
    def destroy = {
    }
}
