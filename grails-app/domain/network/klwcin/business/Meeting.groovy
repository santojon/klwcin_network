package network.klwcin.business

import network.klwcin.security.User

class Meeting {
	
	String place
	String description
	String type
	Date date
	User creator
	
	static hasMany = [participants: User]

    static constraints = {
		place(size: 2..45)
		description(size: 10..100)
		type(inList: ["Ascension", "Common", "Council", "Special"])
		date(/**validator: {return (it > new Date())}**/)
    }
	
	String toString() {
		"${creator}, ${participants}"
	}
}
