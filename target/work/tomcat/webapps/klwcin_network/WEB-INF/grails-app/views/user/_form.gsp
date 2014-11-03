<%@ page import="network.klwcin.security.User" %>
	<div class="row">
  		<div class="col-lg-7">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.name.label" default="Name:" /></span>
    			<g:textField class="form-control" name="name" maxlength="45" required="" value="${userInstance?.name}"/>
      		</div>
			<br />
		</div>
	 
  		<div class="col-lg-5">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.email.label" default="Email:" /></span>
    			<g:textField class="form-control" name="email" maxlength="45" required="" value="${userInstance?.email}"/>
      		</div>
			<br />
		</div>
	 </div>

	<div class="row">
		<div class="col-lg-3">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.username.label" default="Username:" /></span>
    			<g:textField class="form-control" name="username" maxlength="16" required="" value="${userInstance?.username}"/>
      		</div>
			<br />
		</div>
		
		<div class="col-lg-3">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'phone', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.phone.label" default="Phone:" /></span>
    			<g:textField class="form-control" name="phone" maxlength="16" value="${userInstance?.phone}"/>
      		</div>
			<br />
		</div>
		
		<div class="col-lg-offset-1 col-lg-3">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.password.label" default="Password:" /></span>
    			<g:passwordField class="form-control" name="password" maxlength="16" required="" value="${userInstance?.password}"/>
      		</div>
			<br />
		</div>
		
		<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<div class="col-lg-1">	
			<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'enabled', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.enabled.label" default="Enabled:" /></span>
    			<span class="input-group-addon">
					<g:checkBox name="enabled" value="${userInstance?.enabled}" />
				<br />
				</span>
      		</div>
		</div>
		</g:if>
		
		<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
			<div disabled="" class="col-lg-1">	
			<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'enabled', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.enabled.label" default="Enabled:" /></span>
    			<span class="input-group-addon">
					<g:checkBox name="enabled" value="${userInstance?.enabled}" />
				<br />
				</span>
      		</div>
		</div>
		</g:if>
	 </div>
	 
	 <div class="row">
	 <g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<div class="col-lg-3">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'type', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.type.label" default="Type:" /></span>
					<g:select class="form-control" name="type" from="${userInstance.constraints.type.inList}" required="" value="${userInstance?.type}" valueMessagePrefix="user.type"/>
      		</div>
			<br />
		</div>
		</g:if>
		
		<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
			<div hidden="" class="col-lg-3">
				<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'type', 'error')} required"">
					<span class="input-group-addon"><g:message code="user.type.label" default="Type:" /></span>
					<g:select class="form-control" name="type" from="${userInstance.constraints.type.inList}" required="" value="${userInstance?.type}" valueMessagePrefix="user.type"/>
				</div>
			<br />
		</div>
		</g:if>
		
		<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<div class="col-lg-2">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'accountLocked', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.accountLocked.label" default="Account Locked:" /></span>
    			<span class="input-group-addon">
					<g:checkBox name="accountLocked" value="${userInstance?.accountLocked}" />
				<br />
				</span>
      		</div>
		</div>
		</g:if>
		
		<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
			<div hidden="" class="col-lg-2">
    		<div class="input-group fieldcontain ${hasErrors(bean: userInstance, field: 'accountLocked', 'error')} required"">
    			<span class="input-group-addon"><g:message code="user.accountLocked.label" default="Account Locked:" /></span>
    			<span class="input-group-addon">
					<g:checkBox name="accountLocked" value="${userInstance?.accountLocked}" />
				<br />
				</span>
      		</div>
		</div>
		</g:if>
		
	 </div>

<!-- LIXO -->

<div hidden="true" class="fieldcontain ${hasErrors(bean: userInstance, field: 'accountExpired', 'error')} ">
	<label for="accountExpired">
		<g:message code="user.accountExpired.label" default="Account Expired" />
		
	</label>
	<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox name="accountExpired" value="${userInstance?.accountExpired}" />
	</g:if>
	<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox disabled="" name="accountExpired" value="${userInstance?.accountExpired}" />
	</g:if>

</div>

<div hidden="true" class="fieldcontain ${hasErrors(bean: userInstance, field: 'passwordExpired', 'error')} ">
	<label for="passwordExpired">
		<g:message code="user.passwordExpired.label" default="Password Expired" />
		
	</label>
	<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox name="passwordExpired" value="${userInstance?.passwordExpired}" />
	</g:if>
	<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox disabled="" name="passwordExpired" value="${userInstance?.passwordExpired}" />
	</g:if>

</div>
