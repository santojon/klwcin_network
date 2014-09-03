
<%@ page import="network.klwcin.business.Donation" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'donation.label', default: 'Donation')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-donation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-donation" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="description" title="${message(code: 'donation.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="type" title="${message(code: 'donation.type.label', default: 'Type')}" />
					
						<g:sortableColumn property="value" title="${message(code: 'donation.value.label', default: 'Value')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'donation.date.label', default: 'Date')}" />
					
						<th><g:message code="donation.donator.label" default="Donator" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${donationInstanceList}" status="i" var="donationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${donationInstance.id}">${fieldValue(bean: donationInstance, field: "description")}</g:link></td>
					
						<td>${fieldValue(bean: donationInstance, field: "type")}</td>
					
						<td>${donationInstance.value.round(2)}</td>
					
						<td><g:formatDate format="dd/MM/yy" date="${donationInstance?.date}" /></td>
					
						<td>${fieldValue(bean: donationInstance, field: "donator")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${donationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
