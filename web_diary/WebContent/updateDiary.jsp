<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일기 수정</title>
</head>
<body>
	<h2>일기 수정</h2>
	<form action="UpdateDiary" method="post">
		<table border="1px solid black">
			<tr>
				<th>번호</th>
				<th colspan="5">${diaryVo.diaryCode}<input type="hidden" name="diaryCode" value="${diaryVo.diaryCode}"></th>
			</tr>
			<tr>
				<th>제목</th>
				<th colspan="5"><input type="text" name="title" required="required" value="${diaryVo.title}"></th>
			</tr>
			<tr>
				<th>시간 (현재 시간으로 수정됨)</th>
				<th colspan="5">${diaryVo.diaryDate}</th>
			</tr>
			<tr>
				<td colspan="6"><textarea rows="10" cols="60" name="content" required="required">${diaryVo.content}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="reset" value="다시 작성"></td>
				<td colspan="2"><input type="submit" value="수정"></td>
				<td colspan="2"><input type="button" value="목록" onclick="location.href='SAD'"></td>
			</tr>
		</table>
	</form>
</body>
</html>