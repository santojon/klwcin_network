<%@ page import="network.klwcin.security.User" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="KLWCIn Network"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'icon.png')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'icon.png')}">
		
		<!-- Application javascript -->
		<asset:javascript src="application.js"/>
		
		<!-- Bootstrap core CSS -->
		<asset:stylesheet src="bootstrap.css"/>
		
		<!-- Custom styles for this template -->
		<asset:stylesheet src="application.css"/>
		<asset:stylesheet src="footer.css"/>
		<asset:stylesheet src="font-awesome.min.css"/>
		
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
			<asset:javascript src="html5shiv.js"/>
			<asset:javascript src="respond.min.js"/>
		<![endif]-->
		
		<g:layoutHead/>
	</head>
	<body onload="init('${resource()}'); setActive('${controllerName}');">
		<!-- HEADER -->
			<g:render template="/layouts/header" model="systemConfigurationInstance: network.klwcin.configuration.SystemConfiguration.getConfig()" /> <!-- systemConfigurations -->
		<!-- / HEADER -->
		
		<!-- NAVIGATION -->
			<g:render template="/layouts/navigation" />
		<!-- / NAVIGATION -->
		
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
		<g:layoutBody/>
		
		<!-- FOOTER -->
		<div id="footer">
			<div class="container">
				<a href="${createLink(uri: '/chat')}" id="chat" title="Network chat"><span class="pull-right glyphicon glyphicon-comment"></span></a>
				<p class="copy">Copyright &copy; 2014 KLWCIn. All rights reserved.</p>
			</div>
		</div>
		<!-- / FOOTER -->
		
		<asset:javascript src="klwcin.js"/>
		<asset:javascript src="jquery.js"/>
		<asset:javascript src="jquery.mask.js"/>
		<asset:javascript src="bootstrap.min.js"/>
	</body>
</html>
