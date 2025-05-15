<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<h2>Submitted Employee Information</h2>
	<table>
		<tr>
			<td>Name:</td>
			<td>${employee.name}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${employee.email}</td>
		</tr>
		<tr>
			<td>Department:</td>
			<td>${employee.department}</td>
		</tr>
	</table>
</body>
</html>