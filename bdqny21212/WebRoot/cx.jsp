<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
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

  </head>
  
  <body>
<logic:notEmpty name="c" scope="session">
<form id="form1" name="form1" method="post" action="cx.do?method=cx">
  <p>
    <label for="cname">用户名：</label>
    <input type="text" name="cname" id="cname" />
    <html:errors property="cname_err"/>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="提交" />
  </p>
</form>
</logic:notEmpty>
<logic:empty name="c" scope="session">
<logic:redirect forward="nologin"></logic:redirect>
</logic:empty>
  </body>
</html>
