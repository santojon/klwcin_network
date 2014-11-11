<%@ page import="network.klwcin.business.Expense" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'expense.label', default: 'Expense')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="edit-expense" class="content scaffold-edit" role="main">
		<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
		
			<g:form url="[resource:expenseInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${expenseInstance?.version}" />
				
				<div class="main-content" role="main">
				<!-- PAGE MESSAGES -->
				<g:render template="/general/show-flash-messages" />
				<!-- / PAGE MESSAGES -->
				
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				</div>
				
				<!-- Action -->
				<div class="modal-footer">
					<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
						<button type="submit" class="btn btn-alert btn-danger" id=“submit_btn_edit” >Update</button>
					</g:if>
					<button style="float: left;" type="button"  class="btn btn-alert btn-primary" onClick="goToIndexPage('expense');" >Back</button>
				</div>
				<!-- / Action -->
				
			</g:form>
		</div>
	</body>
</html>
