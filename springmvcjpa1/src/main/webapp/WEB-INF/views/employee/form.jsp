<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Department Form</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/style.css' />">
</head>
<body>

<h1>Department Form</h1>

<form:form action="save" method="POST" modelAttribute="department">
    <form:hidden path="id" />

    <div class="form-group">
        <label for="name">Department Name:</label>
        <form:input path="name" id="name" cssClass="form-control" />
        <form:errors path="name" cssClass="error" />
    </div>

    <div class="form-actions">
        <input type="submit" value="Save" class="btn btn-primary" />
        <a href="<c:url value='/departments' />" class="btn btn-secondary">Cancel</a>
    </div>
</form:form>

</body>
</html>