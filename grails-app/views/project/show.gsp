
<%@ page import="asfaq.Project" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'project.label', default: 'Project')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-project" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-project" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list project">

				<g:if test="${projectInstance?.projectCode}">
					<li class="fieldcontain">
						<span id="projectCode-label" class="property-label"><g:message code="project.projectCode.label" default="Project Code" /></span>

						<span class="property-value" aria-labelledby="projectCode-label"><g:fieldValue bean="${projectInstance}" field="projectCode"/></span>

					</li>
				</g:if>

				<g:if test="${projectInstance?.projectName}">
				<li class="fieldcontain">
					<span id="projectName-label" class="property-label"><g:message code="project.projectName.label" default="Project Name" /></span>
					
						<span class="property-value" aria-labelledby="projectName-label"><g:fieldValue bean="${projectInstance}" field="projectName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.noOfFloor}">
				<li class="fieldcontain">
					<span id="noOfFloor-label" class="property-label"><g:message code="project.noOfFloor.label" default="No Of Floor" /></span>
					
						<span class="property-value" aria-labelledby="noOfFloor-label"><g:fieldValue bean="${projectInstance}" field="noOfFloor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.noOfFlat}">
				<li class="fieldcontain">
					<span id="noOfFlat-label" class="property-label"><g:message code="project.noOfFlat.label" default="No Of Flat" /></span>
					
						<span class="property-value" aria-labelledby="noOfFlat-label"><g:fieldValue bean="${projectInstance}" field="noOfFlat"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.noOfShare}">
				<li class="fieldcontain">
					<span id="noOfShare-label" class="property-label"><g:message code="project.noOfShare.label" default="No Of Share" /></span>
					
						<span class="property-value" aria-labelledby="noOfShare-label"><g:fieldValue bean="${projectInstance}" field="noOfShare"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.pricePerShare}">
				<li class="fieldcontain">
					<span id="pricePerShare-label" class="property-label"><g:message code="project.pricePerShare.label" default="Price Per Share" /></span>
					
						<span class="property-value" aria-labelledby="pricePerShare-label"><g:fieldValue bean="${projectInstance}" field="pricePerShare"/></span>
					
				</li>
				</g:if>
			
				%{--<g:if test="${projectInstance?.isActive}">--}%
				<li class="fieldcontain">
					<span id="isActive-label" class="property-label"><g:message code="project.isActive.label" default="Is Active" /></span>
					
						<span class="property-value" aria-labelledby="isActive-label"><g:formatBoolean boolean="${projectInstance?.isActive}" true="Running" false="Finished" /></span>
					
				</li>
				%{--</g:if>--}%
			
				<g:if test="${projectInstance?.projectLocation}">
				<li class="fieldcontain">
					<span id="projectLocation-label" class="property-label"><g:message code="project.projectLocation.label" default="Project Location" /></span>
					
						<span class="property-value" aria-labelledby="projectLocation-label"><g:fieldValue bean="${projectInstance}" field="projectLocation"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.createdBy}">
				<li class="fieldcontain">
					<span id="createdBy-label" class="property-label"><g:message code="project.createdBy.label" default="Created By" /></span>
					
						<span class="property-value" aria-labelledby="createdBy-label"><g:fieldValue bean="${projectInstance}" field="createdBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.modifiedBy}">
				<li class="fieldcontain">
					<span id="modifiedBy-label" class="property-label"><g:message code="project.modifiedBy.label" default="Modified By" /></span>
					
						<span class="property-value" aria-labelledby="modifiedBy-label"><g:fieldValue bean="${projectInstance}" field="modifiedBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.projectStartDate}">
				<li class="fieldcontain">
					<span id="projectStartDate-label" class="property-label"><g:message code="project.projectStartDate.label" default="Project Start Date" /></span>
					
						<span class="property-value" aria-labelledby="projectStartDate-label"><g:formatDate date="${projectInstance?.projectStartDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.projectEndDate}">
				<li class="fieldcontain">
					<span id="projectEndDate-label" class="property-label"><g:message code="project.projectEndDate.label" default="Project End Date" /></span>
					
						<span class="property-value" aria-labelledby="projectEndDate-label"><g:formatDate date="${projectInstance?.projectEndDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.createdDate}">
				<li class="fieldcontain">
					<span id="createdDate-label" class="property-label"><g:message code="project.createdDate.label" default="Created Date" /></span>
					
						<span class="property-value" aria-labelledby="createdDate-label"><g:formatDate date="${projectInstance?.createdDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${projectInstance?.modifiedDate}">
				<li class="fieldcontain">
					<span id="modifiedDate-label" class="property-label"><g:message code="project.modifiedDate.label" default="Modified Date" /></span>
					
						<span class="property-value" aria-labelledby="modifiedDate-label"><g:formatDate date="${projectInstance?.modifiedDate}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:projectInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${projectInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
