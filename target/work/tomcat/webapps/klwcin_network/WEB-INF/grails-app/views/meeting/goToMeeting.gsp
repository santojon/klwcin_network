<%@ page import="network.klwcin.business.Meeting" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
		<title><g:message code="Participate" /></title>
	</head>
	<body>
		<div id="show-meeting" class="content scaffold-show" role="main">
		
			<h1><g:message code="Participate" /></h1>
			
			<g:hiddenField name="version" value="${meetingInstance?.version}" />
				
				<div class="main-content" role="main">
					<!-- PAGE MESSAGES -->
					<g:render template="/general/show-flash-messages" />
					<!-- / PAGE MESSAGES -->
					
					<fieldset class="form-participate">
						<g:render template="form"/>
					</fieldset>
				</div>
			
			<g:form url="[resource:meetingInstance, action:'participate']" method="PUT" >
			
				<!-- Action -->
				<div class="modal-footer">
					<button type="submit" class="btn btn-alert btn-danger" id=“submit_btn_edit” >Participate</button>
					<button style="float: left;" type="button"  class="btn btn-alert btn-primary" onClick="goToIndexPage('meeting');" >Back</button>
				</div>
				<!-- / Action -->
				
			</g:form>
		</div>
	</body>
</html>
