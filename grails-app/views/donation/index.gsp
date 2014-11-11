
<%@ page import="network.klwcin.business.Donation" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'donation.label', default: 'Donation')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="list-donation" class="content" role="main">
		
		<!-- DONATION LIST PAGE CONTENT -->
		<div class="main-content" role="main">
		
			<!-- TITLE -->
			<h1 class="page-title" id="title_index">Donation</h1>
			<!-- / TITLE -->
			
			<!-- BUTTONS / SEARCH -->
			<div class="action-bar-top">
				<sec:ifAllGranted roles="ROLE_ADMIN">		
				<div class="pull-left">
					<g:form url="[controller: 'donation', action:'create']" method="POST" id="create_form" >
						<button type="submit" id="btn_create" class="btn btn-danger create-form-button">
							<span class="fa fa-plus"></span> Add
						</button>
					</g:form>
				</div>
				</sec:ifAllGranted>
				
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
			<g:render template="/general/pagination-header" model="['myList':donationInstanceList, 'paginationId':'pagination_top']"/>
			<!-- / PAGINATION TOP -->
			
			<input type="hidden" name="totalCount" id="totalCount" value="${donationInstanceList}?.size() ?: 0}" />
			
			<!-- GRID -->
			<div class="col-lg-12 padding0">
			
				<div class="table-responsive">
				
					<table class="table grid table-hover table-striped">
					
						<thead>
							<tr>
							
								<g:sortableColumn property="description" title="${message(code: 'donation.description.label', default: 'Description')}" params="[search: params.search]" />
							
								<g:sortableColumn property="type" title="${message(code: 'donation.type.label', default: 'Type')}" params="[search: params.search]" />
							
								<g:sortableColumn property="value" title="${message(code: 'donation.value.label', default: 'Value')}" params="[search: params.search]" />
							
								<g:sortableColumn property="date" title="${message(code: 'donation.date.label', default: 'Date')}" params="[search: params.search]" />
							
								<th><g:message code="donation.donator.label" default="Donator" /></th>
							
							<th class="width30">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
						
							<!-- NO RECORD MESSAGE -->
							<g:if test="${donationInstanceList == null}">
							<tr class="tr-empty-grid">
								<td colspan="5">Empty list</td>
								<th class="width30">&nbsp;</th>
							</tr>
							</g:if>
							<!-- NO RECORD MESSAGE -->
							
							<g:each in="${donationInstanceList}" status="i" var="donationInstance">
								<tr id="line_${i}">
								
									<td><span class="block" title="Edit Donation" onClick="editDonation('${donationInstance.id}');" >${fieldValue(bean: donationInstance, field: "description")}</span></td>
								
									<td><span class="block" title="Edit Donation" onClick="editDonation('${donationInstance.id}');" >${fieldValue(bean: donationInstance, field: "type")}</span></td>
								
									<td><span class="block" title="Edit Donation" onClick="editDonation('${donationInstance.id}');" >${fieldValue(bean: donationInstance, field: "value")}</span></td>
								
									<td><span class="block" title="Edit Donation" onClick="editDonation('${donationInstance.id}');" ><g:formatDate format="dd/MM/yy" date="${donationInstance.date}" /></span></td>
								
									<td><span class="block" title="Edit Donation" onClick="editDonation('${donationInstance.id}');" >${fieldValue(bean: donationInstance, field: "donator")}</span></td>
								
									<td>
									<sec:ifAllGranted roles="ROLE_ADMIN">
										<g:form url="[controller: 'donation', resource:donationInstance, action:'delete']" method="DELETE" id="remove-form-${donationInstance.id}" >
											<a href="#" title="Remove Donation" id="btn_remove" onClick="getRemoveDonationModal('${donationInstance.id}')" class="a-icon" data-toggle="modal"><span class="fa fa-trash"></span></a>
										</g:form>
									</sec:ifAllGranted>
								</td>
								</tr>
							</g:each>
						</tbody>
					</table>
				</div>
				
			</div>
			<!-- GRID -->
			
			<!-- PAGINATION BOTTOM -->
			<g:render template="/general/pagination-header" model="['myList':donationInstanceList, 'paginationId':'pagination_top']"/>
			<!-- / PAGINATION BOTTOM -->
		
		</div>
		<!-- / DONATION LIST PAGE CONTENT -->
		
		<!-- DELETE MODAL -->
		<g:render template="modal-confirm-remove" />
		<!-- / DELETE MODAL -->
		
		<asset:javascript src="donation.js"/>
			
		</div>
	</body>
</html>
