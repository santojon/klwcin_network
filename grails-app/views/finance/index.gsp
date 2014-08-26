<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Finances</title>
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
		<div>
			<table>
			<thead>
					<tr>
						<g:sortableColumn property="next" title="${message(code: 'Last Donations and Expenses')}" />
						<g:sortableColumn property="next1" title="${message(code: ' ')}" />
						<g:sortableColumn property="next2" title="${message(code: ' ')}" />
						<g:sortableColumn property="next2" title="${message(code: ' ')}" />
						<g:sortableColumn property="next2" title="${message(code: ' ')}" />
					</tr>
					<tr>
					
						<g:sortableColumn property="donator" title="${message(code: 'Donator or Expenser')}" />
						<g:sortableColumn property="type" title="${message(code: 'donation.type.label', default: 'Type')}" />
						<g:sortableColumn property="description" title="${message(code: 'donation.description.label', default: 'Description')}" />
						<g:sortableColumn property="date" title="${message(code: 'donation.date.label', default: 'Date')}" />						
						<g:sortableColumn property="total" title="${message(code: 'Value R$')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${donations}" status="i" var="donationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="showDonation" id="${donationInstance.id}">${fieldValue(bean: donationInstance, field: "donator")}</g:link></td>
						<td>Donation - ${fieldValue(bean: donationInstance, field: "type")}</td>
						<td>${fieldValue(bean: donationInstance, field: "description")}</td>
						<td><g:formatDate format="dd/MM/yy" date="${donationInstance.date}" /></td>
						<td>${donationInstance.value}</td>
						
					</tr>
				</g:each>
				<g:each in="${expenses}" status="i" var="expenseInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="showExpense" id="${expenseInstance.id}">KLWCIn</g:link></td>
						<td>Expense</td>
						<td>${fieldValue(bean: expenseInstance, field: "description")}</td>
						<td><g:formatDate format="dd/MM/yy" date="${expenseInstance.date}" /></td>
						<td>${expenseInstance.value}</td>
						
					</tr>
				</g:each>
				<tr>
					<g:sortableColumn property="next1" title="${message(code: ' ')}" />
					<g:sortableColumn property="next2" title="${message(code: ' ')}" />
					<g:sortableColumn property="next2" title="${message(code: ' ')}" />
					<g:sortableColumn property="next2" title="${message(code: 'Balance:')}" />
					<td>${balance}</td>
				</tr>
				</tbody>
			</table>
		</div>
		<div class="nav" role="navigation">
			<g:form controller="expense" action="create">
					<button style="float: right;">Register Expense</button>
					<button formaction="${createLink(controller: 'donation', action: 'create')}">Register Donation</button>
			</g:form>
		</div>
	</body>
</html>
