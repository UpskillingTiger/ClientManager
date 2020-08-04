<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="/css/main.css" />
<script src="http://code.jquery.com/jquery-1.4.2.js"></script>
<script type="text/javascript" src="/js/main.js"></script>

</head>
<body>
	<div align="center">
		<table>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/launchAddClient"
					class="linkbutton">Add Client</a></td>
				<td><a
					href="${pageContext.request.contextPath}/launchManageClient"
					class="linkbutton">Manage Client</a></td>
			</tr>
		</table>
	</div>
</body>
</html>




