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
			method="post" modelAttribute="clientsWrapper">
			<table>
				<c:forEach var="client" items="${clientsWrapper.clients}"
					varStatus="theCount">

					<tr>

						<td><form:hidden path="clients[${theCount.index}].name" /> <form:hidden
								path="clients[${theCount.index}].id" /> <strong>
								${client.name}</strong></td>
						<td><form:checkbox path="clients[${theCount.index}].status"
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




