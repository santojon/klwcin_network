import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',3,['code':("springSecurity.login.title")],-1)
})
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
invokeTag('stylesheet','asset',5,['src':("bootstrap.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',7,['src':("application.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',8,['src':("signin.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',9,['src':("font-awesome.min.css")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',13,['src':("html5shiv.js")],-1)
printHtmlPart(6)
invokeTag('javascript','asset',14,['src':("respond.min.js")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
invokeTag('image','asset',24,['src':("logo_full.png")],-1)
printHtmlPart(10)
expressionOut.print(postUrl)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('message','g',45,['code':("springSecurity.login.username.label"),'default':("Login")],-1)
printHtmlPart(15)
invokeTag('message','g',53,['code':("springSecurity.login.password.label"),'default':("Password")],-1)
printHtmlPart(16)
expressionOut.print(rememberMeParameter)
printHtmlPart(17)
if(true && (hasCookie)) {
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',62,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(20)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',76,['class':("login")],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415140308156L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
