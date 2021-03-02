<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2021
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        tr, td {
            border-color: darkslateblue;
            border: solid 1px;
        }

    </style>
</head>
<body>
<h3><a href="/students/create">Create New Student</a></h3>
<table cellspacing="0">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${list}" var="o">
        <tr>
            <td>${o.getId()}</td>
            <td>${o.getName()}</td>
            <td>${o.getAge()}</td>
            <td>${o.getAddress()}</td>
            <td><a href="/students/edit?id=${o.getId()}">Edit</a></td>
            <td><a href="/students/delete?id=${o.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br> <br>
<form action="/students/search" method="get">
    <input type="text" name="id" placeholder="Enter search">
    <input type="submit" value="search">
</form>
</body>
</html>
