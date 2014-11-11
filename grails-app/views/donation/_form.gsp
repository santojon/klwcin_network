<%@ page import="network.klwcin.business.Donation" %>



<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'description', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.description.label" default="Description" />
		</span>
		<g:textField class="form-control" name="description" maxlength="100" required="" value="${donationInstance?.description}"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'description', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.description.label" default="Description" />
		</span>
		<g:textField class="form-control" name="description" maxlength="100" required="" value="${donationInstance?.description}"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'description', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.description.label" default="Description" />
		</span>
		<g:textField class="form-control" name="description" maxlength="100" required="" value="${donationInstance?.description}"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'type', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.type.label" default="Type" />
		</span>
		<g:select class="form-control" name="type" from="${donationInstance.constraints.type.inList}" required="" value="${donationInstance?.type}" valueMessagePrefix="donation.type"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'type', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.type.label" default="Type" />
		</span>
		<g:select class="form-control" name="type" from="${donationInstance.constraints.type.inList}" required="" value="${donationInstance?.type}" valueMessagePrefix="donation.type"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'type', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.type.label" default="Type" />
		</span>
		<g:select class="form-control" name="type" from="${donationInstance.constraints.type.inList}" required="" value="${donationInstance?.type}" valueMessagePrefix="donation.type"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'value', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.value.label" default="Value" />
		</span>
		<g:field class="form-control" name="value" value="${fieldValue(bean: donationInstance, field: 'value')}" required=""/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'value', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.value.label" default="Value" />
		</span>
		<g:field class="form-control" name="value" value="${fieldValue(bean: donationInstance, field: 'value')}" required=""/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'value', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.value.label" default="Value" />
		</span>
		<g:field class="form-control" name="value" value="${fieldValue(bean: donationInstance, field: 'value')}" required=""/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'date', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.date.label" default="Date" />
		</span>
		<g:datePicker class="form-control" name="date" precision="day"  value="${donationInstance?.date}"  />

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'date', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.date.label" default="Date" />
		</span>
		<g:datePicker class="form-control" name="date" precision="day"  value="${donationInstance?.date}"  />

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'date', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.date.label" default="Date" />
		</span>
		<g:datePicker class="form-control" name="date" precision="day"  value="${donationInstance?.date}"  />

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'donator', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.donator.label" default="Donator" />
		</span>
		<g:select class="form-control" id="donator" name="donator.id" from="${network.klwcin.security.User.list()}" optionKey="id" required="" value="${donationInstance?.donator?.id}" class="many-to-one"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'donator', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.donator.label" default="Donator" />
		</span>
		<g:select class="form-control" id="donator" name="donator.id" from="${network.klwcin.security.User.list()}" optionKey="id" required="" value="${donationInstance?.donator?.id}" class="many-to-one"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: donationInstance, field: 'donator', 'error')} required">
		<span class="input-group-addon">
			<g:message code="donation.donator.label" default="Donator" />
		</span>
		<g:select class="form-control" id="donator" name="donator.id" from="${network.klwcin.security.User.list()}" optionKey="id" required="" value="${donationInstance?.donator?.id}" class="many-to-one"/>

	</div>
</div>
</g:if>

