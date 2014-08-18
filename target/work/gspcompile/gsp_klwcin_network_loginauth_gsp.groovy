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
invokeTag('image','asset',130,['src':("icon.png"),'alt':("KLWCIn logo")],-1)
printHtmlPart(5)
invokeTag('message','g',133,['code':("springSecurity.login.header")],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(postUrl)
printHtmlPart(10)
invokeTag('message','g',142,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(11)
invokeTag('message','g',147,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(12)
expressionOut.print(rememberMeParameter)
printHtmlPart(13)
if(true && (hasCookie)) {
printHtmlPart(14)
}
printHtmlPart(15)
invokeTag('message','g',153,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(16)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',169,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408365010119L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
