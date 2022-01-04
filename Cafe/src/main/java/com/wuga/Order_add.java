package com.wuga;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


@WebServlet("/OADD")
public class Order_add extends HttpServlet {
	
	static List<Orders> ords = new ArrayList<Orders>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/wuga?useSSL=false&serverTimezone=Asia/Seoul";
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM cafe";
		List<Cafe> cList = new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = (Connection) DriverManager.getConnection(url, "wugawuga", "382Tt5990!");
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
		
		request.setCharacterEncoding("UTF-8");
		
		String cfname = request.getParameter("cfname");
        String size = request.getParameter("size");
        String zan = request.getParameter("zan");


		Orders o = new Orders();
		o.setCfname(cfname);
		o.setSize(size);
		o.setZan(zan);
		
		for(int i=0;i<7;i++) {
			if(cfname.equals(cList.get(i).getName())) {
				if(size.equals("톨")) {
					o.setPrice(Integer.parseInt(zan)*cList.get(i).getTall());
				}else if(size.equals("그란데")) {
					o.setPrice(Integer.parseInt(zan)*cList.get(i).getGrande());
				}else if(size.equals("벤티")) {
					o.setPrice(Integer.parseInt(zan)*cList.get(i).getVenti());
				}
			}
		}
		
		ords.add(o);
				
		request.setAttribute("ords", ords);
		request.getRequestDispatcher("Order.jsp").forward(request, response);
	}

}
