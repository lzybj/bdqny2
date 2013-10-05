<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table width="869" height="52" border="2" cellpadding="1">
  <tr>
    <th scope="col">区县</th>
    <th scope="col">街道</th>
    <th scope="col">户型</th>
    <th scope="col">价格</th>
    <th scope="col">发布人</th>
    <th scope="col">时间</th>
  </tr>
  <c:forEach var="res" items="${data }">
  <tr>
    <td>${res.dname }</td>
    <td>${res.sname }</td>
    <td>${res.htname }</td>
    <td>${res.price }</td>
    <td>${res.uname }</td>
    <td>${res.htime }</td>
  </tr>
  </c:forEach>
</table>
