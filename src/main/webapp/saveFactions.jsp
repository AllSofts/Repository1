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
	<form action="saveFactions" method ="post">
		<input type="hidden" name="oldid" value="${requestScope.factions.id}"><br>
		id:<input type="text" name="id" value="${requestScope.factions.id}"><br>
		factionsname:<input type="text" name="factionsname"  value="${requestScope.factions.factionsname}"><br>
		factionsdescribe:<input type="text" name="factionsdescribe" value="${requestScope.factions.factionsdescribe}"><br>
		number:<input type="text" name="number" value="${requestScope.factions.number}"><br>
		<button type="submit">--提交--</button>
		
	</form>
</body>
</html>