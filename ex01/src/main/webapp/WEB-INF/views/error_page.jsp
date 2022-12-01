<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error_page</title>
</head>
<body>
	<h2 style="background: black; color:yellow;">오류 발생</h2>
	<c:forEach items="${exception.stackTrace }" var="stack">
		<li>${stack}</li>
	</c:forEach>
</body>
</html>