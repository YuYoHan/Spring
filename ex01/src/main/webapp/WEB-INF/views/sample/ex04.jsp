<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04</title>
</head>
<body>
	<h1>ex04</h1>
	<p>
		<c:forEach items="${datas }" var="data">
			${data } <br/>
		</c:forEach>
		총합 : ${sum}
	</p>
	
</body>
</html>