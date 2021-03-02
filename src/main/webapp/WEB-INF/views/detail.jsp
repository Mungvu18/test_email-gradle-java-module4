<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2021
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Student</h1>
<form method="post" >
    <table>

        Id:   <input type="text" name="id" value="${o.getId()}"> <br>
        Name: <input type="text" name="name" value="${o.getName()}"> <br>
        Age:  <input type="number" name="age" value="${o.getAge()}"> <br>
        Address: <input type="text" name="address" value="${o.getAddress()}"> <br>
    </table>
</form>
</body>
</html>
