<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>output</title>
  </head>
  
  <body>
	�û���:${requestScope.username }<br>
	����:${requestScope.password }<br>
	ȷ������:${requestScope.repassword }<br>
	����:${requestScope.age }<br>
	��������:${requestScope.birth }<br>
	�����ַ:${requestScope.email }<br>
  </body>
</html>
