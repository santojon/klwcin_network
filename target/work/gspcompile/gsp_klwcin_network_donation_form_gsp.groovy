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
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: donationInstance, field: 'description', 'error'))
printHtmlPart(2)
invokeTag('message','g',7,['code':("donation.description.label"),'default':("Description")],-1)
printHtmlPart(3)
invokeTag('textField','g',9,['class':("form-control"),'name':("description"),'maxlength':("100"),'required':(""),'value':(donationInstance?.description)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'description', 'error'))
printHtmlPart(2)
invokeTag('message','g',19,['code':("donation.description.label"),'default':("Description")],-1)
printHtmlPart(3)
invokeTag('textField','g',21,['disabled':(""),'class':("form-control"),'name':("description"),'maxlength':("100"),'required':(""),'value':(donationInstance?.description)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'description', 'error'))
printHtmlPart(2)
invokeTag('message','g',31,['code':("donation.description.label"),'default':("Description")],-1)
printHtmlPart(3)
invokeTag('textField','g',33,['disabled':(""),'class':("form-control"),'name':("description"),'maxlength':("100"),'required':(""),'value':(donationInstance?.description)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: donationInstance, field: 'type', 'error'))
printHtmlPart(2)
invokeTag('message','g',43,['code':("donation.type.label"),'default':("Type")],-1)
printHtmlPart(3)
invokeTag('select','g',45,['class':("form-control"),'name':("type"),'from':(donationInstance.constraints.type.inList),'required':(""),'value':(donationInstance?.type),'valueMessagePrefix':("donation.type")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'type', 'error'))
printHtmlPart(2)
invokeTag('message','g',55,['code':("donation.type.label"),'default':("Type")],-1)
printHtmlPart(3)
invokeTag('select','g',57,['disabled':(""),'class':("form-control"),'name':("type"),'from':(donationInstance.constraints.type.inList),'required':(""),'value':(donationInstance?.type),'valueMessagePrefix':("donation.type")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'type', 'error'))
printHtmlPart(2)
invokeTag('message','g',67,['code':("donation.type.label"),'default':("Type")],-1)
printHtmlPart(3)
invokeTag('select','g',69,['disabled':(""),'class':("form-control"),'name':("type"),'from':(donationInstance.constraints.type.inList),'required':(""),'value':(donationInstance?.type),'valueMessagePrefix':("donation.type")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: donationInstance, field: 'value', 'error'))
printHtmlPart(2)
invokeTag('message','g',79,['code':("donation.value.label"),'default':("Value")],-1)
printHtmlPart(3)
invokeTag('field','g',81,['class':("form-control"),'name':("value"),'value':(fieldValue(bean: donationInstance, field: 'value')),'required':("")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'value', 'error'))
printHtmlPart(2)
invokeTag('message','g',91,['code':("donation.value.label"),'default':("Value")],-1)
printHtmlPart(3)
invokeTag('field','g',93,['disabled':(""),'class':("form-control"),'name':("value"),'value':(fieldValue(bean: donationInstance, field: 'value')),'required':("")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'value', 'error'))
printHtmlPart(2)
invokeTag('message','g',103,['code':("donation.value.label"),'default':("Value")],-1)
printHtmlPart(3)
invokeTag('field','g',105,['disabled':(""),'class':("form-control"),'name':("value"),'value':(fieldValue(bean: donationInstance, field: 'value')),'required':("")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: donationInstance, field: 'date', 'error'))
printHtmlPart(2)
invokeTag('message','g',115,['code':("donation.date.label"),'default':("Date")],-1)
printHtmlPart(3)
invokeTag('datePicker','g',117,['class':("form-control"),'name':("date"),'precision':("day"),'value':(donationInstance?.date)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'date', 'error'))
printHtmlPart(2)
invokeTag('message','g',127,['code':("donation.date.label"),'default':("Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',130,['class':("form-control"),'name':("date"),'precision':("day"),'value':(donationInstance?.date)],-1)
printHtmlPart(7)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'date', 'error'))
printHtmlPart(2)
invokeTag('message','g',140,['code':("donation.date.label"),'default':("Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',143,['class':("form-control"),'name':("date"),'precision':("day"),'value':(donationInstance?.date)],-1)
printHtmlPart(7)
}
printHtmlPart(0)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: donationInstance, field: 'donator', 'error'))
printHtmlPart(2)
invokeTag('message','g',153,['code':("donation.donator.label"),'default':("Donator")],-1)
printHtmlPart(3)
invokeTag('select','g',155,['class':("many-to-one"),'id':("donator"),'name':("donator.id"),'from':(network.klwcin.security.User.list()),'optionKey':("id"),'required':(""),'value':(donationInstance?.donator?.id)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'donator', 'error'))
printHtmlPart(2)
invokeTag('message','g',165,['code':("donation.donator.label"),'default':("Donator")],-1)
printHtmlPart(6)
invokeTag('select','g',168,['disabled':(""),'class':("many-to-one"),'id':("donator"),'name':("donator.id"),'from':(network.klwcin.security.User.list()),'optionKey':("id"),'required':(""),'value':(donationInstance?.donator?.id)],-1)
printHtmlPart(7)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: donationInstance, field: 'donator', 'error'))
printHtmlPart(2)
invokeTag('message','g',178,['code':("donation.donator.label"),'default':("Donator")],-1)
printHtmlPart(6)
invokeTag('select','g',181,['disabled':(""),'class':("many-to-one"),'id':("donator"),'name':("donator.id"),'from':(network.klwcin.security.User.list()),'optionKey':("id"),'required':(""),'value':(donationInstance?.donator?.id)],-1)
printHtmlPart(7)
}
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415805927825L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
