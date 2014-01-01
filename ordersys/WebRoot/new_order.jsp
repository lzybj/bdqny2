<%@page import="com.lzybj.hibernate.domain.Customers"%>
<%@page import="com.lzybj.service.CustomersService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
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
    
    <title>My JSP 'new_order.jsp' starting page</title>
    
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
    <s:form action="createneworder">
    		<p>
    		  <label for="客户"></label>
    		  <select name="customerid" id="select">
    		  <%
    		  	WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
    		    CustomersService cs = (CustomersService)wac.getBean("cusservice");
    			List<Customers> data = cs.findByAll();
    			for(Customers c : data){
    		  %>
    		  	<option value='<%= c.getCusid()%>'><%= c.getCusname()%></option>
    		  <%
    			}
    		  %>
    		  </select>
    		</p>
    		<s:textfield name="delivername" label="收货人"></s:textfield>
    		<s:textfield name="deliveraddr" label="收货地址"></s:textfield>
    		<s:submit value="下一步"></s:submit>
    </s:form>
  </body>
</html>
