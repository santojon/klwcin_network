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
invokeTag('select','g',28,['name':("type"),'from':(userInstance.constraints.type.inList),'required':(""),'value':(userInstance?.type),'valueMessagePrefix':("user.type")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("username"),'required':(""),'value':(userInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("password"),'required':(""),'value':(userInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountExpired', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',55,['name':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'accountLocked', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("user.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',64,['name':("accountLocked"),'value':(userInstance?.accountLocked)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'enabled', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("user.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',73,['name':("enabled"),'value':(userInstance?.enabled)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'passwordExpired', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',82,['name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407292531695L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
