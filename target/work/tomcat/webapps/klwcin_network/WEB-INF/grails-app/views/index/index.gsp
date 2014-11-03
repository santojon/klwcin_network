<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>KLWCIn Network</title>
	</head>
	<body>
		<div id="page-body" class="content" role="main">
		
		<div id="table-container">
			<div id="table-row">
			
				<div id="table-content">
		<!-- HOME PAGE CONTENT -->
		<div class="main-content" role="main">
		
			<!-- TITLE -->
				<h1 class="page-title" id="title_index" >Welcome to KLWCIn Network</h1>
			<!-- / TITLE -->
			
			<div id=info role="main">
				<p>Congratulations, you have successfully entered the network. It means you are one of us. Try to make something here.</p>
				
				<br>
				<h2>Latest News</h2>
				<br>
				
				<p>We're here! Modernized version 0.2 beta is now online!</p>
				<p>Wow! Our beta is in very test! Such dangerous! <s>Much unstable database!</s> Wow!</p>
				<p>Database is now ok! New functionalities coming... Very supimpa, hum?!</p>
				<br>
			</div>
			
			<!-- GRID -->
			<h2>Next Meetings</h2>
				<div class="col-lg-12 padding0">
	
					<div class="table-responsive">
					
						<table class="table grid table-hover table-striped">
							<thead>
								<tr>
									<g:sortableColumn property="place" title="${message(code: 'meeting.place.label', default: 'Place')}" />
									<g:sortableColumn property="date" title="${message(code: 'meeting.date.label', default: 'Date')}" />
									<g:sortableColumn property="type" title="${message(code: 'meeting.type.label', default: 'Type')}" />
									<g:sortableColumn property="total" title="${message(code: 'Total of participants')}" />
									<g:sortableColumn property="description" title="${message(code: 'meeting.description.label', default: 'Description')}" />
									<th class="width30">&nbsp;</th>
								</tr>
							</thead>
							<tbody>
							
								<!-- NO RECORD MESSAGE -->
								<g:if test="${meetings == []}">
								<tr class="tr-empty-grid">
									<td colspan="5">Empty list</td>
									<th class="width30">&nbsp;</th>
								</tr>
								</g:if>
								<!-- NO RECORD MESSAGE -->
								
								<g:each in="${meetings}" status="i" var="meetingInstance">
								<tr id="line_${i}">
									<td><span class="block" title="Meeting" onClick="editMeeting('${meetingInstance.id}');">${fieldValue(bean: meetingInstance, field: "place")}</span></td>
									<td><span class="block" title="Meeting" onClick="editMeeting('${meetingInstance.id}');"><g:formatDate format="dd/MM/yy - HH:mm" date="${meetingInstance.date}" /></span></td>
									<td><span class="block" title="Meeting" onClick="editMeeting('${meetingInstance.id}');">${fieldValue(bean: meetingInstance, field: "type")}</span></td>
									<td><span class="block" title="Meeting" onClick="editMeeting('${meetingInstance.id}');">${meetingInstance.participants.size()}</span></td>
									<td><span class="block" title="Meeting" onClick="editMeeting('${meetingInstance.id}');">${fieldValue(bean: meetingInstance, field: "description")}</span></td>
									<td><span></span></td>
								</tr>
								</g:each>
							</tbody>
						</table>
					</div>
					
				</div>
				<!-- GRID -->
			
		</div>
		</div>
		
		<div id="table-filter">
		<div id="status" role="complementary" class="filter-container clearfix">
			<div class="panel-group" id="accordion">
			
				<!-- LATERAL BAR -->				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Actual Counselors</a>
							<a href="#collapse1" data-toggle="collapse" title="Collapse/Expand Counselors" class="a-icon pull-right" ><span class="fa fa-angle-down"></span></a>
						</h4>
					</div>
					<div id="collapse1" class="panel-collapse collapse collapsePanel">
						<div class="panel-body">
							<ul>
								<g:each in="${users}" status="i" var="userInstance">
									<g:if test="${userInstance.type == 'Counselor'}">
										<li>${userInstance.name} (${userInstance.username})</li>
									</g:if>
								</g:each>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Actual Members</a>
							<a href="#collapse2" data-toggle="collapse" title="Collapse/Expand Members" class="a-icon pull-right" ><span class="fa fa-angle-down"></span></a>
						</h4>
					</div>
					<div id="collapse2" class="panel-collapse collapse collapsePanel">
						<div class="panel-body">
							<ul>
								<g:each in="${users}" status="i" var="userInstance">
									<g:if test="${userInstance.type == 'Common'}">
										<li>${userInstance.name} (${userInstance.username})</li>
									</g:if>
								</g:each>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Actual Aspirants</a>
							<a href="#collapse3" data-toggle="collapse" title="Collapse/Expand Aspitants" class="a-icon pull-right" ><span class="fa fa-angle-down"></span></a>
						</h4>
					</div>
					<div id="collapse3" class="panel-collapse collapse collapsePanel">
						<div class="panel-body">
							<ul>
								<g:each in="${users}" status="i" var="userInstance">
									<g:if test="${userInstance.type == 'Aspirant'}">
										<li>${userInstance.name} (${userInstance.username})</li>
									</g:if>
								</g:each>
							</ul>
						</div>
					</div>
				</div>
				<!-- / LATERAL BAR -->
				</div>
				</div>
			<br>
		</div>
		
		</div>
		</div>
		</div>
	</body>
</html>
