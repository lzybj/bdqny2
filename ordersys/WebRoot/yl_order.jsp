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
    
    <title>My JSP 'yl_order.jsp' starting page</title>
    
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
  <s:form action="ordersubmit.action">
    <p>订货人：<s:property value="#session.temporder.customers.cusname"/>         收货人：<s:property value="#session.temporder.orddelivername"/>              收货地址：<s:property value="#session.temporder.orddeliveraddr"/></p>
 <table width="511" height="51" border="2" cellpadding="1">
  <tr>
    <th scope="col">产品名称</th>
    <th scope="col">单价</th>
    <th scope="col">数量</th>
    <th scope="col">总价</th>
  </tr>
  <s:iterator id="od" value="#session.temporder.orderdetailses">
  <tr>
    <td><s:property value="#od.products.prodname"/></td>
    <td><s:property value="#od.products.prodprice"/></td>
    <td><s:property value="#od.odprodcount"/></td>
    <td><s:property value="#od.total"/></td>
  </tr>
  </s:iterator>
</table>
	<s:submit value="提交"></s:submit>
</s:form>
  </body>
</html>
