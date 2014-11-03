import network.klwcin.business.Meeting
import network.klwcin.security.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_meeting_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(2)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'place', 'error'))
printHtmlPart(3)
invokeTag('message','g',9,['code':("meeting.place.label"),'default':("Place:")],-1)
printHtmlPart(4)
invokeTag('textField','g',10,['class':("form-control"),'name':("place"),'maxlength':("45"),'required':(""),'value':(meetingInstance?.place)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'type', 'error'))
printHtmlPart(3)
invokeTag('message','g',17,['code':("meeting.type.label"),'default':("Type:")],-1)
printHtmlPart(6)
invokeTag('select','g',18,['class':("form-control"),'name':("type"),'from':(meetingInstance.constraints.type.inList),'required':(""),'value':(meetingInstance?.type),'valueMessagePrefix':("meeting.type")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'description', 'error'))
printHtmlPart(3)
invokeTag('message','g',27,['code':("meeting.description.label"),'default':("Description:")],-1)
printHtmlPart(4)
invokeTag('textArea','g',28,['class':("form-control"),'name':("description"),'maxlength':("45"),'required':(""),'value':(meetingInstance?.description)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'date', 'error'))
printHtmlPart(3)
invokeTag('message','g',35,['code':("meeting.date.label"),'default':("Date:")],-1)
printHtmlPart(4)
invokeTag('datePicker','g',36,['name':("date"),'precision':("minute"),'value':(meetingInstance?.date)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'participants', 'error'))
printHtmlPart(10)
invokeTag('message','g',47,['code':("meeting.participants.label"),'default':("Participants:")],-1)
printHtmlPart(11)
for( p in (meetingInstance.participants) ) {
printHtmlPart(12)
createTagBody(3, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',51,['controller':("user"),'action':("edit"),'id':(p.id)],3)
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(2)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'place', 'error'))
printHtmlPart(3)
invokeTag('message','g',65,['code':("meeting.place.label"),'default':("Place:")],-1)
printHtmlPart(4)
invokeTag('textField','g',66,['disabled':(""),'class':("form-control"),'name':("place"),'maxlength':("45"),'required':(""),'value':(meetingInstance?.place)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'type', 'error'))
printHtmlPart(3)
invokeTag('message','g',73,['code':("meeting.type.label"),'default':("Type:")],-1)
printHtmlPart(6)
invokeTag('select','g',74,['disabled':(""),'class':("form-control"),'name':("type"),'from':(meetingInstance.constraints.type.inList),'required':(""),'value':(meetingInstance?.type),'valueMessagePrefix':("meeting.type")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'description', 'error'))
printHtmlPart(3)
invokeTag('message','g',83,['code':("meeting.description.label"),'default':("Description:")],-1)
printHtmlPart(4)
invokeTag('textArea','g',84,['disabled':(""),'class':("form-control"),'name':("description"),'maxlength':("45"),'required':(""),'value':(meetingInstance?.description)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'date', 'error'))
printHtmlPart(3)
invokeTag('message','g',91,['code':("meeting.date.label"),'default':("Date:")],-1)
printHtmlPart(16)
invokeTag('datePicker','g',93,['name':("date"),'precision':("minute"),'value':(meetingInstance?.date)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'participants', 'error'))
printHtmlPart(10)
invokeTag('message','g',105,['code':("meeting.participants.label"),'default':("Participants:")],-1)
printHtmlPart(11)
for( p in (meetingInstance.participants) ) {
printHtmlPart(12)
expressionOut.print(p?.encodeAsHTML())
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(18)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'creator', 'error'))
printHtmlPart(19)
invokeTag('message','g',122,['code':("meeting.creator.label"),'default':("Creator")],-1)
printHtmlPart(20)
invokeTag('select','g',125,['id':("creator"),'name':("creator.id"),'from':(network.klwcin.security.User.list()),'optionKey':("id"),'required':(""),'value':(meetingInstance?.creator?.id),'class':("many-to-one")],-1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415029940522L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 5, 5, 8, 8, 9, 9, 10, 10, 16, 16, 17, 17, 18, 18, 26, 26, 27, 27, 28, 28, 34, 34, 35, 35, 36, 36, 44, 44, 47, 47, 49, 49, 51, 51, 51, 51, 51, 53, 53, 58, 58, 61, 61, 64, 64, 65, 65, 66, 66, 72, 72, 73, 73, 74, 74, 82, 82, 83, 83, 84, 84, 90, 90, 91, 91, 93, 93, 102, 102, 105, 105, 107, 107, 109, 109, 111, 111, 116, 116, 120, 120, 122, 122, 125, 125, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
