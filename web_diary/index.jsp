<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일기 리스트</title>
</head>
<body>
<div>
	<h1>일기장</h1>
	<table border="1px solid black">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>시간</th>
		</tr>
		<c:forEach var="diary" items="${diaryLists}" varStatus="s">
			<tr>
				<td>${diary.code}</td>
				<td>${diary.title}</td>
				<td>${diary.date}</td>
				<td> <a href="diaryUpdate?code=${diary.code}"> 일기 수정</a></td>
				<td> <a href="diaryDelete?code=${diary.code}"> 상품 삭제</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6" style="border:white; text-align:right">
				<a href="diaryWrite">일기 등록</a>
			</td>
		</tr>
	</table>
</div>
</body>
</html>