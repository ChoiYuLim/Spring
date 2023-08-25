<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	환영합니다. 첫 페이지에요.
	<br />
	<a href="${pageContext.request.contextPath}/board">게시판</a>
	<br />
	<a href="${pageContext.request.contextPath}/board/new">새글쓰기</a>
	<br />
	<a href="${pageContext.request.contextPath}/signup">회원가입하기</a>
	<br />

	<c:if test="${empty currentUser}">
		<a href="${pageContext.request.contextPath}/login">로그인하기</a>
		<br />
	</c:if>
	<c:if test="${not empty currentUser}">
	  	${currentUser.name}님 안녕하세요.<br>
		<a href="${pageContext.request.contextPath}/logout">로그아웃</a>
		<br />
	</c:if>

</body>
</html>