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
    
    <title>My JSP 'noreadlist.jsp' starting page</title>
    
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
  <table width="948" height="50" border="3">
  <tr>
    <th width="163" scope="col">短息ID</th>
    <th width="116" scope="col">短息发送人</th>
    <th width="107" scope="col">短息接收人</th>
    <th width="391" scope="col">内容</th>
    <th width="133" scope="col">时间</th>
  </tr>
  <s:iterator value="#request.noreadlist" var="sms">
  <tr>
    <td><s:property value="#sms.smsId"/></td>
    <td><s:property value="#sms.sendUName"/></td>
    <td><s:property value="#sms.resvUName"/></td>
    <td><s:property value="#sms.smsContent"/></td>
    <td><s:property value="#sms.smsDate"/></td>
  </tr>
  </s:iterator>
</table>
  </body>
</html>
