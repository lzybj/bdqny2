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
    
    <title>My JSP 'bxd_dsh_list.jsp' starting page</title>
    
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
  <table width="734" height="50" border="2" cellpadding="1">
  <tr>
    <th scope="col">编号</th>
    <th scope="col">日期</th>
    <th scope="col">填报人</th>
    <th scope="col">总金额</th>
    <th scope="col">状态</th>
    <th scope="col">操作</th>
  </tr>
  <s:iterator id="bxd" value="bxds">
  <tr>
    <td><s:property value="#bxd.id"/></td>
    <td><s:property value="#bxd.createTime"/></td>
    <td><s:property value="#bxd.sysEmployeeByCreateSn.name"/></td>
    <td><s:property value="#bxd.totalAcount"/></td>
    <td><s:property value="#bxd.status"/></td>
    <td align="center"><s:a href="viewspbxddetail.action?bxdid=%{#bxd.id}">操作</s:a></td>
  </tr>
  </s:iterator>
</table>
  </body>
</html>
