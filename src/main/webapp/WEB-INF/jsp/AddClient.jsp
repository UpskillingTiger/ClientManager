<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>AddClient</title>


</head>
<body>
	<%@ include file="Header.jsp"%>
	<br />
	<div align="center">
		<form:form action="${pageContext.request.contextPath}/addClient"
			method="post" modelAttribute="client">
			<table>
				<tr>
					<td><strong>Name :</strong></td>
					<td><form:input path="name" class="text" required="required" /></td>
				</tr>
				<tr>
					<td><form:checkbox path="caseSelection" id="case"
							class="check" /><strong>Case</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="a038A000004vOANQA2" class="product check" disabled="true" /><strong>ACTHAR</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="a038A000004vOAMQA2" class="product check" disabled="true" /><strong>ILUMYA</strong></td>
				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="a038A000004vOAOQA2" class="product check" disabled="true" /><strong>YONSA</strong></td>

				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="a038A000004vOAUQA2" class="product check" disabled="true" /><strong>ABSORICA</strong></td>

				</tr>
				<tr>
					<td>&nbsp; &nbsp; &nbsp;<form:checkbox path="products"
							value="a038A000004vOATQA2" class="product check" disabled="true" /><strong>ODOMZO</strong></td>

				</tr>
				<tr>
					<td><form:checkbox path="patientSelection" class="check" /><strong>Patient</strong></td>
				</tr>
				<tr>
					<td><strong>End Point :</strong></td>
					<td><form:input path="url" size="50" class="text"
							required="required" /></td>
				</tr>


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




