
<%@ page import="network.klwcin.business.Meeting" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-meeting" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-meeting" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="place" title="${message(code: 'meeting.place.label', default: 'Place')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'meeting.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="type" title="${message(code: 'meeting.type.label', default: 'Type')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'meeting.date.label', default: 'Date')}" />
					
						<th><g:message code="meeting.creator.label" default="Creator" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${meetingInstanceList}" status="i" var="meetingInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${meetingInstance.id}">${fieldValue(bean: meetingInstance, field: "place")}</g:link></td>
					
						<td>${fieldValue(bean: meetingInstance, field: "description")}</td>
					
						<td>${fieldValue(bean: meetingInstance, field: "type")}</td>
					
						<td><g:formatDate format="dd/MM/yy - HH:mm" date="${meetingInstance.date}" /></td>
					
						<td>${fieldValue(bean: meetingInstance, field: "creator")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${meetingInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
