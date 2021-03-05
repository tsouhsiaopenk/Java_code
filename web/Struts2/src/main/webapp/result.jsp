<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>output</title>
  </head>
  
  <body>
	用户名:${requestScope.username }<br>
	密码:${requestScope.password }<br>
	确认密码:${requestScope.repassword }<br>
	年龄:${requestScope.age }<br>
	出生日期:${requestScope.birth }<br>
	邮箱地址:${requestScope.email }<br>
  </body>
</html>
