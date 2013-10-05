<%@page import="com.bdqn.hibernate.domain.HosDistrict"%>
<%@page import="com.bdqn.hibernate.service.DistrictService"%>
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
    
    <title>My JSP 'cx.jsp' starting page</title>
    
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
<c:if test="${sessionScope.districts != null }">
<form id="form1" name="form1" method="post" action="" onsubmit="return mycx();">
  <label for="select">区县</label>
  <select name="district" id="district" onchange="loadstreet()">
  	<option value="0">全部</option>
  	<c:forEach var="hd" items="${sessionScope.districts }">
  		<option value="${hd.did }">${hd.dname }</option>
  	</c:forEach>
  </select>
  <label for="select2">街道</label>
  <select name="street" id="street">
  </select>
  <label for="select3">户型</label> 
  <select name="htid" id="htid">
  <option value="0">全部</option>
  	<c:forEach var="type" items="${sessionScope.types }">
  		<option value="${type.htid }">${type.htname }</option>
  	</c:forEach> 
  </select>
  <label for="textfield">价格</label>
  <input type="text" name="dayu" id="dayu" />
  <label for="textfield2">至</label>
  <input type="text" name="xiaoyu" id="xiaoyu" />
  <label for="select4">排序</label>
  <select name="orderby" id="orderby">
  	<option value="price asc">价格由低到高</option>
    <option value="price desc">价格由高到低</option>
    <option value="time asc">时间由低到高</option>
    <option value="time desc">时间由高到低</option>
  </select>
  <label for="textfield3">发布人</label>
  <input type="text" name="uname" id="uname" />
  <input type="submit" name="button" id="button" value="提交" />
</form>
</form>
</c:if>
<c:if test="${sessionScope.districts == null }">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>
<div id="myres"></div>
  </body>
</html>
