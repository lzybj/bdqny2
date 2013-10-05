<%@page import="com.bdqn.domain.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
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
  <jsp:useBean id="myStu" class="com.bdqn.domain.Student"></jsp:useBean>
  <jsp:setProperty property="stuid" name="myStu" value="1001"/>
  <jsp:setProperty property="stuName" name="myStu" value="小陈"/>
  <jsp:setProperty property="stuAge" name="myStu" value="21"/>
  <jsp:getProperty property="stuid" name="myStu"/><br>
  <jsp:getProperty property="stuName" name="myStu"/><br>
  <jsp:getProperty property="stuAge" name="myStu"/><br>
  <%--<%
  	//myStu.setStuid(1001);
  	//myStu.setStuName("小陈");
  	//myStu.setStuAge(20);
  	out.println(myStu.getStuid() + "<br>");
  	out.println(myStu.getStuName() + "<br>");
  	out.println(myStu.getStuAge() + "<br>");
  %>--%>
  </body>
</html>
