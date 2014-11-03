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
invokeTag('sortableColumn','g',43,['property':("place"),'title':(message(code: 'meeting.place.label', default: 'Place'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',44,['property':("date"),'title':(message(code: 'meeting.date.label', default: 'Date'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',45,['property':("type"),'title':(message(code: 'meeting.type.label', default: 'Type'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',46,['property':("total"),'title':(message(code: 'Total of participants'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',47,['property':("description"),'title':(message(code: 'meeting.description.label', default: 'Description'))],-1)
printHtmlPart(6)
if(true && (meetings == [])) {
printHtmlPart(7)
}
printHtmlPart(8)
loop:{
int i = 0
for( meetingInstance in (meetings) ) {
printHtmlPart(9)
expressionOut.print(i)
printHtmlPart(10)
expressionOut.print(meetingInstance.id)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "place"))
printHtmlPart(12)
expressionOut.print(meetingInstance.id)
printHtmlPart(11)
invokeTag('formatDate','g',65,['format':("dd/MM/yy - HH:mm"),'date':(meetingInstance.date)],-1)
printHtmlPart(12)
expressionOut.print(meetingInstance.id)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "type"))
printHtmlPart(12)
expressionOut.print(meetingInstance.id)
printHtmlPart(11)
expressionOut.print(meetingInstance.participants.size())
printHtmlPart(12)
expressionOut.print(meetingInstance.id)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "description"))
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
loop:{
int i = 0
for( userInstance in (users) ) {
printHtmlPart(5)
if(true && (userInstance.type == 'Counselor')) {
printHtmlPart(15)
expressionOut.print(userInstance.name)
printHtmlPart(16)
expressionOut.print(userInstance.username)
printHtmlPart(17)
}
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
loop:{
int i = 0
for( userInstance in (users) ) {
printHtmlPart(5)
if(true && (userInstance.type == 'Common')) {
printHtmlPart(15)
expressionOut.print(userInstance.name)
printHtmlPart(16)
expressionOut.print(userInstance.username)
printHtmlPart(17)
}
printHtmlPart(18)
i++
}
}
printHtmlPart(20)
loop:{
int i = 0
for( userInstance in (users) ) {
printHtmlPart(5)
if(true && (userInstance.type == 'Aspirant')) {
printHtmlPart(15)
expressionOut.print(userInstance.name)
printHtmlPart(16)
expressionOut.print(userInstance.username)
printHtmlPart(17)
}
printHtmlPart(18)
i++
}
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',155,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415029940404L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 7, 43, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 47, 54, 54, 59, 59, 62, 62, 62, 62, 63, 63, 64, 64, 64, 64, 65, 65, 65, 65, 66, 66, 66, 66, 67, 67, 67, 67, 68, 68, 68, 68, 71, 71, 71, 71, 97, 97, 97, 98, 98, 98, 99, 99, 99, 99, 100, 101, 101, 101, 101, 101, 117, 117, 117, 118, 118, 118, 119, 119, 119, 119, 120, 121, 121, 121, 121, 121, 137, 137, 137, 138, 138, 138, 139, 139, 139, 139, 140, 141, 141, 141, 141, 141, 155, 155, 155, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
