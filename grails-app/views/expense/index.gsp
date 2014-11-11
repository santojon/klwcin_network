
<%@ page import="network.klwcin.business.Expense" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'expense.label', default: 'Expense')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="list-expense" class="content" role="main">
		
		<!-- EXPENSE LIST PAGE CONTENT -->
		<div class="main-content" role="main">
		
			<!-- TITLE -->
			<h1 class="page-title" id="title_index">Expense</h1>
			<!-- / TITLE -->
			
			<!-- BUTTONS / SEARCH -->
			<div class="action-bar-top">
				<sec:ifAllGranted roles="ROLE_ADMIN">		
				<div class="pull-left">
					<g:form url="[controller: 'expense', action:'create']" method="POST" id="create_form" >
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
			<g:render template="/general/pagination-header" model="['myList':expenseInstanceList, 'paginationId':'pagination_top']"/>
			<!-- / PAGINATION TOP -->
			
			<input type="hidden" name="totalCount" id="totalCount" value="${expenseInstanceList}?.size() ?: 0}" />
			
			<!-- GRID -->
			<div class="col-lg-12 padding0">
			
				<div class="table-responsive">
				
					<table class="table grid table-hover table-striped">
					
						<thead>
							<tr>
							
								<g:sortableColumn property="description" title="${message(code: 'expense.description.label', default: 'Description')}" params="[search: params.search]" />
							
								<g:sortableColumn property="value" title="${message(code: 'expense.value.label', default: 'Value')}" params="[search: params.search]" />
							
								<g:sortableColumn property="date" title="${message(code: 'expense.date.label', default: 'Date')}" params="[search: params.search]" />
							
							<th class="width30">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
						
							<!-- NO RECORD MESSAGE -->
							<g:if test="${expenseInstanceList == null}">
							<tr class="tr-empty-grid">
								<td colspan="5">Empty list</td>
								<th class="width30">&nbsp;</th>
							</tr>
							</g:if>
							<!-- NO RECORD MESSAGE -->
							
							<g:each in="${expenseInstanceList}" status="i" var="expenseInstance">
								<tr id="line_${i}">
								
									<td><span class="block" title="Edit Expense" onClick="editExpense('${expenseInstance.id}');" >${fieldValue(bean: expenseInstance, field: "description")}</span></td>
								
									<td><span class="block" title="Edit Expense" onClick="editExpense('${expenseInstance.id}');" >${fieldValue(bean: expenseInstance, field: "value")}</span></td>
								
									<td><span class="block" title="Edit Expense" onClick="editExpense('${expenseInstance.id}');" ><g:formatDate format="dd/MM/yy" date="${expenseInstance.date}" /></span></td>
								
									<td>
									<sec:ifAllGranted roles="ROLE_ADMIN">
										<g:form url="[controller: 'expense', resource:expenseInstance, action:'delete']" method="DELETE" id="remove-form-${expenseInstance.id}" >
											<a href="#" title="Remove Expense" id="btn_remove" onClick="getRemoveExpenseModal('${expenseInstance.id}')" class="a-icon" data-toggle="modal"><span class="fa fa-trash"></span></a>
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
			<g:render template="/general/pagination-header" model="['myList':expenseInstanceList, 'paginationId':'pagination_top']"/>
			<!-- / PAGINATION BOTTOM -->
		
		</div>
		<!-- / EXPENSE LIST PAGE CONTENT -->
		
		<!-- DELETE MODAL -->
		<g:render template="modal-confirm-remove" />
		<!-- / DELETE MODAL -->
		
		<asset:javascript src="expense.js"/>
			
		</div>
	</body>
</html>
