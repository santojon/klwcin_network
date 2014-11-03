			<div class="header header-bg clearfix">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<a href="http://www.cin.ufpe.br/~jgs/klwcin.html" title="Our Static Page"><asset:image class="logo-header" src="Icon.png" alt="KLWCIn"/></a>
					</div>
					
					<div class="user-profile">
						<a href="${createLink(uri: "/user/edit/${session.SPRING_SECURITY_CONTEXT.authentication.principal.id}")}" id="preferences" title="User Profile" class="a-icon"><span class="fa fa-user"></span> <sec:loggedInUserInfo field="username" /></a>
						<a href="#" id="help" title="Help" class="a-icon"><span class="fa fa-question-circle"></span></a>
						<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
							<a href="#" id="settings" title="System Configuration" class="a-icon"><span class="fa fa-cog" onclick="getSystemConfigurationToModal('#system-config', '${readWriteSysConfig}');"></span></a>
						</g:if>
						<a href="${createLink(uri: '/j_spring_security_logout')}" id="logout" title="Log out" class="a-icon"><span class="fa fa-sign-out"></span></a>
						<!-- <a href="${createLink(uri: '/logout')}" id="logout" title="Log out" class="a-icon"><span class="fa fa-sign-out"></span></a> -->
					</div>
				</div>
			</div>