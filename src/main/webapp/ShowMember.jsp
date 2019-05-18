<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  .tab{border-top:1px solid #000;border-left:1px solid #000;text-align:center}
  .tab td{border-bottom:1px solid #000;border-right:1px solid #000;}
  
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>江湖门派人才管理</h1>
	<div><a href="index.jsp">江湖管理页面首页</a> </div>
	<a href="addMember.jsp">为门派添加人才</a>
	<table   class="tab" cellspacing="0" cellpadding="0" width="600" height="400">
		<tr>
			<td>所属帮派</td>
			<td>帮派简介</td>
			<td>个人id</td>
			<td>帮派id</td>
			<td>姓名</td>
			<td>个人简介</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.list}" var = "item">
			<tr>
				<td>${item.factions.factionsname}</td>
				<td>${item.factions.factionsdescribe}</td>
				<td>${item.selfid}</td>
				<td>${item.factionsid}</td>
				<td>${item.selfname}</td>
				<td>${item.introduction}</td>
				<td><a href="deleteMember?selfid=${item.selfid}">删除</a> 
				<a href="updateMember?selfid=${item.selfid}">更新</a> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>