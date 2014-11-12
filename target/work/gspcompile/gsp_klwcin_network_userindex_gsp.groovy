import network.klwcin.security.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_userindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
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
invokeTag('form','g',27,['url':([controller: 'user', action:'create']),'method':("POST"),'id':("create_form")],3)
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
invokeTag('render','g',48,['template':("/general/pagination-header"),'model':(['myList':userInstanceList, 'paginationId':'pagination_top'])],-1)
printHtmlPart(12)
expressionOut.print(userInstanceList?.size() ?: 0)
printHtmlPart(13)
invokeTag('sortableColumn','g',61,['property':("username"),'title':("Username"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',62,['property':("name"),'title':("Name"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',63,['property':("phone"),'title':("Phone number"),'params':([search: params.search])],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',64,['property':("email"),'title':("Email address"),'params':([search: params.search])],-1)
printHtmlPart(15)
if(true && (userInstanceList == null)) {
printHtmlPart(16)
}
printHtmlPart(17)
loop:{
int i = 0
for( userInstance in (userInstanceList) ) {
printHtmlPart(18)
expressionOut.print(i)
printHtmlPart(19)
expressionOut.print(userInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: userInstance, field: "username"))
printHtmlPart(21)
expressionOut.print(userInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: userInstance, field: "name"))
printHtmlPart(21)
expressionOut.print(userInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: userInstance, field: "phone"))
printHtmlPart(21)
expressionOut.print(userInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: userInstance, field: "email"))
printHtmlPart(22)
if(true && ('[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString())) {
printHtmlPart(23)
createTagBody(4, {->
printHtmlPart(24)
expressionOut.print(userInstance.name)
printHtmlPart(25)
expressionOut.print(userInstance.id)
printHtmlPart(26)
})
invokeTag('form','g',89,['url':([controller: 'user', resource:userInstance, action:'delete']),'method':("DELETE"),'id':("remove-form-${userInstance.id}")],4)
printHtmlPart(14)
}
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('render','g',102,['template':("/general/pagination-header"),'model':(['myList':userInstanceList, 'paginationId':'pagination_bottom'])],-1)
printHtmlPart(29)
invokeTag('render','g',109,['template':("modal-confirm-remove")],-1)
printHtmlPart(30)
invokeTag('javascript','asset',112,['src':("user.js")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415664833858L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 21, 21, 21, 21, 27, 27, 27, 29, 29, 33, 33, 33, 33, 37, 37, 37, 44, 44, 48, 48, 51, 51, 61, 62, 62, 63, 63, 64, 64, 64, 71, 71, 76, 76, 79, 79, 79, 79, 80, 80, 81, 81, 81, 81, 82, 82, 82, 82, 83, 83, 83, 83, 84, 84, 84, 84, 86, 87, 88, 88, 88, 88, 88, 88, 89, 89, 90, 90, 90, 93, 93, 93, 93, 102, 102, 109, 109, 112, 112, 115, 115, 115, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
