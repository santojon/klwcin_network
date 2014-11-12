import network.klwcin.business.Expense
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_expenseindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/expense/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'expense.label', default: 'Expense'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
createClosureForHtmlPart(6, 3)
invokeTag('form','g',28,['url':([controller: 'expense', action:'create']),'method':("POST"),'id':("create_form")],3)
printHtmlPart(7)
})
invokeTag('ifAllGranted','sec',30,['roles':("ROLE_ADMIN")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(params.search)
printHtmlPart(10)
})
invokeTag('form','g',38,['method':("GET")],2)
printHtmlPart(11)
invokeTag('render','g',45,['template':("/general/show-flash-messages")],-1)
printHtmlPart(12)
invokeTag('render','g',49,['template':("/general/pagination-header"),'model':(['myList':expenseInstanceList, 'paginationId':'pagination_top'])],-1)
printHtmlPart(13)
expressionOut.print(expenseInstanceList)
printHtmlPart(14)
invokeTag('sortableColumn','g',64,['property':("description"),'title':(message(code: 'expense.description.label', default: 'Description')),'params':([search: params.search])],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',66,['property':("value"),'title':(message(code: 'expense.value.label', default: 'Value')),'params':([search: params.search])],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',68,['property':("date"),'title':(message(code: 'expense.date.label', default: 'Date')),'params':([search: params.search])],-1)
printHtmlPart(16)
if(true && (expenseInstanceList == null)) {
printHtmlPart(17)
}
printHtmlPart(18)
loop:{
int i = 0
for( expenseInstance in (expenseInstanceList) ) {
printHtmlPart(19)
expressionOut.print(i)
printHtmlPart(20)
expressionOut.print(expenseInstance.id)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: expenseInstance, field: "description"))
printHtmlPart(22)
expressionOut.print(expenseInstance.id)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: expenseInstance, field: "value"))
printHtmlPart(22)
expressionOut.print(expenseInstance.id)
printHtmlPart(21)
invokeTag('formatDate','g',91,['format':("dd/MM/yy"),'date':(expenseInstance.date)],-1)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
createTagBody(4, {->
printHtmlPart(25)
expressionOut.print(expenseInstance.id)
printHtmlPart(26)
})
invokeTag('form','g',97,['url':([controller: 'expense', resource:expenseInstance, action:'delete']),'method':("DELETE"),'id':("remove-form-${expenseInstance.id}")],4)
printHtmlPart(27)
})
invokeTag('ifAllGranted','sec',98,['roles':("ROLE_ADMIN")],3)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
invokeTag('render','g',110,['template':("/general/pagination-header"),'model':(['myList':expenseInstanceList, 'paginationId':'pagination_top'])],-1)
printHtmlPart(30)
invokeTag('render','g',117,['template':("modal-confirm-remove")],-1)
printHtmlPart(31)
invokeTag('javascript','asset',120,['src':("expense.js")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',123,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415771901800L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 22, 22, 24, 24, 28, 28, 28, 30, 30, 30, 34, 34, 34, 34, 38, 38, 38, 45, 45, 49, 49, 52, 52, 64, 66, 66, 68, 68, 68, 76, 76, 81, 81, 84, 84, 84, 84, 85, 85, 87, 87, 87, 87, 89, 89, 89, 89, 91, 91, 91, 91, 95, 95, 96, 96, 96, 96, 97, 97, 98, 98, 98, 98, 101, 101, 101, 101, 110, 110, 117, 117, 120, 120, 123, 123, 123, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
