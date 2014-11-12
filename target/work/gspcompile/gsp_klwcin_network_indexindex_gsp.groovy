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
invokeTag('sortableColumn','g',35,['property':("place"),'title':(message(code: 'meeting.place.label', default: 'Place'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',36,['property':("date"),'title':(message(code: 'meeting.date.label', default: 'Date'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',37,['property':("type"),'title':(message(code: 'meeting.type.label', default: 'Type'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',38,['property':("total"),'title':(message(code: 'Total of participants'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',39,['property':("description"),'title':(message(code: 'meeting.description.label', default: 'Description'))],-1)
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
invokeTag('formatDate','g',57,['format':("dd/MM/yy - HH:mm"),'date':(meetingInstance.date)],-1)
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
invokeTag('captureBody','sitemesh',153,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415774342221L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
