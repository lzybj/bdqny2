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
<table width="875" height="50" border="2" cellpadding="1">
  <tr>
    <th width="109" scope="col">区县</th>
    <th width="197" scope="col">街道</th>
    <th width="126" scope="col">户型</th>
    <th width="135" scope="col">价格</th>
    <th width="175" scope="col">时间</th>
    <th width="91" scope="col">操作</th>
  </tr>
  <s:iterator id="hh" value="res">
  <tr>
    <td><s:property value="#hh.hosStreet.hosDistrict.dname"/></td>
    <td><s:property value="#hh.hosStreet.sname"/></td>
    <td><s:property value="#hh.hosType.htname"/></td>
    <td><s:property value="#hh.price"/></td>
    <td><s:property value="#hh.htime"/></td>
    <td align="center"><s:a href="xxx.action?hid=%{#hh.hmid}">查看</s:a></td>
  </tr>
  </s:iterator>
</table>
  </body>
</html>
