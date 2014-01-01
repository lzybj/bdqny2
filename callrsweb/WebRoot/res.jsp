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
<table width="499" height="50" border="2" cellpadding="1">
  <tr>
    <th scope="col">ID</th>
    <th scope="col">name</th>
    <th scope="col">pwd</th>
  </tr>
  <s:iterator id="c" value="res">
  <tr>
    <td><s:property value="#c.cid"/></td>
    <td><s:property value="#c.cname"/></td>
    <td><s:property value="#c.cpwd"/></td>
  </tr>
  </s:iterator>
</table>
  </body>
</html>
