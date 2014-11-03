<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>Finances Balance</title>
	</head>
	<body>
		<div id="finances" class="content" role="main">
	
		<!-- FINANCES BALANCE PAGE CONTENT -->
		<div class="main-content" role="main">
			
			<!-- TITLE -->
			<h1 class="page-title" id="title_index" >Finances balance</h1>
			<!-- / TITLE -->
		
			<!-- BUTTONS -->
			<div class="action-bar-top">			
				<div class="pull-left">
				<g:form url="[controller: 'donation', action:'create']" method="POST" id="create_form" >
					<button type="submit" id="btn_create_donation" class="btn btn-danger create-form-button">
						<span class="fa fa-plus"></span> Add Donation
					</button>
				</g:form>
				</div>
				
				<div class="pull-right">
				<g:form url="[controller: 'expense', action:'create']" method="POST" id="create_form" >
					<button type="submit" id="btn_create_expense" class="btn btn-danger create-form-button">
						<span class="fa fa-plus"></span> Add Expense
					</button>
				</g:form>
				</div>
			</div>
			<!-- / BUTTONS -->
			
			<!-- GRID -->
			<div class="col-lg-12 padding0">
			
				<div class="table-responsive">
				
					<table class="table grid table-hover table-striped">
						<thead>
							<tr>
								<g:sortableColumn property="donator" title="Donator or Expenser"/>
								<g:sortableColumn property="type" title="Type"/>
								<g:sortableColumn property="description" title="Description"/>
								<g:sortableColumn property="date" title="Date"/>
								<g:sortableColumn property="total" title="Value R\$"/>
								<th class="width30">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
						
							<!-- NO RECORD MESSAGE -->
							<g:if test="${donations.size() == 0 && expenses.size() == 0}">
							<tr class="tr-empty-grid">
								<td colspan="5">Empty list</td>
								<th class="width30">&nbsp;</th>
							</tr>
							</g:if>
							<!-- NO RECORD MESSAGE -->
							
							<g:each in="${donations}" status="i" var="donaionInstance">
							<tr id="line_${i}">
								<td><span class="block" title="Donation">${fieldValue(bean: donationInstance, field: "donator")}</span></td>
								<td><span class="block" title="Donation">${fieldValue(bean: donationInstance, field: "type")}</span></td>
								<td><span class="block" title="Donation">${fieldValue(bean: donationInstance, field: "description")}</span></td>
								<td><span class="block" title="Donation"><g:formatDate format="dd/MM/yy" date="${donationInstance.date}" /></span></td>
								<td><span class="block" title="Donation">${donationInstance.value.round(2)}</span></td>
							</tr>
							</g:each>
							
							<g:each in="${expenses}" status="i" var="expenseInstance">
							<tr id="line_${i}">
								<td><span class="block" title="Expense">KLWCIn</span></td>
								<td><span class="block" title="Expense">Expense</span></td>
								<td><span class="block" title="Expense">${fieldValue(bean: expenseInstance, field: "description")}</span></td>
								<td><span class="block" title="Expense"><g:formatDate format="dd/MM/yy" date="${expenseInstance.date}" /></span></td>
								<td><span class="block" title="Expense">${expenseInstance.value.round(2)}</span></td>
							</tr>
							</g:each>
						</tbody>
					</table>
				</div>
				
			</div>
			<!-- GRID -->
			
		</div>
		
			<!-- Action -->
			<div class="modal-footer">
				<div class="page">
					<td class="pull-right">Balance: </td>
					<td class="pull-right">${balance.round(2)}</td>
				</div>
			</div>
			<!-- / Action -->
		</div>
	</body>
</html>
