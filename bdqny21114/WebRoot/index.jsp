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
    
    <title>My JSP 'index.jsp' starting page</title>
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
  	
    <s:set name="mystr" value="'laozheng'"></s:set>
    <s:set name="list" value="{'laoli','laozheng','laowang'}"></s:set>
    <s:set name="mymap" value="#{'laoli':'老李','laozheng':'老郑','laowang':'老王'}"></s:set>
    <s:property value="#mystr"/><br>
    人名：<s:property value="#list[2]"/><br>
    大小：<s:property value="#list.size"/><br>
    获取map(1):<s:property value="#mymap['laowang']"/><br>
    获取map(2):<s:property value="#mymap.laowang"/><br>
    <s:iterator id="my" value="#mymap" >
    		<s:set name="mykey" value="key"></s:set>
    		<s:set name="myvalue" value="value"></s:set>
    		<s:property value="#mykey"/>-----<s:property value="#myvalue"/><br>
    </s:iterator>
    <a href='res.jsp'>res</a>
  </body>
</html>
