package com.diary.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diary.dao.DiaryDAO;
import com.diary.vo.DiaryVO;


@WebServlet("/DetailDiary")
public class DetailDiary extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int diaryCode = Integer.parseInt(request.getParameter("code"));
		
		DiaryDAO dao = DiaryDAO.getInstance();
		DiaryVO dVo = dao.selectDiaryByCode(diaryCode);
		
		request.setAttribute("diaryVo", dVo);
		
		request.getRequestDispatcher("detailDiary.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
