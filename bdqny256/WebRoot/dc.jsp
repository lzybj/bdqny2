<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dc.jsp' starting page</title>
    
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
<form id="form1" name="form1" method="post" action="adddc.action">
  <p>
    <input type="checkbox" name="ah" id="ah" value="篮球"/>
    <label for="ah"></label>
    篮球</p>
  <p>
    <input type="checkbox" name="ah" id="ah2" value="足球"/>
    <label for="ah2"></label>
  足球</p>
  <p>
    <input type="checkbox" name="ah" id="ah3" value="乒乓球"/>
    <label for="ah3"></label>
  乒乓球</p>
  <p>
    <input type="checkbox" name="checkbox" id="checkbox" value="排球"/>
    <label for="checkbox"></label>
  排球</p>
  <p>
    <label for="uname">调查人名：</label>
    <input type="text" name="uname" id="uname" />
  </p>
  <p>
    <input type="submit" name="button" id="button" value="提交" />
  </p>
</form>
  </body>
</html>
