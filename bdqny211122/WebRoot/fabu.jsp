<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fabu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:form action="fabu.action">
    		<s:textfield name="myhouse" label="发布人"></s:textfield>
    		<s:textfield name="myhouse" label="户型"></s:textfield>
    		<s:textfield name="myhouse" label="地址"></s:textfield>
    		<s:textfield name="myhouse" label="价格"></s:textfield>
    		<s:textfield name="mypoint" label="经度"></s:textfield>
    		<s:textfield name="mypoint" label="纬度"></s:textfield>
    		<s:submit value="发布"></s:submit>
    </s:form>
  </body>
</html>
