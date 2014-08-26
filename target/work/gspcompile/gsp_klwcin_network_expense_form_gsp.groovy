import network.klwcin.business.Expense
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_expense_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/expense/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'description', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("expense.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("description"),'maxlength':("100"),'required':(""),'value':(expenseInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'value', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("expense.value.label"),'default':("Value")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("value"),'value':(fieldValue(bean: expenseInstance, field: 'value')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'date', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("expense.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("date"),'precision':("day"),'value':(expenseInstance?.date)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409012403536L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
