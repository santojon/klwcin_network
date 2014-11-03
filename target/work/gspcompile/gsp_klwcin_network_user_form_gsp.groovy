import network.klwcin.security.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("user.name.label"),'default':("Name:")],-1)
printHtmlPart(2)
invokeTag('textField','g',6,['class':("form-control"),'name':("name"),'maxlength':("45"),'required':(""),'value':(userInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(1)
invokeTag('message','g',13,['code':("user.email.label"),'default':("Email:")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['class':("form-control"),'name':("email"),'maxlength':("45"),'required':(""),'value':(userInstance?.email)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',23,['code':("user.username.label"),'default':("Username:")],-1)
printHtmlPart(2)
invokeTag('textField','g',24,['class':("form-control"),'name':("username"),'maxlength':("16"),'required':(""),'value':(userInstance?.username)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: userInstance, field: 'phone', 'error'))
printHtmlPart(1)
invokeTag('message','g',31,['code':("user.phone.label"),'default':("Phone:")],-1)
printHtmlPart(2)
invokeTag('textField','g',32,['class':("form-control"),'name':("phone"),'maxlength':("16"),'value':(userInstance?.phone)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(1)
invokeTag('message','g',39,['code':("user.password.label"),'default':("Password:")],-1)
printHtmlPart(2)
invokeTag('passwordField','g',40,['class':("form-control"),'name':("password"),'maxlength':("16"),'required':(""),'value':(userInstance?.password)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: userInstance, field: 'enabled', 'error'))
printHtmlPart(1)
invokeTag('message','g',47,['code':("user.enabled.label"),'default':("Enabled:")],-1)
printHtmlPart(8)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(9)
invokeTag('checkBox','g',50,['name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(10)
}
printHtmlPart(10)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(9)
invokeTag('checkBox','g',53,['disabled':(""),'name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
expressionOut.print(hasErrors(bean: userInstance, field: 'type', 'error'))
printHtmlPart(1)
invokeTag('message','g',64,['code':("user.type.label"),'default':("Type:")],-1)
printHtmlPart(2)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(9)
invokeTag('select','g',66,['class':("form-control"),'name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(10)
}
printHtmlPart(10)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(9)
invokeTag('select','g',69,['class':("form-control"),'disabled':(""),'name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(10)
}
printHtmlPart(12)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountLocked', 'error'))
printHtmlPart(1)
invokeTag('message','g',77,['code':("user.accountLocked.label"),'default':("Account Locked:")],-1)
printHtmlPart(8)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(9)
invokeTag('checkBox','g',80,['name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(10)
}
printHtmlPart(10)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(9)
invokeTag('checkBox','g',83,['disabled':(""),'name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(10)
}
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountExpired', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(15)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(16)
invokeTag('checkBox','g',101,['name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(17)
}
printHtmlPart(17)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(16)
invokeTag('checkBox','g',104,['disabled':(""),'name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(17)
}
printHtmlPart(18)
expressionOut.print(hasErrors(bean: userInstance, field: 'passwordExpired', 'error'))
printHtmlPart(19)
invokeTag('message','g',111,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(15)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(16)
invokeTag('checkBox','g',115,['name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(17)
}
printHtmlPart(17)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(16)
invokeTag('checkBox','g',118,['disabled':(""),'name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(17)
}
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414739871988L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
