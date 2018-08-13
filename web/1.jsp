<%--
  Created by IntelliJ IDEA.
  User: Narata
  Date: 2018/8/13
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tag" uri="/WEB-INF/tlds/tag1.tld" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    request.setAttribute("xxx", "XXX");
%>
<tag:tag3 test="${ false }">
    <tag:tag1/>
    <tag:tag2>nibaba</tag:tag2>
</tag:tag3>

</body>
</html>
