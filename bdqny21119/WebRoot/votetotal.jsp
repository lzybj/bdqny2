<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'votetotal.jsp' starting page</title>
    
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
    <p><s:property value="vsubject.vsTitle"/></p>
    <p>共有<s:property value="vto.size"/>选项，已有<s:property value="vucount"/>个网友参与投票</p>
    <s:iterator id = "vt" value="vto">
    <p><div style="background:#F00; height:12px; width:<s:property value='#vt.numlv'/>"></div><s:property value="#vt.num" />票(<s:property value="#vt.numlv"/>)</p>
    </s:iterator>
  </body>
</html>
