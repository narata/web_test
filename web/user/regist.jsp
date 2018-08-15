<%--
  Created by IntelliJ IDEA.
  User: Narata
  Date: 2018/8/14
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>register</h1>

<P style="color: red; font-weight: 900">${msg}</P>

<form action="<c:url value="/RegisterServlet"/>" method="post">
    username: <input type="text" name="username">
    password: <input type="password" name="password">
    <input type="submit" value="register">
</form>
</body>
</html>
