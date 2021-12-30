<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상품 등록</h2>
	<form action="Pdt_chang" method="post">
		상품명 : <input type="text" name="name"><br>
		상품코드 : <input type="text" name="pdtCode"><br>
		가격 : <input type="text" name="price"><br>
		제조사 : <input type="text" name="loc"><br>
		주요원료 : <input type="text" name="mtl"><br>
		품절여부 : <input type="text" name="sdt"><br>
		<input type="submit" value="작성하기"><br>
	</form>
</body>
</html>