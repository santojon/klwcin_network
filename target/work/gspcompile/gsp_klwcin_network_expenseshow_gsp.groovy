import network.klwcin.business.Expense
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_expenseshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/expense/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
expressionOut.print(createLink(uri: '/expense'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/expense/create'))
printHtmlPart(6)
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (expenseInstance?.description)) {
printHtmlPart(13)
invokeTag('message','g',27,['code':("expense.description.label"),'default':("Description")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',29,['bean':(expenseInstance),'field':("description")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (expenseInstance?.value.round(2))) {
printHtmlPart(17)
invokeTag('message','g',36,['code':("expense.value.label"),'default':("Value")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',38,['bean':(expenseInstance),'field':("value")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (expenseInstance?.date)) {
printHtmlPart(19)
invokeTag('message','g',45,['code':("expense.date.label"),'default':("Date")],-1)
printHtmlPart(20)
invokeTag('formatDate','g',47,['format':("dd/MM/yy"),'date':(donationInstance?.date)],-1)
printHtmlPart(15)
}
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
createTagBody(3, {->
invokeTag('message','g',55,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',55,['class':("edit"),'action':("edit"),'resource':(expenseInstance)],3)
printHtmlPart(23)
invokeTag('actionSubmit','g',56,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(24)
})
invokeTag('form','g',58,['url':([resource:expenseInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409702835811L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
