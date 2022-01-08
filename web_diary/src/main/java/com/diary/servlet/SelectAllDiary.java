package com.diary.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diary.dao.DiaryDAO;
import com.diary.vo.DiaryVO;

@WebServlet("/SAD")
public class SelectAllDiary extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		DiaryDAO dao = DiaryDAO.getInstance();
		List<DiaryVO> diaryLists = new ArrayList<>();
		diaryLists = dao.selectAlldiary("wuga");
		
		request.setAttribute("diaryLists", diaryLists);
		
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
