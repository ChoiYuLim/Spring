<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	새글입니다.
	<div>
		<form action="${pageContext.request.contextPath}/board/new"
			method="post">
			<table>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td><input type="text" name="writer"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><input type="text" name="content"></td>
				</tr>
			</table>
			<input type="submit" value="새글쓰기">
		</form>
	</div>
</body>
</html>