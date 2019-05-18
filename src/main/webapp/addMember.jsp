<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="findAllMember"><h3>江湖帮派人才展示</h3></a>
	<form action="AddMember" method="POST">
	
		selfid:<input type="text" name="selfid">
	所属帮派：	<select name="factionsid">
					<option value="-1">-请选择-</option>
					<c:forEach items="${requestScope.list}" var = "item">
						<option value ="${item.id}">${item.factionsname}</option>
					</c:forEach>
				</select>
	姓名：	<input type="text" name="selfname">
	个人简介：<input type="text" name="introduction">
	<input type="submit" value="add"></input>
	
	</form>
	
</body>
</html>