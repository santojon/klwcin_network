<%@ page import="network.klwcin.business.Meeting" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="list-meeting" class="content" role="main">
	
		<!-- USER LIST PAGE CONTENT -->
		<div class="main-content" role="main">
			
			<!-- TITLE -->
			<h1 class="page-title" id="title_index" >Meetings</h1>
			<!-- / TITLE -->
		
			<!-- BUTTONS / SEARCH -->
			<div class="action-bar-top">
				<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">			
				<div class="pull-left">
					<g:form url="[controller: 'meeting', action:'create']" method="POST" id="create_form" >
						<button type="submit" id="btn_create" class="btn btn-danger create-form-button">
							<span class="fa fa-plus"></span> Add
						</button>
					</g:form>
				</div>
				</g:if>
				
				<div class="search-filter">
				<g:form method="GET">
					<input type="text" class="form-control" placeholder="Search..." id="search" name="search" value="${params.search}">
					<button class="btn btn-danger" type="submit" id="searchButton">
						<span class="fa fa-search"></span>
					</button>
					</g:form>
				</div>
				<div class="clearfix"></div>
			</div>
			<!-- / BUTTONS / SEARCH -->
			
			<!-- PAGE MESSAGES -->
			<g:render template="/general/show-flash-messages" />
			<!-- / PAGE MESSAGES -->
			
			<!-- PAGINATION TOP -->
			<g:render template="/general/pagination-header" model="['myList':meetingInstanceList, 'paginationId':'pagination_top']"/>
			<!-- / PAGINATION TOP -->
			
			<input type="hidden" name="totalCount" id="totalCount" value="${userInstanceList?.size() ?: 0}" />
			
			<!-- GRID -->
			<div class="col-lg-12 padding0">
			
				<div class="table-responsive">
				
					<table class="table grid table-hover table-striped">
						<thead>
							<tr>
								<g:sortableColumn property="place" title="Place" params="[search: params.search]"/>
								<g:sortableColumn property="description" title="Description" params="[search: params.search]"/>
								<g:sortableColumn property="type" title="Type" params="[search: params.search]"/>
								<g:sortableColumn property="date" title="Date" params="[search: params.search]"/>
								<g:sortableColumn property="creator" title="Creator" params="[search: params.search]"/>
								<th class="width30">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
						
							<!-- NO RECORD MESSAGE -->
							<g:if test="${meetingInstanceList == null}">
							<tr class="tr-empty-grid">
								<td colspan="5">Empty list</td>
								<th class="width30">&nbsp;</th>
							</tr>
							</g:if>
							<!-- NO RECORD MESSAGE -->
							
							<g:each in="${meetingInstanceList}" status="i" var="meetingInstance">
							<tr id="line_${i}">
								<td><span class="block" title="Edit meeting / participate" onClick="editMeeting('${meetingInstance.id}');" >${fieldValue(bean: meetingInstance, field: "place")}</span></td>
								<td><span class="block" title="Edit meeting / participate" onClick="editMeeting('${meetingInstance.id}');" >${fieldValue(bean: meetingInstance, field: "description")}</span></td>
								<td><span class="block" title="Edit meeting / participate" onClick="editMeeting('${meetingInstance.id}');" >${fieldValue(bean: meetingInstance, field: "type")}</span></td>
								<td><span class="block" title="Edit meeting / participate" onClick="editMeeting('${meetingInstance.id}');" ><g:formatDate format="dd/MM/yy - HH:mm" date="${meetingInstance.date}" /></span></td>
								<td><span class="block" title="Edit meeting / participate" onClick="editMeeting('${meetingInstance.id}');" >${fieldValue(bean: meetingInstance, field: "creator")}</span></td>
								<td>
								<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
									<g:form url="[controller: 'meeting', resource:meetingInstance, action:'delete']" method="DELETE" id="remove-form-${meetingInstance.id}" >
										<a href="#" title="Remove Meeting" id="btn_remove" onClick="getRemoveMeetingModalByPlaceAndDate('${meetingInstance.place}', '${meetingInstance.date}', ${meetingInstance.id})" class="a-icon" data-toggle="modal"><span class="fa fa-trash"></span></a>
									</g:form>
								</g:if>
								</td>
							</tr>
							</g:each>
						</tbody>
					</table>
				</div>
				
			</div>
			<!-- GRID -->
			
			<!-- PAGINATION BOTTOM -->
			<g:render template="/general/pagination-header" model="['myList':meetingInstanceList, 'paginationId':'pagination_bottom']"/>
			<!-- / PAGINATION BOTTOM -->
		
		</div>
		<!-- / USER LIST PAGE CONTENT -->
		
		<!-- DELETE MODAL -->
		<g:render template="modal-confirm-remove-meeting" />
		<!-- / DELETE MODAL -->
		
		</div>
	</body>
</html>
