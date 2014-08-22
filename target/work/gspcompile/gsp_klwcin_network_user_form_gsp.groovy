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
invokeTag('message','g',7,['code':("user.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("45"),'required':(""),'value':(userInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['type':("email"),'name':("email"),'required':(""),'value':(userInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'type', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.type.label"),'default':("Type")],-1)
printHtmlPart(2)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('select','g',29,['name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('select','g',32,['disabled':(""),'name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(7)
}
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'phone', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("user.phone.label"),'default':("Phone")],-1)
printHtmlPart(9)
invokeTag('textField','g',41,['name':("phone"),'maxlength':("16"),'value':(userInstance?.phone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(10)
invokeTag('message','g',47,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("username"),'required':(""),'value':(userInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(11)
invokeTag('message','g',56,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',59,['name':("password"),'required':(""),'value':(userInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountExpired', 'error'))
printHtmlPart(12)
invokeTag('message','g',65,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(13)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',69,['name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',72,['disabled':(""),'name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(7)
}
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountLocked', 'error'))
printHtmlPart(14)
invokeTag('message','g',79,['code':("user.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(13)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',83,['name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',86,['disabled':(""),'name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(7)
}
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'enabled', 'error'))
printHtmlPart(15)
invokeTag('message','g',93,['code':("user.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(13)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',97,['name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',100,['disabled':(""),'name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(7)
}
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'passwordExpired', 'error'))
printHtmlPart(16)
invokeTag('message','g',107,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(13)
if(true && (User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',111,['name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor"))) {
printHtmlPart(6)
invokeTag('checkBox','g',114,['disabled':(""),'name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(7)
}
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408672861114L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
