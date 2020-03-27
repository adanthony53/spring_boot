<%--
  Created by IntelliJ IDEA.
  User: ad
  Date: 3/27/20
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello/save" method="post">
        ID:<input type="text" name="id"/><br/>
        name:<input type="text" name="name"/><br/>
        age:<input type="text" name="age"/><br/>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
