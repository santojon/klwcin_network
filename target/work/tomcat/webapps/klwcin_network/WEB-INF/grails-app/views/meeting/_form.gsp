<%@ page import="network.klwcin.business.Meeting" %>
<%@ page import="network.klwcin.security.User" %>

<!-- COUNSELORS -->
<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
	<div class="row">
  		<div class="col-lg-6">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'place', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.place.label" default="Place:" /></span>
    			<g:textField class="form-control" name="place" maxlength="45" required="" value="${meetingInstance?.place}"/>
      		</div>
			<br />
		</div>
		
		<div class="col-lg-3">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'type', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.type.label" default="Type:" /></span>
				<g:select class="form-control" name="type" from="${meetingInstance.constraints.type.inList}" required="" value="${meetingInstance?.type}" valueMessagePrefix="meeting.type"/>
      		</div>
			<br />
		</div>
	 </div>
	 
	 <div class="row">
	 	<div class="col-lg-6">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'description', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.description.label" default="Description:" /></span>
    			<g:textArea class="form-control" name="description" maxlength="45" required="" value="${meetingInstance?.description}"/>
      		</div>
			<br />
		</div>
		
		<div class="col-lg-6">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'date', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.date.label" default="Date:" /></span>
    			<g:datePicker name="date" precision="minute"  value="${meetingInstance?.date}"  />
      		</div>
			<br />
		</div>
	 </div>
	 
	 <div class="row">
	 	<div class="">
			<div class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'participants', 'error')} requierd">
				<span class="input-group-addon">
					<div class="col-lg-2">
						<g:message code="meeting.participants.label" default="Participants:" />
					</div>
					<g:each in="${meetingInstance.participants}" var="p">
						<div class="col-lg-2">
							<span class="property-value" aria-labelledby="participants-label"><g:link controller="user" action="edit" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</div>
					</g:each>
				</span>
			</div>
		</div>
	 </div>
</g:if>

<!-- OTHER USERS -->
<g:if test="${!User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
	<div class="row">
  		<div class="col-lg-6">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'place', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.place.label" default="Place:" /></span>
    			<g:textField disabled="" class="form-control" name="place" maxlength="45" required="" value="${meetingInstance?.place}"/>
      		</div>
			<br />
		</div>
		
		<div class="col-lg-3">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'type', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.type.label" default="Type:" /></span>
				<g:select disabled="" class="form-control" name="type" from="${meetingInstance.constraints.type.inList}" required="" value="${meetingInstance?.type}" valueMessagePrefix="meeting.type"/>
      		</div>
			<br />
		</div>
	 </div>
	 
	 <div class="row">
	 	<div class="col-lg-6">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'description', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.description.label" default="Description:" /></span>
    			<g:textArea disabled="" class="form-control" name="description" maxlength="45" required="" value="${meetingInstance?.description}"/>
      		</div>
			<br />
		</div>
		
		<div class="col-lg-6">
    		<div class="input-group fieldcontain ${hasErrors(bean: meetingInstance, field: 'date', 'error')} required"">
    			<span class="input-group-addon"><g:message code="meeting.date.label" default="Date:" /></span>
    			<div class="disabled">
    				<g:datePicker name="date" precision="minute"  value="${meetingInstance?.date}"  />
    			</div>
      		</div>
			<br />
		</div>
	 </div>
	 
	 <div class="row">
	 	<div class="">
			<div class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'participants', 'error')} requierd">
				<span class="input-group-addon">
					<div class="col-lg-2">
						<g:message code="meeting.participants.label" default="Participants:" />
					</div>
					<g:each in="${meetingInstance.participants}" var="p">
						<div class="col-lg-2">
							<span class="property-value" aria-labelledby="participants-label">${p?.encodeAsHTML()}</span>
						</div>
					</g:each>
				</span>
			</div>
		</div>
	 </div>
</g:if>


<!-- LIXO -->
<div hidden="true" class="fieldcontain ${hasErrors(bean: meetingInstance, field: 'creator', 'error')} required">
	<label for="creator">
		<g:message code="meeting.creator.label" default="Creator" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="creator" name="creator.id" from="${network.klwcin.security.User.list()}" optionKey="id" required="" value="${meetingInstance?.creator?.id}" class="many-to-one"/>

</div>

