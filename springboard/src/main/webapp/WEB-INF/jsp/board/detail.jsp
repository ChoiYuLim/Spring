<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>
<script>
	$(document).ready(function() {
		$('#replyAddBtn').click(function() {
			let replyContent = document.replyForm.content.value;
			let replyWriter = document.replyForm.writer.value;
			
			$.ajax({
				url: '${pageContext.request.contextPath}/reply',
				method: 'post',
				data: {
					boardNo: ${boardVO.no},
					content: replyContent,
					writer: replyWriter
					
				},
				success: function(){
					alert('insert 성공')
					document.replyForm.content.value="";
					document.replyForm.writer.value="";
				},
				error: function(){alert('insert 실패')}
			
			})
		})
	})
</script>
</head>
<body>
	상세 게시글입니다.

	<div align="center">
		<table border="1">
			<tr>
				<th>번호</th>
				<td>${boardVO.no}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${boardVO.title}</td>
			</tr>
			<tr>
				<th>지은이</th>
				<td>${boardVO.writer}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${boardVO.reg_date}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${boardVO.content}</td>
			</tr>
		</table>
		<input type="button" value="Home"
			onclick="location.href='${pageContext.request.contextPath}/'">
		<input type="button" value="목록으로"
			onclick="location.href='${pageContext.request.contextPath}/board'">
		<input type="button" value="삭제"
			onclick="location.href='${pageContext.request.contextPath}/'">
	</div>
	<div>
		<form name="replyForm">
			댓글: <input type="text" size="80" name="content"> 작성자: <input
				type="text" size="20" name="writer"> <input type="button"
				value="댓글쓰기" id="replyAddBtn">
		</form>
	</div>
</body>
</html>