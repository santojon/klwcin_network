package network.klwcin.business

import java.util.Date;

import network.klwcin.security.User;

class Expense {
	
	Date date
	String description
	Float value

	static constraints = {
		description(size: 0..100)
		value(validator: {return it > new Double(0)})
		
		//UTC - 3 validation (hell server!)
		date(validator: {return (it <= new Date(hours: (new Date()).hours -= 3))})
	}
}
