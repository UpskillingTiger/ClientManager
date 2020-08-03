<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Welcome</title>


</head>
<body>
	<%@ include file="Header.jsp"%>
	<div align="center">
		<form:form action="${pageContext.request.contextPath}/addClient"
			method="post" modelAttribute="client">
			<table>
				<tr>
					<td><form:checkbox path="caseSelection" /><strong>Case</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="Cosentyx" /><strong>Cosentyx</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="Adakveo" /><strong>Adakveo</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="Promacta" /><strong>Promacta</strong></td>

				</tr>
				<tr>
					<td><form:checkbox path="patientSelection" /><strong>Patient</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp; &nbsp;<strong>End Point :</strong></td>
					<td><form:input path="url" /></td>
				</tr>

				<tr>
					<td>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input
						type="submit" value="submit" /></td>

				</tr>

			</table>

		</form:form>
	</div>
</body>

</html>




