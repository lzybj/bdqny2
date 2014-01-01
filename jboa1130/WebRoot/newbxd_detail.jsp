<%@page import="com.lzybj.hibernate.domain.SysDictionary"%>
<%@page import="com.lzybj.service.SysDictionaryService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="auths.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newbxd_detail.jsp' starting page</title>
    
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
<form id="form1" name="form1" method="post" action="createbxddetail.action">
  <p>项目：
    <label for="item"></label>
    <select name="itemid" id="item">
    <%
    		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
    		SysDictionaryService itemservice = (SysDictionaryService)wac.getBean("itemservice");
    		List<SysDictionary> data = itemservice.findByAll();
    		for(SysDictionary item : data){
    %>
      <option value='<%= item.getId()%>'><%= item.getItem()%></option>
      <%
    		}
      %>
    </select>
  </p>
  <p>金额：
    <label for="jiner"></label>
    <input type="text" name="jiner" id="jiner" />
  </p>
  <p>说明：
    <label for="desc"></label>
    <input type="text" name="desc" id="desc" />
  </p>
  <p>
    <input type="submit" name="button" id="button" value="保存并继续" />
  </p>
  <p>
     <a href="ylviewbxd.action">预览</a>
  </p>
</form>
  </body>
</html>
