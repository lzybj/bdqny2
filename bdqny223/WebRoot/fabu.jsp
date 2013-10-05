<%@page import="com.bdqn.hibernate.domain.FilmType"%>
<%@page import="com.bdqn.hibernate.servlce.FilmTypeService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fabu.jsp' starting page</title>
    
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
<%
	FilmTypeService fts = new FilmTypeService();
	List<FilmType> data = fts.findByAll();
%>
<%
	if(session.getAttribute("errmsg") != null){
		session.removeAttribute("errmsg");
		out.println("<h1>对不起，发布失败！</h1>");
	}
%>
<form id="form1" name="form1" method="post" action="addfilmaction">
  <p>
    <label for="filmname">电影名称</label>
    <input type="text" name="filmname" id="filmname" />
  </p>
  <p>
    <label for="typeid">电影类型</label>
    <select name="typeid" id="typeid">
      <option value="0">全部</option>
      <%
      	for(FilmType ft : data){
      		%>
       <option value="<%= ft.getTypeid()%>"><%= ft.getTypename()%></option>
      		<%
      }
      %>
    </select>
  </p>
  <p>
    <label for="actor">主演</label>
    <input type="text" name="actor" id="actor" />
  </p>
  <p>
    <label for="director">导演</label>
    <input type="text" name="director" id="director" />
  </p>
  <p>
    <label for="ticketprice">票价</label>
    <input type="text" name="ticketprice" id="ticketprice" />
  </p>
  <p>
    <input type="submit" name="button" id="button" value="提交" />
  </p>
</form>
  </body>
</html>
