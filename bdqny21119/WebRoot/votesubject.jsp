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
    
    <title>My JSP 'votesubject.jsp' starting page</title>
    
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
    <p><s:property value="vsub.vsTitle"/> </p>
    <p>共有<s:property value="voptions.size"/>个选项，已有<s:property value="usercount"/>个网友参与了投票</p>
    <s:form action="tp.action">
    <s:iterator id="vp" value="voptions">
    		<s:if test="vsub.vsType == 1">
    			<input type="radio" name="viid" value='<s:property value="#vp.voId"/>' /><s:property value="#vp.voOption"/><br> 
    		</s:if>
    		<s:else>
    			<input type="checkbox" name="viid" value="<s:property value="#vp.voId"/>"/><s:property value="#vp.voOption"/><br>
    		</s:else>
    </s:iterator>
    	<s:submit value="投票"></s:submit>
    	<s:a href="viewtotal.action?vsid=%{vsub.vsId}">查看</s:a>
    </s:form>
  </body>
</html>
