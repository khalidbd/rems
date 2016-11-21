
<%@ page import="asfaq.Project" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'project.label', default: 'Project')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-project" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-project" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table id="example" class="table table-striped table-bordered">
			<thead>
					<tr>
					
						<g:sortableColumn property="projectName" title="${message(code: 'project.projectName.label', default: 'Project Name')}" />
					
						<g:sortableColumn property="noOfFloor" title="${message(code: 'project.noOfFloor.label', default: 'No Of Floor')}" />
					
						<g:sortableColumn property="noOfFlat" title="${message(code: 'project.noOfFlat.label', default: 'No Of Flat')}" />
					
						<g:sortableColumn property="noOfShare" title="${message(code: 'project.noOfShare.label', default: 'No Of Share')}" />
					
						<g:sortableColumn property="pricePerShare" title="${message(code: 'project.pricePerShare.label', default: 'Price Per Share')}" />
					
						<g:sortableColumn property="isActive" title="${message(code: 'project.isActive.label', default: 'Is Active')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${projectInstanceList}" status="i" var="projectInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${projectInstance.id}">${fieldValue(bean: projectInstance, field: "projectName")}</g:link></td>
					
						<td>${fieldValue(bean: projectInstance, field: "noOfFloor")}</td>
					
						<td>${fieldValue(bean: projectInstance, field: "noOfFlat")}</td>
					
						<td>${fieldValue(bean: projectInstance, field: "noOfShare")}</td>
					
						<td>${fieldValue(bean: projectInstance, field: "pricePerShare")}</td>
					
						<td><g:formatBoolean boolean="${projectInstance.isActive}" false="Finished" true="Running" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${projectInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
