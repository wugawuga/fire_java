<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="com.wuga.Cafe" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!

	String url = "jdbc:oracle:thin:@wugawuga_high?TNS_ADMIN=/Users/wugawuga/Downloads/Wallet_wugawuga"; 
	String uId = "admin";
	String uPw = "dbswjddnr321Tt!";
	
%>
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "SELECT * FROM cafe";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	List<Cafe> cList = new ArrayList<>();
	try{

		conn = DriverManager.getConnection(url, uId, uPw);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		while(rs.next()){
			String name = rs.getString("name");
			int tall=rs.getInt("tall");
			int grande=rs.getInt("grande");
			int venti=rs.getInt("venti");
			
			Cafe c = new Cafe();
			c.setName(name);
			c.setTall(tall);
			c.setGrande(grande);
			c.setVenti(venti);
			
			cList.add(c);
			
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs != null){rs.close();}
			if(stmt != null){stmt.close();}
			if(conn != null){conn.close();}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	request.setAttribute("cList", cList);
	request.getRequestDispatcher("Order.jsp").forward(request, response);
	%>
</body>
</html>