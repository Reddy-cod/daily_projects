<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body> 
<h2>Add Employee</h2>

<form:form action="save" method="post" modelAttribute="employee">
    Name: <form:input path="name" /><br/>
    Email: <form:input path="email" /><br/>
    Department: <form:input path="department" /><br/>
    <input type="submit" value="Save"/>
</form:form>

</body>
</html>
