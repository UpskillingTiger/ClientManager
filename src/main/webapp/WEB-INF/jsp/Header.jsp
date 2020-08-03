<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="/css/main.css" />
<script type="text/javascript" src="/js/main.js"></script>

</head>
<body>
	<table id="menuTable">
		<tr>
			<td id="menuTd"><a
				href="${pageContext.request.contextPath}/launchAddClient">Add
					Client</a></td>
			<td id="menuTd"><a
				href="${pageContext.request.contextPath}/launchManageClient">Manage
					Client</a></td>
		</tr>
	</table>
</body>
</html>




