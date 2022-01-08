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
		<c:forEach var="diary" items="${diaryLists}" varStatus="s">
			<table border="1px solid black">
				<tr>
					<th>번호</th>
					<th colspan="2">제목</th>
					<th colspan="2">작성자</th>
					<th>시간</th>
				</tr>
				<tr>
					<td>${diary.diaryCode}</td>
					<td colspan="2"><a href="DetailDiary?code=${diary.diaryCode}">${diary.title}</a></td>
					<td colspan="2">${diary.userid}</td>
					<td>${diary.diaryDate}</td>
				</tr>
				<tr>
					<td colspan="6"><textarea rows="10" cols="60" readonly>${diary.content}</textarea></td>
				</tr>
			</table>
		</c:forEach>
		<a href="writeDiary.jsp">일기 작성해볼까!</a>
</div>
</body>
</html>