import network.klwcin.security.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_klwcin_network_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',11,['default':("KLWCIn Network")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'icon.png'))
printHtmlPart(3)
expressionOut.print(assetPath(src: 'icon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'icon.png'))
printHtmlPart(5)
invokeTag('javascript','asset',18,['src':("application.js")],-1)
printHtmlPart(6)
invokeTag('stylesheet','asset',21,['src':("bootstrap.css")],-1)
printHtmlPart(7)
invokeTag('stylesheet','asset',24,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',25,['src':("footer.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',26,['src':("font-awesome.min.css")],-1)
printHtmlPart(8)
invokeTag('javascript','asset',30,['src':("html5shiv.js")],-1)
printHtmlPart(9)
invokeTag('javascript','asset',31,['src':("respond.min.js")],-1)
printHtmlPart(10)
invokeTag('layoutHead','g',34,[:],-1)
printHtmlPart(11)
})
invokeTag('captureHead','sitemesh',35,[:],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
invokeTag('render','g',38,['template':("/layouts/header"),'model':("systemConfigurationInstance: network.klwcin.configuration.SystemConfiguration.getConfig()")],-1)
printHtmlPart(13)
invokeTag('render','g',42,['template':("/layouts/navigation")],-1)
printHtmlPart(14)
invokeTag('message','g',45,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(15)
invokeTag('layoutBody','g',46,[:],-1)
printHtmlPart(16)
invokeTag('javascript','asset',56,['src':("klwcin.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',57,['src':("jquery.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',58,['src':("jquery.mask.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',59,['src':("bootstrap.min.js")],-1)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',60,['onload':("init('${resource()}'); setActive('${controllerName}');")],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415029940442L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 18, 18, 21, 21, 24, 25, 25, 26, 26, 26, 30, 31, 31, 31, 34, 35, 35, 35, 36, 38, 38, 38, 38, 42, 42, 45, 45, 46, 46, 56, 57, 57, 58, 58, 59, 59, 60, 60, 60, 60, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "main.gsp"
)
class ___LineNumberPlaceholder { }
