package com.diary.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diary.dao.DiaryDAO;
import com.diary.vo.DiaryVO;


@WebServlet("/DeleteDiary")
public class DeleteDiary extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int diaryCode = Integer.parseInt(request.getParameter("code"));
		
		DiaryDAO dao = DiaryDAO.getInstance();
		dao.deleteDiary(diaryCode);
		
		response.sendRedirect("SAD");
	}

}
