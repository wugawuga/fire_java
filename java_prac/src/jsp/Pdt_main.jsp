<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.wuga.beans.Pdt_beans"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상품정보</h2>
	
	<%
		List<Pdt_beans> s = (List<Pdt_beans>)request.getAttribute("list"); 
	%>
	<%
		for(int i=0; i<s.size(); i++){ 
	%>
	<%=s.get(i).getName()%><br>
	<%
		}
	%>
</body>
</html>