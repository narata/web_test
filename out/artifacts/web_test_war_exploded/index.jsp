<%--
  Created by IntelliJ IDEA.
  User: Narata
  Date: 2018/8/8
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    ${ cookie.JSESSIONID.value }
    ${ pageContext.request.contextPath }
  </body>
</html>
