<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>ע��ҳ��</title>
  </head>
  
  <body>
  	<!-- ע��� -->
  	<center>
  	<h2>ע��ҳ��</h2>
	<s:form action="register" >
		<s:textfield name="username" label="�û���"></s:textfield>
		<s:password name="password" label="����"></s:password>
		<s:password name="repassword" label="ȷ������"></s:password>
		<s:textfield name="age" label="����"></s:textfield>
		<s:textfield name="birth" label="��������"></s:textfield>
		<s:textfield name="email" label="�����ַ"></s:textfield>
		<s:submit value="ע��"></s:submit>
	</s:form>
	</center>
  </body>
</html>
