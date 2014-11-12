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
