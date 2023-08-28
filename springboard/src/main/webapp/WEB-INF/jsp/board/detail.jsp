<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script>
	$(document).ready(function() {
		showReplyList();
		
		$(document).on('click','.delBtn', function(){
			
			let replyNo = $(this).attr('id');
			
			// reply/{replyNo}, delete
			$.ajax({
				url: '${pageContext.request.contextPath}/reply/'+replyNo,
				method:'delete',
				success:function(){
					showReplyList();
				},
				error:function(){
					alert('delete 실패')
				}
			})
			
		})
		
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
					showReplyList();
				},
				error: function(){alert('insert 실패')}
			
			})
		})
	})
	
	function showReplyList(){
		//1. ajax reply list select
		//2. 화면에 보여주는 작업
		
		$.ajax({
			url: '${pageContext.request.contextPath}/reply/${boardVO.no}',
			method:'get',
			success: function(data){
				console.log(data)
				console.log(typeof data)
				$('#replyList').empty();
				
				$(data).each(function(){
					str='<hr>';
					str += '<strong>'+this.content +'</strong>'; 
					str += '&nbsp;' + this.writer; + '&nbsp;';
					str += '&nbsp;' + this.regDate + '&nbsp;';
					str += '<button class="delBtn" id= ' + this.no +' />삭제</button>'
					$('#replyList').append(str);
				})
				// replyList에 보여줄 것
			},
			error: function(){
				alert('showReplyList 실패');
			}
		})
	}
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
	<div id="replyList"></div>
</body>
</html>