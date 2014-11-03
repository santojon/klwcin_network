import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_general_pagination_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/general/_pagination-header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
if(true && (myList != null)) {
printHtmlPart(0)
expressionOut.print(myList?.size() ?: 0)
printHtmlPart(1)
invokeTag('set','g',6,['var':("startIndex"),'value':(params.offset? params.offset.toInteger() : 0)],-1)
printHtmlPart(2)
expressionOut.print(startIndex + 1)
printHtmlPart(3)
expressionOut.print(startIndex + myList.size())
printHtmlPart(4)
expressionOut.print(myList.totalCount)
printHtmlPart(5)
expressionOut.print(paginationId ?: 'pagination_div')
printHtmlPart(6)
invokeTag('paginate','g',10,['class':("teste"),'controller':(controller),'action':("index"),'total':(myList.totalCount),'params':([search: params.search])],-1)
printHtmlPart(7)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414517558000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 6, 6, 7, 7, 7, 7, 7, 7, 9, 9, 10, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_pagination-header.gsp"
)
class ___LineNumberPlaceholder { }
