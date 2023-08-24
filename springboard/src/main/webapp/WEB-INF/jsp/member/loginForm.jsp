<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지 입니다.</h1>
	<div align="left">
		<form action="${pageContext.request.contextPath}/login" method="post">
			id: <input type="text" name="id"><br> password: <input
				type="password" name="password"><br> <input
				type="submit" value="로그인">
		</form>
	</div>
</body>
</html>