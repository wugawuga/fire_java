<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>우가 카페</h3>
<table border="solid 1px black">
	<tr>
		<th>커피 명</th>
		<th>톨</th>
		<th>그란데</th>
		<th>벤티</th>
	</tr>
	<c:forEach var="cafe" items="${cList}" varStatus="cs">
		<tr>
			<td>${cafe.name}</td>
			<td>${cafe.tall}</td>
			<td>${cafe.grande}</td>
			<td>${cafe.venti}</td>
		</tr>
	</c:forEach>
</table>
<hr>
<form action="#" method="get">
	<select>
		<c:forEach var="cafe" items="${cList}" varStatus="cs">
				<option value="${cafe.name}">${cafe.name}</option>
		</c:forEach>
	</select>
	<select>
		<option>톨</option>
		<option>그란데</option>
		<option>벤티</option>
	</select>
	<input type="number"> 잔
	<input type="submit" value="주문하기">
</form>

</body>
</html>