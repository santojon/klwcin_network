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
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(8)
expressionOut.print(hasErrors(bean: userInstance, field: 'enabled', 'error'))
printHtmlPart(1)
invokeTag('message','g',48,['code':("user.enabled.label"),'default':("Enabled:")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',50,['name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(12)
expressionOut.print(hasErrors(bean: userInstance, field: 'enabled', 'error'))
printHtmlPart(1)
invokeTag('message','g',60,['code':("user.enabled.label"),'default':("Enabled:")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',62,['name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(10)
}
printHtmlPart(13)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(14)
expressionOut.print(hasErrors(bean: userInstance, field: 'type', 'error'))
printHtmlPart(1)
invokeTag('message','g',74,['code':("user.type.label"),'default':("Type:")],-1)
printHtmlPart(15)
invokeTag('select','g',75,['class':("form-control"),'name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(16)
}
printHtmlPart(11)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(17)
expressionOut.print(hasErrors(bean: userInstance, field: 'type', 'error'))
printHtmlPart(18)
invokeTag('message','g',84,['code':("user.type.label"),'default':("Type:")],-1)
printHtmlPart(15)
invokeTag('select','g',85,['class':("form-control"),'name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(19)
}
printHtmlPart(11)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(20)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountLocked', 'error'))
printHtmlPart(1)
invokeTag('message','g',94,['code':("user.accountLocked.label"),'default':("Account Locked:")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',96,['name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(21)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountLocked', 'error'))
printHtmlPart(1)
invokeTag('message','g',106,['code':("user.accountLocked.label"),'default':("Account Locked:")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',108,['name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(10)
}
printHtmlPart(22)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountExpired', 'error'))
printHtmlPart(23)
invokeTag('message','g',121,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(24)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(25)
invokeTag('checkBox','g',125,['name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(26)
}
printHtmlPart(26)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(25)
invokeTag('checkBox','g',128,['disabled':(""),'name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(26)
}
printHtmlPart(27)
expressionOut.print(hasErrors(bean: userInstance, field: 'passwordExpired', 'error'))
printHtmlPart(28)
invokeTag('message','g',135,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(24)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(25)
invokeTag('checkBox','g',139,['name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(26)
}
printHtmlPart(26)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(25)
invokeTag('checkBox','g',142,['disabled':(""),'name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(26)
}
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415665159306L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 5, 5, 6, 6, 12, 12, 13, 13, 14, 14, 22, 22, 23, 23, 24, 24, 30, 30, 31, 31, 32, 32, 38, 38, 39, 39, 40, 40, 45, 45, 47, 47, 48, 48, 50, 50, 55, 57, 57, 57, 59, 59, 60, 60, 62, 62, 67, 67, 71, 71, 73, 73, 74, 74, 75, 75, 79, 81, 81, 81, 83, 83, 84, 84, 85, 85, 89, 91, 91, 91, 93, 93, 94, 94, 96, 96, 101, 103, 103, 103, 105, 105, 106, 106, 108, 108, 113, 113, 119, 119, 121, 121, 124, 125, 125, 126, 126, 127, 127, 128, 128, 129, 129, 129, 133, 133, 135, 135, 138, 139, 139, 140, 140, 141, 141, 142, 142, 143, 143, 143, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
