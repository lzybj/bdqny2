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
  <table width="312" height="50" border="2" cellpadding="1">
  <tr>
    <th width="136" scope="col">联系人名</th>
    <th width="158" scope="col">电话</th>
  </tr>
  <s:iterator id="mylxr" value="lxrsdata">
  <tr>
    <td><s:property value="#mylxr.lxrname"/></td>
    <td><s:property value="#mylxr.lxrtel"/></td>
  </tr>
  </s:iterator>
</table>
  </body>
</html>
