<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script type="text/javascript" src="js/ck.js"></script>
  </head>
  
  <body>
  <form id="form1" name="form1" method="post" action="">
  <p>
    <input type="text" name="uname" id="uname" onblur="ckuname()"/>
    <div id="msg"></div>
  </p>
  <p>
    <input type="text" name="upwd" id="upwd" />
  </p>
  <p>
    <label for="textfield3"></label>
    <input type="submit" name="button" id="button" value="提交" />
  </p>
</form>
  </body>
</html>
