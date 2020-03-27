<%--
  Created by IntelliJ IDEA.
  User: ad
  Date: 3/27/20
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Student Information</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
        <c:forEach items="${list}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>
                    <a href="/hello/findById/${student.id}">Edit</a>
                    <a href="/hello/deleteById/${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="/save.jsp">Add Student(s)</a>
</body>
</html>
