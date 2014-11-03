import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_general_show_flash_messages_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/general/_show-flash-messages.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (flash.message)) {
printHtmlPart(1)
invokeTag('message','g',5,['message':(flash.message)],-1)
printHtmlPart(2)
}
printHtmlPart(3)
if(true && (flash.successMessage)) {
printHtmlPart(4)
invokeTag('message','g',11,['message':(flash.successMessage)],-1)
printHtmlPart(2)
}
printHtmlPart(3)
if(true && (flash.errorMessage)) {
printHtmlPart(5)
invokeTag('message','g',17,['message':(flash.errorMessage)],-1)
printHtmlPart(2)
}
printHtmlPart(3)
if(true && (flash.errors)) {
printHtmlPart(6)
loop:{
int i = 0
for( error in (flash.errors.allErrors) ) {
invokeTag('message','g',23,['message':(error)],-1)
printHtmlPart(7)
i++
}
}
printHtmlPart(2)
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414678077637L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 5, 5, 7, 8, 8, 8, 11, 11, 13, 14, 14, 14, 17, 17, 19, 20, 20, 20, 23, 23, 23, 23, 23, 23, 23, 23, 23, 25, 25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_show-flash-messages.gsp"
)
class ___LineNumberPlaceholder { }
