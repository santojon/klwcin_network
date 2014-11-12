import network.klwcin.business.Donation
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_donationindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/donation/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'donation.label', default: 'Donation'))],-1)
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
invokeTag('form','g',28,['url':([controller: 'donation', action:'create']),'method':("POST"),'id':("create_form")],3)
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
invokeTag('render','g',49,['template':("/general/pagination-header"),'model':(['myList':donationInstanceList, 'paginationId':'pagination_top'])],-1)
printHtmlPart(13)
expressionOut.print(donationInstanceList)
printHtmlPart(14)
invokeTag('sortableColumn','g',64,['property':("description"),'title':(message(code: 'donation.description.label', default: 'Description')),'params':([search: params.search])],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',66,['property':("type"),'title':(message(code: 'donation.type.label', default: 'Type')),'params':([search: params.search])],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',68,['property':("value"),'title':(message(code: 'donation.value.label', default: 'Value')),'params':([search: params.search])],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',70,['property':("date"),'title':(message(code: 'donation.date.label', default: 'Date')),'params':([search: params.search])],-1)
printHtmlPart(16)
invokeTag('message','g',72,['code':("donation.donator.label"),'default':("Donator")],-1)
printHtmlPart(17)
if(true && (donationInstanceList == null)) {
printHtmlPart(18)
}
printHtmlPart(19)
loop:{
int i = 0
for( donationInstance in (donationInstanceList) ) {
printHtmlPart(20)
expressionOut.print(i)
printHtmlPart(21)
expressionOut.print(donationInstance.id)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: donationInstance, field: "description"))
printHtmlPart(23)
expressionOut.print(donationInstance.id)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: donationInstance, field: "type"))
printHtmlPart(23)
expressionOut.print(donationInstance.id)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: donationInstance, field: "value"))
printHtmlPart(23)
expressionOut.print(donationInstance.id)
printHtmlPart(22)
invokeTag('formatDate','g',97,['format':("dd/MM/yy"),'date':(donationInstance.date)],-1)
printHtmlPart(23)
expressionOut.print(donationInstance.id)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: donationInstance, field: "donator"))
printHtmlPart(24)
createTagBody(3, {->
printHtmlPart(25)
createTagBody(4, {->
printHtmlPart(26)
expressionOut.print(donationInstance.id)
printHtmlPart(27)
})
invokeTag('form','g',105,['url':([controller: 'donation', resource:donationInstance, action:'delete']),'method':("DELETE"),'id':("remove-form-${donationInstance.id}")],4)
printHtmlPart(28)
})
invokeTag('ifAllGranted','sec',106,['roles':("ROLE_ADMIN")],3)
printHtmlPart(29)
i++
}
}
printHtmlPart(30)
invokeTag('render','g',118,['template':("/general/pagination-header"),'model':(['myList':donationInstanceList, 'paginationId':'pagination_top'])],-1)
printHtmlPart(31)
invokeTag('render','g',125,['template':("modal-confirm-remove")],-1)
printHtmlPart(32)
invokeTag('javascript','asset',128,['src':("donation.js")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',131,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415771912833L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 22, 22, 24, 24, 28, 28, 28, 30, 30, 30, 34, 34, 34, 34, 38, 38, 38, 45, 45, 49, 49, 52, 52, 64, 66, 66, 68, 68, 70, 70, 70, 72, 72, 80, 80, 85, 85, 88, 88, 88, 88, 89, 89, 91, 91, 91, 91, 93, 93, 93, 93, 95, 95, 95, 95, 97, 97, 97, 97, 99, 99, 99, 99, 103, 103, 104, 104, 104, 104, 105, 105, 106, 106, 106, 106, 109, 109, 109, 109, 118, 118, 125, 125, 128, 128, 131, 131, 131, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
