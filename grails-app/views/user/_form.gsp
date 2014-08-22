<%@ page import="network.klwcin.security.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="user.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="45" required="" value="${userInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${userInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="user.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:select name="type" from="${userInstance.constraints.type.inList}" required="" value="${userInstance?.type}" valueMessagePrefix="user.type"/>
	</g:if>
	<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:select disabled="" name="type" from="${userInstance.constraints.type.inList}" required="" value="${userInstance?.type}" valueMessagePrefix="user.type"/>
	</g:if>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'phone', 'error')}">
	<label for="phone">
		<g:message code="user.phone.label" default="Phone" />
	</label>
	<g:textField name="phone" maxlength="16" value="${userInstance?.phone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="user.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${userInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${userInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'accountExpired', 'error')} ">
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

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'accountLocked', 'error')} ">
	<label for="accountLocked">
		<g:message code="user.accountLocked.label" default="Account Locked" />
		
	</label>
	<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox name="accountLocked" value="${userInstance?.accountLocked}" />
	</g:if>
	<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox disabled="" name="accountLocked" value="${userInstance?.accountLocked}" />
	</g:if>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'enabled', 'error')} ">
	<label for="enabled">
		<g:message code="user.enabled.label" default="Enabled" />
		
	</label>
	<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox name="enabled" value="${userInstance?.enabled}" />
	</g:if>
	<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
		<g:checkBox disabled="" name="enabled" value="${userInstance?.enabled}" />
	</g:if>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'passwordExpired', 'error')} ">
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
