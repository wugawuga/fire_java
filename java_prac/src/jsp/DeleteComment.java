package com.green.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.green.dao.CommentDAO;
import com.green.vo.CommentVO;


@WebServlet("/deleteComment")
public class DeleteComment extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String wordData = request.getParameter("wordData");
		
		JsonParser parser = new JsonParser();
		JsonElement data = parser.parse(wordData);
		
		int C_code = data.getAsJsonObject().get("C_code").getAsInt();
		String C_password = data.getAsJsonObject().get("chkpwd").getAsString();
		
		CommentDAO dao = CommentDAO.getInstance();
		22-01-06 유캔뜌잇
		String daoPwd = dao.pwdFindCode(C_code);
		System.out.println("췍 비번확인"+daoPwd);
		if(C_password.equals(daoPwd)) {
			
			dao.deleteComment(C_code);
			
			List<CommentVO> list = dao.selectAllText();
			
			Gson gson = new Gson();
			String jsonList = gson.toJson(list);

			PrintWriter out = response.getWriter();
			
			out.println(jsonList);
		}
	}

}
