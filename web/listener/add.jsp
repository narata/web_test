<%--
  Created by IntelliJ IDEA.
  User: Narata
  Date: 2018/8/15
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    com.listener.User user = new com.listener.User();
    session.setAttribute("user", user);
%>
</body>
</html>
