<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>일기작성</h2>
	<form action="WD" method="get">
		<table border="1px solid black">
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" required="required"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="60" name="content" required="required"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="작성"></td>
				<td><input type="button" value="목록" onclick="location.href='SAD'"></td>
			</tr>
		</table>
	</form>
</body>
</html>