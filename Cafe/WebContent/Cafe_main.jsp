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
<%
	
	Connection con = null;

	String url = "jdbc:mysql://localhost:3306/wuga?useSSL=false&serverTimezone=Asia/Seoul";
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql = "SELECT * FROM cafe";
	List<Cafe> cList = new ArrayList<>();
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url, "wugawuga", "382Tt5990!");
		stmt = con.createStatement();
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
			if(con != null){con.close();}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	session.setAttribute("cList", cList);
	response.sendRedirect("Order.jsp");

%>
</body>
</html>