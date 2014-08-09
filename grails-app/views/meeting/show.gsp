
<%@ page import="network.klwcin.business.Meeting" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-meeting" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-meeting" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list meeting">
			
				<g:if test="${meetingInstance?.place}">
				<li class="fieldcontain">
					<span id="place-label" class="property-label"><g:message code="meeting.place.label" default="Place" /></span>
					
						<span class="property-value" aria-labelledby="place-label"><g:fieldValue bean="${meetingInstance}" field="place"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${meetingInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="meeting.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${meetingInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${meetingInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="meeting.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${meetingInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${meetingInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="meeting.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${meetingInstance?.date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${meetingInstance?.creator}">
				<li class="fieldcontain">
					<span id="creator-label" class="property-label"><g:message code="meeting.creator.label" default="Creator" /></span>
					
						<span class="property-value" aria-labelledby="creator-label"><g:link controller="user" action="show" id="${meetingInstance?.creator?.id}">${meetingInstance?.creator?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${meetingInstance?.participants}">
				<li class="fieldcontain">
					<span id="participants-label" class="property-label"><g:message code="meeting.participants.label" default="Participants" /></span>
					
						<g:each in="${meetingInstance.participants}" var="p">
						<span class="property-value" aria-labelledby="participants-label"><g:link controller="user" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
						
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:meetingInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${meetingInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:link class="save" action="goToMeeting" resource="${meetingInstance}"><g:message code="Participate" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
