package com.diary.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diary.dao.DiaryDAO;
import com.diary.vo.DiaryVO;


@WebServlet("/WD")
public class WriteDiary extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String userid = "wuga";
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		DiaryVO dVo = new DiaryVO();
		
		dVo.setUserid(userid);
		dVo.setTitle(title);
		dVo.setContent(content);
		
		DiaryDAO dao = DiaryDAO.getInstance();
		dao.writeDiary(dVo);
		
		response.sendRedirect("SAD");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
