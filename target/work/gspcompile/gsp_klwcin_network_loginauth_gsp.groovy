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
})
invokeTag('captureHead','sitemesh',124,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',133,['code':("springSecurity.login.header")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print(postUrl)
printHtmlPart(9)
invokeTag('message','g',142,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(10)
invokeTag('message','g',147,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(11)
expressionOut.print(rememberMeParameter)
printHtmlPart(12)
if(true && (hasCookie)) {
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('message','g',153,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(15)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',169,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408710551504L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
