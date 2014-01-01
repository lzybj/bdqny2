<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  <script type='text/javascript' src='/mydwr/dwr/interface/myservice.js'></script>
  <script type='text/javascript' src='/mydwr/dwr/engine.js'></script>
  <script type='text/javascript' src='/mydwr/dwr/util.js'></script>
  <script type="text/javascript">
  	function sayhi(){
  		var cname = document.getElementById("cname").value;
  		myservice.sayhello(cname,function(data){
  			document.getElementById("myinfo").innerHTML = data;
  		});
  	}
  </script>
  </head>
  
  <body>
  <input id="cname" name="cname" type="text">
  <input value="提交" type="button" onclick="sayhi()">
  <div id="myinfo"></div>
  </body>
</html>
