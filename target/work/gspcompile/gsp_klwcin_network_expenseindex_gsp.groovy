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
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(6)
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',26,['property':("description"),'title':(message(code: 'expense.description.label', default: 'Description'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',28,['property':("value"),'title':(message(code: 'expense.value.label', default: 'Value'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',30,['property':("date"),'title':(message(code: 'expense.date.label', default: 'Date'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( expenseInstance in (expenseInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: expenseInstance, field: "description"))
})
invokeTag('link','g',38,['action':("show"),'id':(expenseInstance.id)],3)
printHtmlPart(15)
expressionOut.print(expenseInstance.value.round(2))
printHtmlPart(15)
invokeTag('formatDate','g',42,['format':("dd/MM/yy"),'date':(expenseInstance?.date)],-1)
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',49,['total':(expenseInstanceCount ?: 0)],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',52,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409702942042L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
