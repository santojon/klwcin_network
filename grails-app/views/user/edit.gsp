<%@ page import="network.klwcin.security.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="edit-user" class="content scaffold-edit" role="main">
		
			<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
			
			<g:form url="[resource:userInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${userInstance?.version}" />
				
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
					<button type="submit" class="btn btn-alert btn-danger" id=“submit_btn_edit” >Update</button>
					<button style="float: left;" type="button"  class="btn btn-alert btn-primary" onClick="goToIndexPage('user');" >Back</button>
				</div>
				<!-- / Action -->
				
			</g:form>
		</div>
	</body>
</html>
