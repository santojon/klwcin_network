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
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('form','g',24,['url':([controller: 'donation', action:'create']),'method':("POST"),'id':("create_form")],2)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('form','g',32,['url':([controller: 'expense', action:'create']),'method':("POST"),'id':("create_form")],2)
printHtmlPart(8)
invokeTag('sortableColumn','g',45,['property':("donator"),'title':("Donator or Expenser")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',46,['property':("type"),'title':("Type")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',47,['property':("description"),'title':("Description")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',48,['property':("date"),'title':("Date")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',49,['property':("total"),'title':("Value R\$")],-1)
printHtmlPart(10)
if(true && (donations.size() == 0 && expenses.size() == 0)) {
printHtmlPart(11)
}
printHtmlPart(12)
loop:{
int i = 0
for( donaionInstance in (donations) ) {
printHtmlPart(13)
expressionOut.print(i)
printHtmlPart(14)
expressionOut.print(fieldValue(bean: donationInstance, field: "donator"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: donationInstance, field: "type"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: donationInstance, field: "description"))
printHtmlPart(15)
invokeTag('formatDate','g',69,['format':("dd/MM/yy"),'date':(donationInstance.date)],-1)
printHtmlPart(15)
expressionOut.print(donationInstance.value.round(2))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
loop:{
int i = 0
for( expenseInstance in (expenses) ) {
printHtmlPart(13)
expressionOut.print(i)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: expenseInstance, field: "description"))
printHtmlPart(19)
invokeTag('formatDate','g',79,['format':("dd/MM/yy"),'date':(expenseInstance.date)],-1)
printHtmlPart(19)
expressionOut.print(expenseInstance.value.round(2))
printHtmlPart(16)
i++
}
}
printHtmlPart(20)
expressionOut.print(balance.round(2))
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',101,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414980922186L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
