<html>
<head>
	<title><g:message code="springSecurity.login.title"/></title>
	<style type='text/css' media='screen'>
	html {
	background-color: #ddd;
	background-image: -moz-linear-gradient(center top, #aaa, #ddd);
	background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #aaa), color-stop(1, #ddd));
	background-image: linear-gradient(top, #aaa, #ddd);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorStr = '#aaaaaa', EndColorStr = '#dddddd');
	background-repeat: no-repeat;
	height: 100%;
	/* change the box model to exclude the padding from the calculation of 100% height (IE8+) */
	-webkit-box-sizing: border-box;
	   -moz-box-sizing: border-box;
	        box-sizing: border-box;
	}
	
	html.no-cssgradients {
	background-color: #aaa;
	}
	
	.ie6 html {
		height: 100%;
	}
	
	html * {
		margin: 0;
	}
	
	#login {
		margin: 15px 0px;
		padding: 0px;
		text-align: center;
	}

	#login .inner {
		width: 340px;
		padding-bottom: 6px;
		margin: 60px auto;
		text-align: left;
		color: #ffffff;
		background-color: #90342C;
		border: 1px solid #aab;
		background-color: #90342C;
		-moz-box-shadow: 2px 2px 2px #eee;
		-webkit-box-shadow: 2px 2px 2px #eee;
		-khtml-box-shadow: 2px 2px 2px #eee;
		box-shadow: 2px 2px 2px #eee;
	}

	#login .inner .fheader {
		padding: 18px 26px 14px 26px;
		background-color: #90342C;
		margin: 0px 0 14px 0;
		color: #ffffff;
		font-size: 18px;
		font-weight: bold;
		text-align: center;
	}
	
	#login .inner .logo {
		background-color: #90342C;
		text-align: center;
	}

	#login .inner .cssform p {
		clear: left;
		margin: 0;
		padding: 4px 0 3px 0;
		padding-left: 105px;
		margin-bottom: 20px;
		height: 1%;
	}

	#login .inner .cssform input[type='text'] {
		width: 120px;
	}

	#login .inner .cssform label {
		font-weight: bold;
		float: left;
		text-align: right;
		margin-left: -105px;
		width: 110px;
		padding-top: 3px;
		padding-right: 10px;
	}

	#login #remember_me_holder {
		padding-left: 120px;
	}

	#login #submit {
		margin-left: 15px;
	}

	#login #remember_me_holder label {
		float: none;
		margin-left: 0;
		text-align: left;
		width: 200px
	}

	#login .inner .login_message {
		padding: 6px 25px 20px 25px;
		color: #c33;
	}

	#login .inner .text_ {
		width: 120px;
	}

	#login .inner .chk {
		height: 12px;
	}
	
	.login_message_w {
		color: #ffffff;
		margin-left: 15px;
		padding: 6px 25px 20px 25px;
	}
	</style>
</head>

<body>
<div id='login'>
	<div class='inner'>
		<div class='logo'>
			<!-- <asset:image src="icon.png" alt="KLWCIn logo"/> -->
		</div>
		<div class='fheader'>
			<g:message code="springSecurity.login.header"/>
		</div>

		<g:if test='${flash.message}'>
			<div class='login_message_w'>${flash.message}</div>
		</g:if>

		<form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
			<p>
				<label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
				<input type='text' class='text_' name='j_username' id='username'/>
			</p>

			<p>
				<label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
				<input type='password' class='text_' name='j_password' id='password'/>
			</p>

			<p id="remember_me_holder">
				<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
				<label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>
			</p>

			<p>
				<input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
			</p>
		</form>
	</div>
</div>
<script type='text/javascript'>
	<!--
	(function() {
		document.forms['loginForm'].elements['j_username'].focus();
	})();
	// -->
</script>
</body>
</html>
