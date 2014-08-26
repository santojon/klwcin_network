package network.klwcin.security
import network.klwcin.business.Meeting

class User {

	transient springSecurityService

	String name
	String email
	String type
	String phone
	
	String username
	String password
	
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	//static belongsTo = [meetings: Meeting]

	static transients = ['springSecurityService']

	static constraints = {
		name(size: 2..45)
		email(email: true)
		type(inList: ["Aspirant", "Common", "Counselor"])
		phone(nullable: true)
		
		username(blank: false, unique: true)
		password(blank: false, password:true)
		
		//meetings blank: true
	}
	
	String toString() {
		return "${name}"
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role }
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}
}
