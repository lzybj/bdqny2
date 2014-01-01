<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
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
<logic:empty name="data" scope="request">
	<logic:forward name="nocx"/>
</logic:empty>
<logic:notEmpty name="data" scope="request">
<table width="465" height="50" border="2" cellpadding="1">
  <tr>
    <th width="119" scope="col">ID</th>
    <th width="184" scope="col">用户名</th>
    <th width="138" scope="col">密码</th>
  </tr>
  <logic:iterate id="mycust" name="data" scope="request">
  <tr>
    <td><bean:write name="mycust" property="cid"/> </td>
    <td><bean:write name="mycust" property="cname"/></td>
    <td><bean:write name="mycust" property="cpwd"/></td>
  </tr>
  </logic:iterate>
</table>
</logic:notEmpty>
  </body>
</html>
