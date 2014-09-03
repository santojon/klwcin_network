package network.klwcin.security
import java.awt.Graphics;

import network.klwcin.business.Meeting

class User {

	transient springSecurityService

	String name
	String email
	String type
	String phone
	
	String username
	String password
	
	//Graphics image
	
	boolean enabled = true
	
	//penal
	int advertments = 0
	boolean accountLocked
	Date unlockDate
	
	//spring security
	boolean accountExpired
	boolean passwordExpired
	
	//static xxxxxx = ['image']

	static transients = ['springSecurityService']

	static constraints = {
		//image(nullable: true)
		name(size: 2..45)
		email(email: true)
		type(inList: ["Aspirant", "Common", "Counselor"])
		phone(nullable: true)
		
		username(blank: false, unique: true)
		password(blank: false, password:true, size:2..64)
		
		advertments(nullable: true)
		unlockDate(nullable: true)
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
