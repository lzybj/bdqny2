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
    
    <title>My JSP 'sp_bxd_detail.jsp' starting page</title>
    
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
<s:form action="spbxd.action">
    <p>填写人：<s:property value="bxd.sysEmployeeByCreateSn.name"/>                 总金额：<s:property value="bxd.totalAcount"/></p>
    <p>时间：<s:property value="bxd.createTime"/>                   状态：<s:property value="bxd.status"/> </p>
    <p>报销单明细</p>
<table width="457" height="50" border="2" cellpadding="1">
  <tr>
    <th width="122" scope="col">项目</th>
    <th width="100" scope="col">金额</th>
    <th width="211" scope="col">说明</th>
  </tr>
  <s:iterator id="detail" value="bxd.bizClaimVoucherDetails">
  <tr>
    <td><s:property value="#detail.sysDictionary.item"/></td>
    <td><s:property value="#detail.account"/></td>
    <td><s:property value="#detail.des"/></td>
  </tr>
  </s:iterator>
</table>
----------------------------------------------------
<s:iterator id="res" value="bxd.bizCheckResults">
<p><s:property value="#res.sysEmployee.sysPosition.nameEn"/>(<s:property value="#res.sysEmployee.sysPosition.nameCn"/>)        日期：<s:property value="#res.checkTime"/>          审核结果:<s:property value="#res.result"/> </p>
<p>审核意见：<s:property value="#res.comm"/></p>
</s:iterator>
<p><s:textarea label="审核意见" name="comm" ></s:textarea></p>
<p>
<s:hidden name="bxdid" value="%{bxd.id}"></s:hidden>
<s:submit name="res" value="审核通过"></s:submit>
<s:if test="#session.se.sysPosition.nameEn != 'CW'">
<s:submit name="res" value="审核拒绝"></s:submit>
<s:submit name="res" value="打回"></s:submit>
</s:if>
</p>
</s:form>
  </body>
</html>
