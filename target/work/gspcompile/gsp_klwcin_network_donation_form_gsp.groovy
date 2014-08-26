import network.klwcin.business.Donation
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_donation_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/donation/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: donationInstance, field: 'description', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("donation.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("description"),'maxlength':("100"),'required':(""),'value':(donationInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: donationInstance, field: 'type', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("donation.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['name':("type"),'from':(donationInstance.constraints.type.inList),'required':(""),'value':(donationInstance?.type),'valueMessagePrefix':("donation.type")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: donationInstance, field: 'value', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("donation.value.label"),'default':("Value")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("value"),'value':(fieldValue(bean: donationInstance, field: 'value')),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: donationInstance, field: 'date', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("donation.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',37,['name':("date"),'precision':("day"),'value':(donationInstance?.date)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: donationInstance, field: 'donator', 'error'))
printHtmlPart(9)
invokeTag('message','g',43,['code':("donation.donator.label"),'default':("Donator")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("donator"),'name':("donator.id"),'from':(network.klwcin.security.User.list()),'optionKey':("id"),'required':(""),'value':(donationInstance?.donator?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409062434756L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
