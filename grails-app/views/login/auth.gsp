<html>
<head>
	<title><g:message code="springSecurity.login.title"/></title>
		<!-- Bootstrap core CSS -->
		<asset:stylesheet src="bootstrap.css"/>
		<!-- Custom styles for this template -->
		<asset:stylesheet src="application.css"/>
		<asset:stylesheet src="signin.css"/>
		<asset:stylesheet src="font-awesome.min.css"/>
		
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
			<asset:javascript src="html5shiv.js"/>
			<asset:javascript src="respond.min.js"/>
		<![endif]-->
</head>

<body class="login">
<!-- MAIN CONTAINER -->
			<!-- HEADER -->
			<div class="header-login">
			
				<div class="logo-klw">
					<asset:image src="logo_full.png"/>
				</div>
			
			</div>
			<!-- / HEADER -->
			
		<div class="container container-login">
			
				<!-- FORM -->
				<form action="${postUrl}" method="POST" id="loginForm" name="loginForm" autocomplete="off" class="form-horizontal form-signin" role="form">
				
					<!-- PAGE MESSAGES -->
					<g:if test="${flash.message}">
						<div class="alert alert-warning" role="alert">
							<button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
							${flash.message}
						</div>
					</g:if>
					<!-- / PAGE MESSAGES -->
					
					<div class="form-group mBottom15"> <!-- Add class name "has-error" to show error msg -->
						<label for="username" class="sr-only"><g:message code="springSecurity.login.username.label" default="Login" /></label>
						<div class="col-lg-12 pRight15">
							<input type="text" class="form-control" name="j_username" id="username" placeholder="username" autofocus>
							<span class="help-block txt-has-error">This is an error message.</span>
						</div>
					</div>
					
					<div class="form-group"> <!-- Add class name "has-error" to show error msg -->
						<label for="password" class="sr-only"><g:message code="springSecurity.login.password.label" default="Password" /></label>
						<div class="col-lg-12 pRight15">
							<input type="password" class="form-control" name="j_password" id="password" placeholder="password">
							<span class="help-block txt-has-error">This is an error message.</span>
						</div>
					</div>
					
					<p id="remember_me_holder" class="signin-text">
						<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
						<label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>
					</p>
					
					<div class="form-group form-signin-btn">
						<div class="col-lg-12 pRight15">
							<input style="float: right;" type="submit" id="submit" class="btn btn-login" value='${message(code: "springSecurity.login.button")}'/>
						</div>
					</div>
				
				</form>
				<!-- / FORM -->
			
			</div>
		<!-- / MAIN CONTAINER -->
</body>
</html>
