
package network.klwcin.persistence

import grails.transaction.Transactional
import network.klwcin.security.Role
import network.klwcin.security.User
import network.klwcin.security.UserRole

@Transactional
class DatabaseService {

    def fill() {
		
		//roles
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
		def noneRole = new Role(authority: 'ROLE_NONE').save(flush: true)
		
		//first users
		def adminUser = new User(name:'Jonathan Santos', email:'jgs@cin.ufpe.br', type:'Counselor', phone: '+55(81)9681-6217', username:'jgs' , password:'jgs')
		adminUser.save(flush: true)
		
		def adminUser2 = new User(name:'Vanessa Ogg', email:'voo@cin.ufpe.br', type:'Counselor', username:'voo' , password:'voo')
		adminUser2.save(flush: true)
		
		def adminUser3 = new User(name:'Thiago Domingues', email:'tald@cin.ufpe.br', type:'Counselor', username:'tald' , password:'tald')
		adminUser3.save(flush: true)
		
		def adminUser4 = new User(name:'Wilson Limeira', email:'wlgc@cin.ufpe.br', type:'Counselor', username:'wlgc' , password:'wlgc')
		adminUser4.save(flush: true)
		
		def adminUser5 = new User(name:'Helder Lucas', email:'hlvl@cin.ufpe.br', type:'Counselor', username:'hlvl' , password:'hlvl')
		adminUser5.save(flush: true)
		
		def userUser = new User(name:'Kleyton Leacarla', email:'klbl@cin.ufpe.br', type:'Common', username:'klbl' , password:'klbl')
		userUser.save(flush: true)
		
		def userUser2 = new User(name:'Raphael Tulyo', email:'rtsd@cin.ufpe.br', type:'Common', username:'rtsd' , password:'rtsd')
		userUser2.save(flush: true)
		
		def userUser3 = new User(name:'Jose Antonio', email:'jas4@cin.ufpe.br', type:'Common', username:'jas4' , password:'jas4')
		userUser3.save(flush: true)
		
		def noneUser = new User(name:'Helder Felix', email:'hpff@cin.ufpe.br', type:'Aspirant', username:'hpff' , password:'hpff')
		noneUser.save(flush: true)
		
		//linking users to roles
		UserRole.create adminUser, adminRole, true
		UserRole.create adminUser2, adminRole, true
		UserRole.create adminUser3, adminRole, true
		UserRole.create adminUser4, adminRole, true
		UserRole.create adminUser5, adminRole, true
		
		UserRole.create userUser, userRole, true
		UserRole.create userUser2, userRole, true
		UserRole.create userUser3, userRole, true
		
		UserRole.create noneUser, noneRole, true
    }
}
