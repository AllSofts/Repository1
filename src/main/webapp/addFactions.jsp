<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="findAllFactions">门派列表</a>
<form action="AddFactions" method="POST">
	id:<input type="text" name="id"><br>
	门派名称:<input type="text" name="factionsname"><br>
	门派描述：<input type="text" name="factionsdescribe"><br>
	门派人数：<input type="text"  name="number"><br>
	<input type="submit" value="add"></input>
</form>
</body>
</html>