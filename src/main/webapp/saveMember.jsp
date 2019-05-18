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

	<form action="SaveMember" method="POST" >
		<input type="hidden" name="oldselfid" value="${requestScope.member.selfid}"><br>
		
		selfid:<input type="text" name="selfid" value="${requestScope.member.selfid}"><br>

		选择帮派：<select name="factionsid">
					<option value="-1">选择</option>
					<c:forEach items="${requestScope.list}" var="item">
							
			                <c:if test="${requestScope.member.factionsid==item.id}">
			                   <option value="${item.id}" selected="selected" >${item.factionsname}</option>
			                </c:if>
			           
			               <c:if test="${requestScope.member.factionsid!=item.id}">
			               		<option value="${item.id}">${item.factionsname}</option>
			               </c:if>
			               
					</c:forEach>
				</select><br>
		selfname:<input type="text" name="selfname" value="${requestScope.member.selfname}"><br>
		introduction:<input type="text" name="introduction" value="${requestScope.member.introduction}"><br>
		<button type="submit">-提交-</button>
		
		
	</form>
	

</body>
</html>