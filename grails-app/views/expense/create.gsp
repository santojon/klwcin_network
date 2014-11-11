<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'expense.label', default: 'Expense')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="create-expense" class="content scaffold-create" role="main">
		<h1><g:message code="default.create.label" args="[entityName]" /></h1>
		
			<g:form url="[resource:expenseInstance, action:'save']" >
			
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
					<button type="submit" class="btn btn-alert btn-danger" id=“submit_btn_add” >Create</button>
					<button style="float: left;" type="button"  class="btn btn-alert btn-primary" onClick="goToIndexPage('expense');" >Back</button>
				</div>
				<!-- / Action -->
			</g:form>
		</div>
	</body>
</html>
