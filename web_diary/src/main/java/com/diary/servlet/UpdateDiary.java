package com.diary.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diary.dao.DiaryDAO;
import com.diary.vo.DiaryVO;


@WebServlet("/UpdateDiary")
public class UpdateDiary extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int diaryCode = Integer.parseInt(request.getParameter("code"));
		
		DiaryDAO dao = DiaryDAO.getInstance();
		DiaryVO dVo = dao.selectDiaryByCode(diaryCode);
		
		request.setAttribute("diaryVo", dVo);
		
		request.getRequestDispatcher("updateDiary.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		int diaryCode = Integer.parseInt(request.getParameter("diaryCode"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		DiaryVO dVo = new DiaryVO();
		dVo.setDiaryCode(diaryCode);
		dVo.setTitle(title);
		dVo.setContent(content);
		
		DiaryDAO dao = DiaryDAO.getInstance();
		dao.updateDiary(dVo);
		
		response.sendRedirect("SAD");
	}

}
