import network.klwcin.business.Donation
import network.klwcin.business.Expense
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
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('form','g',27,['url':([controller: 'donation', action:'create']),'method':("POST"),'id':("create_donation_form")],3)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('form','g',35,['url':([controller: 'expense', action:'create']),'method':("POST"),'id':("create_expense_form")],3)
printHtmlPart(10)
})
invokeTag('ifAllGranted','sec',37,['roles':("ROLE_ADMIN")],2)
printHtmlPart(11)
invokeTag('sortableColumn','g',51,['property':("donator"),'title':("Donator or Expenser")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',52,['property':("type"),'title':("Type")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',53,['property':("description"),'title':("Description")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',54,['property':("date"),'title':("Date")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',55,['property':("total"),'title':("Value R\$")],-1)
printHtmlPart(13)
if(true && (donations.size() == 0 && expenses.size() == 0)) {
printHtmlPart(14)
}
printHtmlPart(15)
loop:{
int i = 0
for( donationInstance in (donations) ) {
printHtmlPart(16)
expressionOut.print(i)
printHtmlPart(17)
expressionOut.print(donationInstance.id)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: donationInstance, field: "donator"))
printHtmlPart(19)
expressionOut.print(donationInstance.id)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: donationInstance, field: "type"))
printHtmlPart(19)
expressionOut.print(donationInstance.id)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: donationInstance, field: "description"))
printHtmlPart(19)
expressionOut.print(donationInstance.id)
printHtmlPart(18)
invokeTag('formatDate','g',75,['format':("dd/MM/yy"),'date':(donationInstance?.date)],-1)
printHtmlPart(19)
expressionOut.print(donationInstance.id)
printHtmlPart(18)
expressionOut.print(donationInstance?.value.round(2))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
loop:{
int i = 0
for( expenseInstance in (expenses) ) {
printHtmlPart(16)
expressionOut.print(i)
printHtmlPart(22)
expressionOut.print(expenseInstance.id)
printHtmlPart(23)
expressionOut.print(expenseInstance.id)
printHtmlPart(24)
expressionOut.print(expenseInstance.id)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: expenseInstance, field: "description"))
printHtmlPart(25)
expressionOut.print(expenseInstance.id)
printHtmlPart(18)
invokeTag('formatDate','g',86,['format':("dd/MM/yy"),'date':(expenseInstance?.date)],-1)
printHtmlPart(25)
expressionOut.print(expenseInstance.id)
printHtmlPart(18)
expressionOut.print(expenseInstance?.value.round(2))
printHtmlPart(20)
i++
}
}
printHtmlPart(26)
expressionOut.print(balance.round(2))
printHtmlPart(27)
invokeTag('javascript','asset',109,['src':("expense.js")],-1)
printHtmlPart(28)
invokeTag('javascript','asset',110,['src':("donation.js")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',113,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415771805199L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 21, 21, 23, 23, 27, 27, 27, 35, 35, 35, 37, 37, 37, 51, 52, 52, 53, 53, 54, 54, 55, 55, 55, 62, 62, 67, 67, 70, 70, 70, 70, 71, 71, 72, 72, 72, 72, 73, 73, 73, 73, 74, 74, 74, 74, 75, 75, 75, 75, 76, 76, 76, 76, 79, 79, 79, 81, 81, 81, 81, 81, 82, 82, 83, 83, 84, 84, 85, 85, 85, 85, 86, 86, 86, 86, 87, 87, 87, 87, 90, 90, 90, 90, 104, 104, 109, 110, 110, 110, 113, 113, 113, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
