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
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <p>欢迎您，当前登录用户为：<s:property value="#session.se.sysDepartment.name"/> --<s:property value="#session.se.sysPosition.nameCn"/>--<s:property value="#session.se.name"/></p>
    <s:if test="#session.se.sysPosition.nameEn == 'YG'">
    <p><a href="newbxd.jsp">创建报销申请单</a></p>
    <p>查看我的所有报销单</p>
    </s:if>
    <s:else>
    <p><a href="viewdshlist.action">查看所有待审核的报销单列表</a></p>
    </s:else>
  </body>
</html>
