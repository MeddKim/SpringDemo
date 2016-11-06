<%--
  Created by IntelliJ IDEA.
  User: meddkim
  Date: 16-11-6
  Time: 下午7:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    ${user.userName},欢迎你！　当前积分为：${user.credits}
</body>
</html>
