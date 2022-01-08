<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일기 상세보기</title>
</head>
<body>
	<h2>일기 상세보기!</h2>
	<table border="1px solid black">
		<tr>
			<th>번호</th>
			<th colspan="5">${diaryVo.diaryCode}</th>
		</tr>
		<tr>
			<th>제목</th>
			<th colspan="5">${diaryVo.title}</th>
		</tr>
		<tr>
			<th>시간</th>
			<th colspan="5">${diaryVo.diaryDate}</th>
		</tr>
		<tr>
			<td colspan="6"><textarea rows="10" cols="60" readonly>${diaryVo.content}</textarea></td>
		</tr>
		<tr>
			<td colspan="2"><a href="UpdateDiary?code=${diaryVo.diaryCode}">일기 수정</a></td>
			<td colspan="2"><a href="DeleteDiary?code=${diaryVo.diaryCode}">일기 삭제</a></td>
			<td colspan="2"><input type="button" value="목록" onclick="location.href='SAD'"></td>
		</tr>
	</table>
</body>
</html>