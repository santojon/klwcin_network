
<%@ page import="network.klwcin.business.Donation" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'donation.label', default: 'Donation')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-donation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="list" href="${createLink(uri: '/donation')}"><g:message code="default.list.label" args="[entityName]" /></a></li>
				<li><a class="create" href="${createLink(uri: '/donation/create')}"><g:message code="default.new.label" args="[entityName]" /></a></li>
			</ul>
		</div>
		<div id="show-donation" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list donation">
			
				<g:if test="${donationInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="donation.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${donationInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${donationInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="donation.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${donationInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${donationInstance?.value.round(2)}">
				<li class="fieldcontain">
					<span id="value-label" class="property-label"><g:message code="donation.value.label" default="Value" /></span>
					
						<span class="property-value" aria-labelledby="value-label"><g:fieldValue bean="${donationInstance}" field="value"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${donationInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="donation.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate format="dd/MM/yy" date="${donationInstance?.date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${donationInstance?.donator}">
				<li class="fieldcontain">
					<span id="donator-label" class="property-label"><g:message code="donation.donator.label" default="Donator" /></span>
					
						<span class="property-value" aria-labelledby="donator-label"><g:link controller="user" action="show" id="${donationInstance?.donator?.id}">${donationInstance?.donator?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:donationInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${donationInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
