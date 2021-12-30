<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상세 페이지</h2>
상품이름 : <%=session.getAttribute("name")%><br>
상품코드 : <%=session.getAttribute("pdtCode")%><br>
가격 : <%=session.getAttribute("price")%><br>
제조사 : <%=session.getAttribute("loc")%><br>
주요원료 : <%=session.getAttribute("mtl")%><br>
품절상태 : <%=session.getAttribute("sdt")%><br>

</body>
</html>