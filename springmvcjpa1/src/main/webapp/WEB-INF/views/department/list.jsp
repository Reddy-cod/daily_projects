<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- Fixed here -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department List</title>
<link rel="stylesheet" href="<c:url value='/resources/css/style.css' />">
</head>
<body>
	<h1>Department List</h1>

	<!-- Add Department Button -->
	<a href="<c:url value='/departments/new' />">Add New Department</a>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Actions</th>
		</tr>

		<c:forEach items="${departments}" var="department">
			<tr>
				<td>${department.id}</td> <!-- Match your entity field -->
				<td>${department.name}</td> <!-- Match your entity field -->
				<td>
					<a href="<c:url value='/departments/edit/${department.id}' />">Edit</a>
					<a href="<c:url value='/departments/delete/${department.id}' />">Delete</a>
					<a href="<c:url value='/departments/department/${department.id}' />">View Employees</a>
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
