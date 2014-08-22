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
		type(inList: ["Common", "Ascension", "Special", "Council"])
		
		//UTC - 3 validation (hell server!)
		date(validator: {return (it > new Date(hours: (new Date()).hours -= 3))}, unique: true)
    }
	
	String toString() {
		"${creator}, ${participants}"
	}
}
