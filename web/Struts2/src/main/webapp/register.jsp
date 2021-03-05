<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册页面</title>
  </head>
  
  <body>
  	<!-- 注册表单 -->
  	<center>
  	<h2>注册页面</h2>
	<s:form action="register" >
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:password name="repassword" label="确认密码"></s:password>
		<s:textfield name="age" label="年龄"></s:textfield>
		<s:textfield name="birth" label="出生日期"></s:textfield>
		<s:textfield name="email" label="邮箱地址"></s:textfield>
		<s:submit value="注册"></s:submit>
	</s:form>
	</center>
  </body>
</html>
