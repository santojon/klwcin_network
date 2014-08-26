<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>KLWCIn Network</title>
		<style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 12em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div id="status" role="complementary">
			<br>
			<h1>Members total</h1>
			<ul>${users.size()}</ul>
			<br>
			<h1>Actual Counselors</h1>
			<ul>
				<g:each in="${users}" status="i" var="userInstance">
					<g:if test="${userInstance.type == 'Counselor'}">
						<li>${userInstance.name}</li>
					</g:if>
				</g:each>
			</ul>
		</div>
		<div id="page-body" role="main">
			<h1>Welcome to KLWCIn Network</h1>
			<p>Congratulations, you have successfully started your first meeting with us. Try to make something here.</p>
			
			<h1>Last News</h1>
			<p>We're here! Version 0.1.2 beta is now online!</p>
			<p>Wow! Our beta is in very test! Such dangerous! Much unstable database! Wow!</p>
			
		</div>
		<div>
			<table>
			<thead>
					<tr>
						<g:sortableColumn property="next" title="${message(code: 'Next Meetings')}" />
						<g:sortableColumn property="next1" title="${message(code: ' ')}" />
						<g:sortableColumn property="next2" title="${message(code: ' ')}" />
						<g:sortableColumn property="next2" title="${message(code: ' ')}" />
						<g:sortableColumn property="next2" title="${message(code: ' ')}" />
					</tr>
					<tr>
					
						<g:sortableColumn property="place" title="${message(code: 'meeting.place.label', default: 'Place')}" />
						<g:sortableColumn property="date" title="${message(code: 'meeting.date.label', default: 'Date')}" />
						<g:sortableColumn property="type" title="${message(code: 'meeting.type.label', default: 'Type')}" />
						<g:sortableColumn property="total" title="${message(code: 'Total of participants')}" />
						<g:sortableColumn property="description" title="${message(code: 'meeting.description.label', default: 'Description')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${meetings}" status="i" var="meetingInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="showMeeting" id="${meetingInstance.id}">${fieldValue(bean: meetingInstance, field: "place")}</g:link></td>
						<td><g:formatDate format="dd/MM/yy - HH:mm" date="${meetingInstance.date}" /></td>
						<td>${fieldValue(bean: meetingInstance, field: "type")}</td>
						<td>${meetingInstance.participants.size()}</td>
						<td>${fieldValue(bean: meetingInstance, field: "description")}</td>
						
					</tr>
				</g:each>
				</tbody>
			</table>
		</div>
	</body>
</html>
