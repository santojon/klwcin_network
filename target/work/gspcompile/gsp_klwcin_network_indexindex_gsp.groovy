import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_indexindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/index.gsp" }
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
expressionOut.print(users.size())
printHtmlPart(7)
loop:{
int i = 0
for( userInstance in (users) ) {
printHtmlPart(8)
if(true && (userInstance.type == 'Counselor')) {
printHtmlPart(9)
expressionOut.print(userInstance.name)
printHtmlPart(10)
}
printHtmlPart(11)
i++
}
}
printHtmlPart(12)
invokeTag('sortableColumn','g',112,['property':("next"),'title':(message(code: 'Next Meetings'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',113,['property':("next1"),'title':(message(code: ' '))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',114,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',115,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',116,['property':("next2"),'title':(message(code: ' '))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',120,['property':("place"),'title':(message(code: 'meeting.place.label', default: 'Place'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',121,['property':("date"),'title':(message(code: 'meeting.date.label', default: 'Date'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',122,['property':("type"),'title':(message(code: 'meeting.type.label', default: 'Type'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',123,['property':("total"),'title':(message(code: 'Total of participants'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',124,['property':("description"),'title':(message(code: 'meeting.description.label', default: 'Description'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( meetingInstance in (meetings) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: meetingInstance, field: "place"))
})
invokeTag('link','g',132,['action':("showMeeting"),'id':(meetingInstance.id)],3)
printHtmlPart(18)
invokeTag('formatDate','g',133,['format':("dd/MM/yy - hh:mm"),'date':(meetingInstance.date)],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: meetingInstance, field: "type"))
printHtmlPart(18)
expressionOut.print(meetingInstance.participants.size())
printHtmlPart(18)
expressionOut.print(fieldValue(bean: meetingInstance, field: "description"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',143,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408346904875L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
