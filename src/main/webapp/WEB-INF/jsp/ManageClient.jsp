<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>ManageClient</title>


</head>
<body>
	<%@ include file="Header.jsp"%>
	<br />
	<div align="center">
		<form:form action="${pageContext.request.contextPath}/manageClient"
			method="post" modelAttribute="clientConfigurationWrapper">
			<table>
				<c:forEach var="clientConfiguration"
					items="${clientConfigurationWrapper.clientConfigurations}"
					varStatus="theCount">

					<tr>

						<td><form:hidden
								path="clientConfigurations[${theCount.index}].name" /> <form:hidden
								path="clientConfigurations[${theCount.index}].id" /> <strong>
								${clientConfiguration.name}</strong></td>
						<td><form:checkbox
								path="clientConfigurations[${theCount.index}].status"
								class="check" /></td>
					</tr>

				</c:forEach>



			</table>
			<br />
			<div align="center">
				<table>
					<tr>
						<td><button type="submit" class="button">
								<span id="submit">Submit</span>
							</button></td>
					</tr>
				</table>
			</div>
		</form:form>
	</div>
</body>

</html>




