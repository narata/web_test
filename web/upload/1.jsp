<%--
  Created by IntelliJ IDEA.
  User: Narata
  Date: 2018/8/15
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<c:url value='/cservlet'/>" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username">
    照片：<input type="file" name="file">
    <input type="submit" value="上传">
</form>

</body>
</html>
