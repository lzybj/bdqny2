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
<table width="861" height="54" border="3">
  <tr>
    <th scope="col">区县名</th>
    <th scope="col">街道名</th>
    <th scope="col">房屋类型</th>
    <th scope="col">价格</th>
    <th scope="col">发布人</th>
    <th scope="col">时间</th>
  </tr>
  <s:iterator id="hh" value="#request.data">
  <tr>
    <td><s:property value="#hh.hosStreet.hosDistrict.dname"/></td>
    <td><s:property value="#hh.hosStreet.sname"/></td>
    <td><s:property value="#hh.hosType.htname"/></td>
    <td><s:property value="#hh.price"/></td>
    <td><s:property value="#hh.sysUser.uname"/></td>
    <td><s:property value="#hh.htime"/></td>
  </tr>
  </s:iterator>
</table>
  </body>
</html>
