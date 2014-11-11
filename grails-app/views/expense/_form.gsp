<%@ page import="network.klwcin.business.Expense" %>



<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'description', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.description.label" default="Description" />
		</span>
		<g:textField class="form-control" name="description" maxlength="100" required="" value="${expenseInstance?.description}"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'description', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.description.label" default="Description" />
		</span>
		<g:textField class="form-control" name="description" maxlength="100" required="" value="${expenseInstance?.description}"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'description', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.description.label" default="Description" />
		</span>
		<g:textField class="form-control" name="description" maxlength="100" required="" value="${expenseInstance?.description}"/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'value', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.value.label" default="Value" />
		</span>
		<g:field class="form-control" name="value" value="${fieldValue(bean: expenseInstance, field: 'value')}" required=""/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'value', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.value.label" default="Value" />
		</span>
		<g:field class="form-control" name="value" value="${fieldValue(bean: expenseInstance, field: 'value')}" required=""/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'value', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.value.label" default="Value" />
		</span>
		<g:field class="form-control" name="value" value="${fieldValue(bean: expenseInstance, field: 'value')}" required=""/>

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_ADMIN]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'date', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.date.label" default="Date" />
		</span>
		<g:datePicker class="form-control" name="date" precision="day"  value="${expenseInstance?.date}"  />

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_USER]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'date', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.date.label" default="Date" />
		</span>
		<g:datePicker class="form-control" name="date" precision="day"  value="${expenseInstance?.date}"  />

	</div>
</div>
</g:if>

<g:if test="${'[ROLE_NONE]' in session.SPRING_SECURITY_CONTEXT.authentication.principal.authorities.toString()}">
<div class="col-lg-6">
	<div class="disabled input-group fieldcontain ${hasErrors(bean: expenseInstance, field: 'date', 'error')} required">
		<span class="input-group-addon">
			<g:message code="expense.date.label" default="Date" />
		</span>
		<g:datePicker class="form-control" name="date" precision="day"  value="${expenseInstance?.date}"  />

	</div>
</div>
</g:if>

