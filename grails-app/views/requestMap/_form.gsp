<%@ page import="auth.RequestMap" %>



<div class="fieldcontain ${hasErrors(bean: requestMapInstance, field: 'configAttribute', 'error')} required">
	<label for="configAttribute">
		<g:message code="requestMap.configAttribute.label" default="Config Attribute" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="configAttribute" required="" value="${requestMapInstance?.configAttribute}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestMapInstance, field: 'createdBy', 'error')} required">
	<label for="createdBy">
		<g:message code="requestMap.createdBy.label" default="Created By" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="createdBy" name="createdBy.id" from="${auth.User.list()}" optionKey="id" required="" value="${requestMapInstance?.createdBy?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestMapInstance, field: 'url', 'error')} required">
	<label for="url">
		<g:message code="requestMap.url.label" default="Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="url" required="" value="${requestMapInstance?.url}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestMapInstance, field: 'httpMethod', 'error')} ">
	<label for="httpMethod">
		<g:message code="requestMap.httpMethod.label" default="Http Method" />
		
	</label>
	<g:select name="httpMethod" from="${org.springframework.http.HttpMethod?.values()}" keys="${org.springframework.http.HttpMethod.values()*.name()}" value="${requestMapInstance?.httpMethod?.name()}"  noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestMapInstance, field: 'modifiedBy', 'error')} ">
	<label for="modifiedBy">
		<g:message code="requestMap.modifiedBy.label" default="Modified By" />
		
	</label>
	<g:select id="modifiedBy" name="modifiedBy.id" from="${auth.User.list()}" optionKey="id" value="${requestMapInstance?.modifiedBy?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestMapInstance, field: 'dateModified', 'error')} ">
	<label for="dateModified">
		<g:message code="requestMap.dateModified.label" default="Date Modified" />
		
	</label>
	<g:datePicker name="dateModified" precision="day"  value="${requestMapInstance?.dateModified}" default="none" noSelection="['': '']" />

</div>

