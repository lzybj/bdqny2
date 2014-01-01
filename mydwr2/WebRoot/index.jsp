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
  <script type='text/javascript' src='/mydwr2/dwr/interface/cservice.js'></script>
  <script type='text/javascript' src='/mydwr2/dwr/engine.js'></script>
  <script type='text/javascript' src='/mydwr2/dwr/util.js'></script>
  <script type="text/javascript">
  	function myload(){
  		cservice.findByAll(function(data){
  			showtable(data);
  		});
  	}
  	function showtable(data){
  		for(var i = 0;i < data.length;i++){
  			var rowcount = document.getElementById("mytable").rows.length;
  			var row = document.getElementById("mytable").insertRow(rowcount);
  			row.insertCell(0).innerHTML = data[i].cid;
  			row.insertCell(1).innerHTML = data[i].cname;
  			row.insertCell(2).innerHTML = data[i].cpwd;
  		}
  	}
  </script>
  </head>
  
  <body onload="myload()">
<table id="mytable" width="200" border="2" cellpadding="1">
  <tr>
    <th scope="col">cid</th>
    <th scope="col">cname</th>
    <th scope="col">cpwd</th>
  </tr>
</table>
  </body>
</html>
