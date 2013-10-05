<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cxjsp' starting page</title>
    
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
<c:if test="${districts != null}">
<form id="form1" name="form1" method="post" onsubmit="return getres();" action="">
  <label for="select">区县:</label>
  <select name="district" id="district" onchange="geths()">
  <option value="0">全部</option>
  <c:forEach var="hd" items="${districts }">
  <option value="${hd.did }">${hd.dname }</option>
  </c:forEach>
  </select>
  <label for="select2">街道:</label>
  <select name="street" id="street">
  </select>
  <label for="htype">户型：</label>
  <select name="htype" id="htype">
  <option value="0">全部</option>
  <c:forEach var="ht" items="${types }">
  	<option value="${ht.htid }">${ht.htname }</option>
  </c:forEach>
  </select>
  <label for="bprice">价格：</label>
  <input type="text" name="bprice" id="bprice" /> 
  至
  <label for="eprice"></label>
  <input type="text" name="eprice" id="eprice" />
  <label for="orderby">排序</label>
  <select name="orderby" id="orderby">
  <option value="bprice">价格从低到高</option>
  <option value="eprice">价格从高到底</option>
  <option value="bhtime">时间从高到低</option>
  <option value="ehtime">时间从低到高</option>
  </select>
  <label for="uname">发布人:</label>
  <input type="text" name="uname" id="uname" />
  <input type="submit" name="button" id="button" value="提交" />
</form>
</c:if>
<c:if test="${districts == null }">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>
<div id="res"></div>
  </body>
</html>
