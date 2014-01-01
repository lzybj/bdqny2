<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
<form id="form1" name="form1" method="post" action="users.do?method=login">
  <p>

    <label for="uname"><bean:message key="login.info.uname"/></label>
    <input type="text" name="uname" id="uname" />
    <html:errors property="uname_err" />
  </p>
  <p>
    <label for="upwd"><bean:message key="login.info.upwd"/></label>
    <input type="password" name="upwd" id="upwd" />
    <html:errors property="upwd_err"/>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="提交" />
  </p>
</form>    
  </body>
</html>
