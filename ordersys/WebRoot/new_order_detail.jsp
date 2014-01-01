<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="com.lzybj.hibernate.domain.Products"%>
<%@page import="com.lzybj.service.ProductsService"%>
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
    
    <title>My JSP 'new_order_detail.jsp' starting page</title>
    
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
    <s:form action="createorderdetails.action">
    <p>
    		<select name="prodid" id="select">
    		  <%
    		  	WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
    		    ProductsService ps = (ProductsService)wac.getBean("productsservice");
    			List<Products> data = ps.findByAll();
    			for(Products p : data){
    		  %>
    		  	<option value='<%= p.getProdid()%>'><%= p.getProdname()%></option>
    		  <%
    			}
    		  %>
    		</select>
    	</p>
    	<s:textfield name="prodcount" label="数量"></s:textfield>
    	<s:submit name="submit" value="继续添加"></s:submit>
    	<s:a href="yl_order.jsp">预览</s:a>
    </s:form>
  </body>
</html>
