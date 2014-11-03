<%@ page import="network.klwcin.business.Meeting" %>
<%@ page import="network.klwcin.security.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="edit-meeting" class="content scaffold-edit" role="main">
		
			<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
			
			<g:form url="[resource:meetingInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${meetingInstance?.version}" />
				
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
					<g:if test="${User.get(session.SPRING_SECURITY_CONTEXT.authentication.principal.id).getType().equals("Counselor")}">
						<button type="submit" class="btn btn-alert btn-danger" id=“submit_btn_edit” >Update</button>
					</g:if>
					<button style="float: left;" type="button"  class="btn btn-alert btn-primary" onClick="goToIndexPage('meeting');" >Back</button>
					<button style="float: left;" type="button"  class="btn btn-alert btn-default" onClick="participate(${meetingInstance?.id});" >Participate</button>
				</div>
				<!-- / Action -->
				
			</g:form>
		</div>
	</body>
</html>
