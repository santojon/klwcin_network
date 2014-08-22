import network.klwcin.business.Meeting
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
expressionOut.print(hasErrors(bean: meetingInstance, field: 'place', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("meeting.place.label"),'default':("Place")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("place"),'maxlength':("45"),'required':(""),'value':(meetingInstance?.place)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("meeting.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textArea','g',19,['name':("description"),'maxlength':("100"),'required':(""),'value':(meetingInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'type', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("meeting.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("type"),'from':(meetingInstance.constraints.type.inList),'required':(""),'value':(meetingInstance?.type),'valueMessagePrefix':("meeting.type")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'date', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("meeting.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',37,['name':("date"),'precision':("minute"),'value':(meetingInstance?.date)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'creator', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("meeting.creator.label"),'default':("Creator")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("creator"),'name':("creator.id"),'from':(network.klwcin.security.User.list()),'optionKey':("id"),'required':(""),'value':(meetingInstance?.creator?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'participants', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("meeting.participants.label"),'default':("Participants")],-1)
printHtmlPart(10)
invokeTag('select','g',55,['name':("participants"),'required':(""),'from':(network.klwcin.security.User.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(meetingInstance?.participants*.id),'class':("many-to-many")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408672863926L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
