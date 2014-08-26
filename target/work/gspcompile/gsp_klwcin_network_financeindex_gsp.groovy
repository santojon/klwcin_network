import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_financeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/finance/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',84,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',89,['property':("next"),'title':(message(code: 'Last Donations and Expenses'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',90,['property':("next1"),'title':(message(code: ' '))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',91,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',92,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',93,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(8)
invokeTag('sortableColumn','g',97,['property':("donator"),'title':(message(code: 'Donator or Expenser'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',98,['property':("type"),'title':(message(code: 'donation.type.label', default: 'Type'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',99,['property':("description"),'title':(message(code: 'donation.description.label', default: 'Description'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',100,['property':("date"),'title':(message(code: 'donation.date.label', default: 'Date'))],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',101,['property':("total"),'title':(message(code: 'Value R$'))],-1)
printHtmlPart(10)
loop:{
int i = 0
for( donationInstance in (donations) ) {
printHtmlPart(11)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(12)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: donationInstance, field: "donator"))
})
invokeTag('link','g',109,['action':("showDonation"),'id':(donationInstance.id)],3)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: donationInstance, field: "type"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: donationInstance, field: "description"))
printHtmlPart(14)
invokeTag('formatDate','g',112,['format':("dd/MM/yy"),'date':(donationInstance.date)],-1)
printHtmlPart(14)
expressionOut.print(donationInstance.value)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
loop:{
int i = 0
for( expenseInstance in (expenses) ) {
printHtmlPart(11)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(12)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',120,['action':("showExpense"),'id':(expenseInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: expenseInstance, field: "description"))
printHtmlPart(14)
invokeTag('formatDate','g',123,['format':("dd/MM/yy"),'date':(expenseInstance.date)],-1)
printHtmlPart(14)
expressionOut.print(expenseInstance.value)
printHtmlPart(15)
i++
}
}
printHtmlPart(19)
invokeTag('sortableColumn','g',129,['property':("next1"),'title':(message(code: ' '))],-1)
printHtmlPart(20)
invokeTag('sortableColumn','g',130,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(20)
invokeTag('sortableColumn','g',131,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(20)
invokeTag('sortableColumn','g',132,['property':("next2"),'title':(message(code: 'Balance:'))],-1)
printHtmlPart(21)
expressionOut.print(balance)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
expressionOut.print(createLink(controller: 'donation', action: 'create'))
printHtmlPart(24)
})
invokeTag('form','g',142,['controller':("expense"),'action':("create")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',144,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1409022242571L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
