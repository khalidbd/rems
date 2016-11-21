<%@ page import="asfaq.Project" %>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'projectCode', 'error')} required">
    <label for="projectCode">
        <g:message code="project.projectCode.label" default="Project Code"/>
        <span class="required-indicator">*</span>
    </label>
    %{--<g:textField name="projectCode" required="" value="${projectInstance?.projectCode}"/>--}%
    <g:textField name="projectCode" value="${projectInstance?.projectCode ?: projectCode}" readonly="readonly" disabled="disabled"/>
    <g:hiddenField name="projectCode" value="${projectInstance?.projectCode ?: projectCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'projectName', 'error')} required">
    <label for="projectName">
        <g:message code="project.projectName.label" default="Project Name"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="projectName" required="" value="${projectInstance?.projectName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'projectLocation', 'error')} ">
    <label for="projectLocation">
        <g:message code="project.projectLocation.label" default="Project Location"/>

    </label>
    <g:textField name="projectLocation" value="${projectInstance?.projectLocation}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'noOfFloor', 'error')} required">
    <label for="noOfFloor">
        <g:message code="project.noOfFloor.label" default="No Of Floor"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="noOfFloor" type="number" min="1" max="11" value="${projectInstance?.noOfFloor}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'noOfFlat', 'error')} required">
    <label for="noOfFlat">
        <g:message code="project.noOfFlat.label" default="No Of Flat"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="noOfFlat" type="number" min="1" max="50" value="${projectInstance?.noOfFlat}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'noOfShare', 'error')} required">
    <label for="noOfShare">
        <g:message code="project.noOfShare.label" default="No Of Share"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="noOfShare" type="number" min="1" max="50" value="${projectInstance?.noOfShare}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'pricePerShare', 'error')} required">
    <label for="pricePerShare">
        <g:message code="project.pricePerShare.label" default="Price Per Share"/>
        <span class="required-indicator">*</span>
    </label>
    %{--<g:field name="pricePerShare" type="number" value="${fieldValue(bean: projectInstance, field: 'pricePerShare')}" required=""/>--}%
    <g:field name="pricePerShare" type="number" value="${projectInstance?.pricePerShare}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'isActive', 'error')} ">
    <label for="isActive">
        <g:message code="project.isActive.label" default="Is Active"/>

    </label>
    <g:checkBox name="isActive" value="${projectInstance?.isActive}"/>

</div>

%{--<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'createdBy', 'error')} ">
	<label for="createdBy">
		<g:message code="project.createdBy.label" default="Created By" />
		
	</label>
	<g:textField name="createdBy" value="${projectInstance?.createdBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'modifiedBy', 'error')} ">
	<label for="modifiedBy">
		<g:message code="project.modifiedBy.label" default="Modified By" />
		
	</label>
	<g:textField name="modifiedBy" value="${projectInstance?.modifiedBy}"/>

</div>--}%

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'projectStartDate', 'error')} ">
    <label for="projectStartDate">
        <g:message code="project.projectStartDate.label" default="Project Start Date"/>

    </label>
    <g:datePicker name="projectStartDate" precision="day" value="${projectInstance?.projectStartDate}" default="none"
                  noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'projectEndDate', 'error')} ">
    <label for="projectEndDate">
        <g:message code="project.projectEndDate.label" default="Project End Date"/>

    </label>
    <g:datePicker name="projectEndDate" precision="day" value="${projectInstance?.projectEndDate}" default="none"
                  noSelection="['': '']"/>

</div>

%{--<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'createdDate', 'error')} ">
	<label for="createdDate">
		<g:message code="project.createdDate.label" default="Created Date" />
		
	</label>
	<g:datePicker name="createdDate" precision="day"  value="${projectInstance?.createdDate}" default="none" noSelection="['': '']" />

</div>--}%

%{--<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'modifiedDate', 'error')} ">
	<label for="modifiedDate">
		<g:message code="project.modifiedDate.label" default="Modified Date" />
		
	</label>
	<g:datePicker name="modifiedDate" precision="day"  value="${projectInstance?.modifiedDate}" default="none" noSelection="['': '']" />

</div>--}%

