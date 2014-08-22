<%@ page import="network.klwcin.business.Meeting" %>



<div class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'place', 'error')} required">
	<label for="place">
		<g:message code="meeting.place.label" default="Place" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="place" maxlength="45" required="" value="${meetingInstance?.place}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="meeting.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="description" maxlength="100" required="" value="${meetingInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="meeting.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="type" from="${meetingInstance.constraints.type.inList}" required="" value="${meetingInstance?.type}" valueMessagePrefix="meeting.type"/>

</div>

<div class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="meeting.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="minute"  value="${meetingInstance?.date}"  />

</div>

<div hidden="true" class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'creator', 'error')} required">
	<label for="creator">
		<g:message code="meeting.creator.label" default="Creator" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="creator" name="creator.id" from="${network.klwcin.security.User.list()}" optionKey="id" required="" value="${meetingInstance?.creator?.id}" class="many-to-one"/>

</div>

<div hidden="true" class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'participants', 'error')} requierd">
	<label for="participants">
		<g:message code="meeting.participants.label" default="Participants" />
		
	</label>
	<g:select name="participants" required="" from="${network.klwcin.security.User.list()}" multiple="multiple" optionKey="id" size="5" value="${meetingInstance?.participants*.id}" class="many-to-many"/>

</div>

