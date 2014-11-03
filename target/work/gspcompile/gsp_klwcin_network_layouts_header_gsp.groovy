import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_layouts_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/_header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('image','asset',5,['class':("logo-header"),'src':("Icon.png"),'alt':("KLWCIn")],-1)
printHtmlPart(1)
expressionOut.print(createLink(uri: "/user/edit/${session.SPRING_SECURITY_CONTEXT.authentication.principal.id}"))
printHtmlPart(2)
invokeTag('loggedInUserInfo','sec',9,['field':("username")],-1)
printHtmlPart(3)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(4)
expressionOut.print(readWriteSysConfig)
printHtmlPart(5)
}
printHtmlPart(6)
expressionOut.print(createLink(uri: '/j_spring_security_logout'))
printHtmlPart(7)
expressionOut.print(createLink(uri: '/logout'))
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415018067085L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 9, 9, 9, 9, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_header.gsp"
)
class ___LineNumberPlaceholder { }
