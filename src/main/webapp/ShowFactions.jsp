<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
  .tab{border-top:1px solid #000;border-left:1px solid #000;text-align:center}
  .tab td{border-bottom:1px solid #000;border-right:1px solid #000;}
  
</style>
<body>
	<h1>江湖门派统计表</h1>
	<a href="addFactions.jsp">门派添加</a><br>
	<a href="index.jsp">江湖门派管理首页</a>
	<table  class="tab" cellspacing="0" cellpadding="0" width="600" height="400">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>describe</td>
			<td>number</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.list}" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.factionsname}</td>
			<td>${item.factionsdescribe}</td>
			<td>${item.number}</td>
			<td><a href="deleteFactions?id=${item.id}">删除</a>
			<a href="updateFactions?id=${item.id}">更新</a> </td>
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>