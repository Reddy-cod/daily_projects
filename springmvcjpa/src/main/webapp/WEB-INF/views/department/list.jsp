<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Departments</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/style.css' />">
</head>
<body>
    <h1>Department List</h1>
    <a href="<c:url value='/departments/new'/>">Add New Department</a>

    <table border="1">
        <tr> 
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${departments}" var="department">
            <tr>
                <td>${department.id}</td>
                <td>${department.name}</td>
                <td>
                    <a href="<c:url value='/departments/edit/${department.id}'/>">Edit</a>
                    |
                    <a href="<c:url value='/departments/delete/${department.id}'/>">Delete</a>
                    |
                    <a href="<c:url value='/employees/department/${department.id}'/>">View Employees</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>