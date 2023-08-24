<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	환영합니다. 첫 페이지에요.
	<a href="${pageContext.request.contextPath}/board">게시판</a>
	<a href="${pageContext.request.contextPath}/board/new">글쓰기</a>
	<a href="${pageContext.request.contextPath}/login">로그인</a>
</body>
</html>