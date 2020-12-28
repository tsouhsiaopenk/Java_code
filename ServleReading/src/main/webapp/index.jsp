<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head></head>

<body>
<form action="ShowContent.jsp" method="post">
    用户名：<input type="text" name="username"><br/>
    发言：<br/>
    <textarea name="charContent" rows="20" cols="40"></textarea><br/>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>