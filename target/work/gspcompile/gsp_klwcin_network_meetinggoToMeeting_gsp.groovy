import network.klwcin.business.Meeting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_meetinggoToMeeting_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/goToMeeting.gsp" }
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
invokeTag('message','g',7,['code':("Participate")],-1)
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
invokeTag('message','g',12,['code':("Participate")],-1)
printHtmlPart(4)
invokeTag('hiddenField','g',14,['name':("version"),'value':(meetingInstance?.version)],-1)
printHtmlPart(5)
invokeTag('render','g',18,['template':("/general/show-flash-messages")],-1)
printHtmlPart(6)
invokeTag('render','g',22,['template':("form")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('form','g',35,['url':([resource:meetingInstance, action:'participate']),'method':("PUT")],2)
printHtmlPart(9)
})
invokeTag('captureBody','sitemesh',37,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415140308182L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
