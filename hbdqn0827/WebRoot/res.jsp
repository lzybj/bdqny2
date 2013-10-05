<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${infos != null }">
<table width="944" height="70" border="3">
  <tr>
    <th width="123" scope="col">区县</th>
    <th width="133" scope="col">街道</th>
    <th width="140" scope="col">户型</th>
    <th width="132" scope="col">价格</th>
    <th width="138" scope="col">发布人</th>
    <th width="234" scope="col">时间</th>
  </tr>
  <c:forEach var="resobj" items="${infos }">
  <tr>
    <td>${resobj.dname }</td>
    <td>${resobj.sname }</td>
    <td>${resobj.htname }</td>
    <td>${resobj.price }</td>
    <td>${resobj.uname }</td>
    <td>${resobj.htime }</td>
  </tr>
  </c:forEach>
</table>
</c:if>
<c:if test="${infos == null }">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>