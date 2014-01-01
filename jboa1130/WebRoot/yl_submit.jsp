<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ include file="auths.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'yl_submit.jsp' starting page</title>
    
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
<form id="form1" name="form1" method="post" action="submitbxd.action">
<p>填报人：<s:property value="#session.se.name"/></p>
<p>总金额：<s:property value="#session.bxdtemp.totalAcount"/> </p>
<p>状态：<s:property value="#session.bxdtemp.status"/></p>
<p>事由：<s:property value="#session.bxdtemp.enent"/></p>
<table width="457" height="50" border="2" cellpadding="1">
  <tr>
    <th width="122" scope="col">项目</th>
    <th width="100" scope="col">金额</th>
    <th width="211" scope="col">说明</th>
  </tr>
  <s:iterator id="detail" value="#session.bxdtemp.bizClaimVoucherDetails">
  <tr>
    <td><s:property value="#detail.sysDictionary.item"/></td>
    <td><s:property value="#detail.account"/></td>
    <td><s:property value="#detail.des"/></td>
  </tr>
  </s:iterator>
</table>
  <input type="submit" name="submit" id="button" value="新创建" />
  <input type="submit" name="submit" id="button2" value="新创建并提交" />
</form>
  </body>
</html>
