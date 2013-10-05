<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'res.jsp' starting page</title>
    
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
<table width="804" height="62" border="3">
  <tr>
    <th width="193" scope="col">名称</th>
    <th width="106" scope="col">类型</th>
    <th width="247" scope="col">主演</th>
    <th width="105" scope="col">导演</th>
    <th width="115" scope="col">票价</th>
  </tr>
  <c:forEach var="resobj" items="${data }">
  <tr>
    <td>${resobj.filmname }</td>
    <td>${resobj.filmtype }</td>
    <td>${resobj.actor }</td>
    <td>${resobj.director }</td>
    <td>${resobj.ticketprice }</td>
  </tr>
  </c:forEach>
</table>
  </body>
</html>
