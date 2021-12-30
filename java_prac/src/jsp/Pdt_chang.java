package com.wuga.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wuga.beans.Pdt_beans;

/**
 * Servlet implementation class Pdt_chang
 */
@WebServlet("/Pdt_chang")
public class Pdt_chang extends HttpServlet {
       
	static List<Pdt_beans> list = new ArrayList<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		
		Pdt_beans pd = new Pdt_beans();
		
		String name = request.getParameter("name");
		String pdtCode = request.getParameter("pdtCode");
		String price = request.getParameter("price");
		String loc = request.getParameter("loc");
		String mtl = request.getParameter("mtl");
		String sdt = request.getParameter("sdt");
		
		pd.setName(name);
		pd.setPdtCode(pdtCode);
		pd.setPrice(price);
		pd.setLoc(loc);
		pd.setMtl(mtl);
		pd.setSdt(sdt);
		
		list.add(pd);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("Pdt_main.jsp").forward(request, response);
	}

}
