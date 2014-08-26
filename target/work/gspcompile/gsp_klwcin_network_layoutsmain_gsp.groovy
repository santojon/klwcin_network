import network.klwcin.security.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',11,['default':("KLWCIn Network")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'Icon.png'))
printHtmlPart(3)
expressionOut.print(assetPath(src: 'Icon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'Icon.png'))
printHtmlPart(5)
invokeTag('stylesheet','asset',16,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',18,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',19,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
invokeTag('image','asset',22,['src':("logo_full.png"),'alt':("KLWCIn logo")],-1)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
expressionOut.print(createLink(uri: '/user'))
printHtmlPart(11)
expressionOut.print(createLink(uri: '/meeting'))
printHtmlPart(12)
expressionOut.print(createLink(uri: '/finance'))
printHtmlPart(13)
expressionOut.print(createLink(uri: '/j_spring_security_logout'))
printHtmlPart(14)
expressionOut.print(User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id))
printHtmlPart(15)
expressionOut.print(session.SPRING_SECURITY_CONTEXT.authentication.principal.username)
printHtmlPart(16)
expressionOut.print(createLink(uri: '/login/auth'))
printHtmlPart(17)
})
invokeTag('form','g',35,['controller':("user"),'action':("edit"),'id':(session.SPRING_SECURITY_CONTEXT.authentication.principal.id)],2)
printHtmlPart(18)
invokeTag('layoutBody','g',38,[:],-1)
printHtmlPart(19)
invokeTag('message','g',40,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',41,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409021019768L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
