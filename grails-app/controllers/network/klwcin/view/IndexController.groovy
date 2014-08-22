package network.klwcin.view

import grails.plugin.springsecurity.annotation.Secured;
import network.klwcin.business.Meeting;
import network.klwcin.security.User;

@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class IndexController {
	
	def springSecurityService

    def index() {
		
		ArrayList<Meeting> m = []
		if(springSecurityService.currentUser.getType().equals('Counselor')) {
			m = Meeting.findAll("from Meeting as m where m.date > :date order by m.date", [date: new Date(hours: (new Date()).hours -= 3)], [max: 10])
		} else {
			m = Meeting.findAll("from Meeting as m where m.date > :date and m.type != :council order by m.date", [date: new Date(hours: (new Date()).hours -= 3), council: 'Council'], [max: 10])
		}
		
		//respond many lists at time
		[meetings: m, users: User.findAll()]
	}
	
	def showMeeting(Meeting meeting) {
		println meeting.id
		render(view: '/meeting/show', model: [meetingInstance: meeting])
		//redirect(controller:"Meeting",action:"show") 		// -- não funfa com parâmetros
	}
}
