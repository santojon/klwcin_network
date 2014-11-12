import network.klwcin.business.Meeting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_meetingindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'meeting.label', default: 'Meeting'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(4)
createClosureForHtmlPart(5, 3)
invokeTag('form','g',27,['url':([controller: 'meeting', action:'create']),'method':("POST"),'id':("create_form")],3)
printHtmlPart(6)
}
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
expressionOut.print(params.search)
printHtmlPart(9)
})
invokeTag('form','g',37,['method':("GET")],2)
printHtmlPart(10)
invokeTag('render','g',44,['template':("/general/show-flash-messages")],-1)
printHtmlPart(11)
invokeTag('render','g',48,['template':("/general/pagination-header"),'model':(['myList':meetingInstanceList, 'paginationId':'pagination_top'])],-1)
printHtmlPart(12)
expressionOut.print(userInstanceList?.size() ?: 0)
printHtmlPart(13)
invokeTag('sortableColumn','g',61,['property':("place"),'title':("Place"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',62,['property':("description"),'title':("Description"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',63,['property':("type"),'title':("Type"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',64,['property':("date"),'title':("Date"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',65,['property':("creator"),'title':("Creator"),'params':([search: params.search])],-1)
printHtmlPart(15)
if(true && (meetingInstanceList == null)) {
printHtmlPart(16)
}
printHtmlPart(17)
loop:{
int i = 0
for( meetingInstance in (meetingInstanceList) ) {
printHtmlPart(18)
expressionOut.print(i)
printHtmlPart(19)
expressionOut.print(meetingInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: meetingInstance, field: "place"))
printHtmlPart(21)
expressionOut.print(meetingInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: meetingInstance, field: "description"))
printHtmlPart(21)
expressionOut.print(meetingInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: meetingInstance, field: "type"))
printHtmlPart(21)
expressionOut.print(meetingInstance.id)
printHtmlPart(20)
invokeTag('formatDate','g',85,['format':("dd/MM/yy - HH:mm"),'date':(meetingInstance.date)],-1)
printHtmlPart(21)
expressionOut.print(meetingInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: meetingInstance, field: "creator"))
printHtmlPart(22)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(23)
createTagBody(4, {->
printHtmlPart(24)
expressionOut.print(meetingInstance.place)
printHtmlPart(25)
expressionOut.print(meetingInstance.date)
printHtmlPart(26)
expressionOut.print(meetingInstance.id)
printHtmlPart(27)
})
invokeTag('form','g',91,['url':([controller: 'meeting', resource:meetingInstance, action:'delete']),'method':("DELETE"),'id':("remove-form-${meetingInstance.id}")],4)
printHtmlPart(14)
}
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
invokeTag('render','g',104,['template':("/general/pagination-header"),'model':(['myList':meetingInstanceList, 'paginationId':'pagination_bottom'])],-1)
printHtmlPart(30)
invokeTag('render','g',111,['template':("modal-confirm-remove")],-1)
printHtmlPart(31)
invokeTag('javascript','asset',114,['src':("meeting.js")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',117,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415665225151L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
