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
		<link rel="shortcut icon" href="${assetPath(src: 'Icon.png')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'Icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'Icon.png')}">
  		<asset:stylesheet src="application.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>
		<div id="grailsLogo" role="banner">
			<a href="http://www.cin.ufpe.br/~jgs/klwcin.html"><asset:image src="logo_full.png" alt="KLWCIn logo"/>KLWCIn Network</a>
			<div class="nav" role="navigation">
				<form action="${createLink(uri: '/j_spring_security_logout')}">
					<button formaction="${createLink(uri: '/')}">Home</button>
					<button formaction="${createLink(uri: '/user')}">Manage Users</button>
					<button formaction="${createLink(uri: '/meeting')}">Manage Meetings</button>
					<button formaction="${createLink(uri: '/j_spring_security_logout')}" style="float: right;">Logout</button>
					<!-- <button formaction="${createLink(uri: '/login/auth')}" style="float: right;">Login</button> -->
				</form>
			</div>
		</div>
		<g:layoutBody/>
		<div class="footer" role="contentinfo"></div>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
	</body>
</html>
