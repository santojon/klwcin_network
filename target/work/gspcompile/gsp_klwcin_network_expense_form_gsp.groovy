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
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'description', 'error'))
printHtmlPart(2)
invokeTag('message','g',7,['code':("expense.description.label"),'default':("Description")],-1)
printHtmlPart(3)
invokeTag('textField','g',9,['class':("form-control"),'name':("description"),'maxlength':("100"),'required':(""),'value':(expenseInstance?.description)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'description', 'error'))
printHtmlPart(2)
invokeTag('message','g',19,['code':("expense.description.label"),'default':("Description")],-1)
printHtmlPart(3)
invokeTag('textField','g',21,['disabled':(""),'class':("form-control"),'name':("description"),'maxlength':("100"),'required':(""),'value':(expenseInstance?.description)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'description', 'error'))
printHtmlPart(2)
invokeTag('message','g',31,['code':("expense.description.label"),'default':("Description")],-1)
printHtmlPart(3)
invokeTag('textField','g',33,['disabled':(""),'class':("form-control"),'name':("description"),'maxlength':("100"),'required':(""),'value':(expenseInstance?.description)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'value', 'error'))
printHtmlPart(2)
invokeTag('message','g',43,['code':("expense.value.label"),'default':("Value")],-1)
printHtmlPart(3)
invokeTag('field','g',45,['class':("form-control"),'name':("value"),'value':(fieldValue(bean: expenseInstance, field: 'value')),'required':("")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'value', 'error'))
printHtmlPart(2)
invokeTag('message','g',55,['code':("expense.value.label"),'default':("Value")],-1)
printHtmlPart(3)
invokeTag('field','g',57,['disabled':(""),'class':("form-control"),'name':("value"),'value':(fieldValue(bean: expenseInstance, field: 'value')),'required':("")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'value', 'error'))
printHtmlPart(2)
invokeTag('message','g',67,['code':("expense.value.label"),'default':("Value")],-1)
printHtmlPart(3)
invokeTag('field','g',69,['disabled':(""),'class':("form-control"),'name':("value"),'value':(fieldValue(bean: expenseInstance, field: 'value')),'required':("")],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'date', 'error'))
printHtmlPart(2)
invokeTag('message','g',79,['code':("expense.date.label"),'default':("Date")],-1)
printHtmlPart(3)
invokeTag('datePicker','g',81,['class':("form-control"),'name':("date"),'precision':("day"),'value':(expenseInstance?.date)],-1)
printHtmlPart(4)
}
printHtmlPart(0)
if(true && ('[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'date', 'error'))
printHtmlPart(2)
invokeTag('message','g',91,['code':("expense.date.label"),'default':("Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',94,['class':("form-control"),'name':("date"),'precision':("day"),'value':(expenseInstance?.date)],-1)
printHtmlPart(7)
}
printHtmlPart(0)
if(true && ('[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expenseInstance, field: 'date', 'error'))
printHtmlPart(2)
invokeTag('message','g',104,['code':("expense.date.label"),'default':("Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',107,['class':("form-control"),'name':("date"),'precision':("day"),'value':(expenseInstance?.date)],-1)
printHtmlPart(7)
}
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415806081002L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 5, 5, 7, 7, 9, 9, 13, 15, 15, 15, 17, 17, 19, 19, 21, 21, 25, 27, 27, 27, 29, 29, 31, 31, 33, 33, 37, 39, 39, 39, 41, 41, 43, 43, 45, 45, 49, 51, 51, 51, 53, 53, 55, 55, 57, 57, 61, 63, 63, 63, 65, 65, 67, 67, 69, 69, 73, 75, 75, 75, 77, 77, 79, 79, 81, 81, 85, 87, 87, 87, 89, 89, 91, 91, 94, 94, 98, 100, 100, 100, 102, 102, 104, 104, 107, 107, 111, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
