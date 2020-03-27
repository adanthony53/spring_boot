<%--
  Created by IntelliJ IDEA.
  User: ad
  Date: 3/27/20
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello/update" method="post">
        ID:<input type="text" name="id" value="${student.id}" readonly/><br/>
        name:<input type="text" name="name" value="${student.name}"/><br/>
        age:<input type="text" name="age" value="${student.age}"/><br/>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
