<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
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
<form action="OADD" method="get">
	<select name="cfname">
		<c:forEach var="cafe" items="${cList}" varStatus="cs">
				<option value="${cafe.name}">${cafe.name}</option>
		</c:forEach>
	</select>
	<select name="size">
		<option value="톨">톨</option>
		<option value="그란데">그란데</option>
		<option value="벤티">벤티</option>
	</select>
	<input type="number" name="zan"> 잔
	<input type="submit" value="주문하기">
</form>

<table border="solid 1px black">
	<tr>
		<th>커피 종류</th>
		<th>사이즈</th>
		<th>잔</th>
		<th>가격</th>
	</tr>
	<c:forEach var="ord" items="${ords}" varStatus="cs">
		<tr>
			<td>${ord.cfname}</td>
			<td>${ord.size}</td>
			<td>${ord.zan}</td>
			<td>${ord.price}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>