<%@ page import="network.klwcin.business.Donation" %>



<div class="fieldcontain ${hasErrors(bean: donationInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="donation.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" maxlength="100" required="" value="${donationInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: donationInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="donation.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="type" from="${donationInstance.constraints.type.inList}" required="" value="${donationInstance?.type}" valueMessagePrefix="donation.type"/>

</div>

<div class="fieldcontain ${hasErrors(bean: donationInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="donation.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="value" value="${fieldValue(bean: donationInstance, field: 'value')}" required=""/>
	If Type isn't "Monetary", value must be R$ 0.0
</div>

<div class="fieldcontain ${hasErrors(bean: donationInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="donation.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="day"  value="${donationInstance?.date}"  />

</div>

<div hidden="" class="fieldcontain ${hasErrors(bean: donationInstance, field: 'donator', 'error')} required">
	<label for="donator">
		<g:message code="donation.donator.label" default="Donator" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="donator" name="donator.id" from="${network.klwcin.security.User.list()}" optionKey="id" required="" value="${donationInstance?.donator?.id}" class="many-to-one"/>

</div>

