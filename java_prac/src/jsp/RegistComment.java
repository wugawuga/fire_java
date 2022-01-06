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


@WebServlet("/registComment")
public class RegistComment extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		CommentDAO dao = CommentDAO.getInstance();
		List<CommentVO> list = dao.selectAllText();
		
		Gson gson = new Gson();
		String jsonList = gson.toJson(list);

		PrintWriter out = response.getWriter();
		
		out.println(jsonList);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String wordData = request.getParameter("wordData");
		
		JsonParser parser = new JsonParser();
		JsonElement data = parser.parse(wordData);
		
		String C_user = data.getAsJsonObject().get("C_user").getAsString();
		String C_comment = data.getAsJsonObject().get("C_comment").getAsString();
		String C_password = data.getAsJsonObject().get("C_password").getAsString();
		
		CommentDAO dao = CommentDAO.getInstance();
		dao.insertComment(C_user,C_comment, C_password);
		
		List<CommentVO> list = dao.selectAllText();
		
		Gson gson = new Gson();
		String jsonList = gson.toJson(list);

		PrintWriter out = response.getWriter();
		
		out.println(jsonList);
		
	}

}
