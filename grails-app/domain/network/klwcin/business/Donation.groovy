package network.klwcin.business

import network.klwcin.security.User

class Donation {
	
	User donator
	Date date
	String type
	String description
	Double value

    static constraints = {
		description(size: 0..100)
		type(inList: ["Monetary", "Ingredient", "Accompaniment"])
		value(validator: {return it >= new Double(0)})
		
		//UTC - 3 validation (hell server!)
		date(validator: {return (it <= new Date(hours: (new Date()).hours -= 3))})
    }
}
