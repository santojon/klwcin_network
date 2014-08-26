<%@ page import="network.klwcin.business.Expense" %>



<div class="fieldcontain ${hasErrors(bean: expenseInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="expense.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" maxlength="100" required="" value="${expenseInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: expenseInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="expense.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="value" value="${fieldValue(bean: expenseInstance, field: 'value')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: expenseInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="expense.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="day"  value="${expenseInstance?.date}"  />

</div>

