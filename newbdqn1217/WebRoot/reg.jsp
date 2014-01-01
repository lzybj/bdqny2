<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
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
  <form id="form1" name="form1" method="post" action="reg.do">
  <p>
    <label for="cname">用户名：</label>
    <input type="text" name="cname" id="cname" />
  </p>
  <p>
    <label for="cpwd">密码：</label>
    <input type="password" name="cpwd" id="cpwd" />
  </p>
  <p>
    <input type="submit" name="button" id="button" value="注册" />
  </p>
</form>
  </body>
</html>
