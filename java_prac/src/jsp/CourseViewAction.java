package com.wuga.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.CourseDAO;
import com.wuga.vo.CourseVO;

public class CourseViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		String url = "/course/courseView.jsp";
			 
		CourseDAO dao = CourseDAO.getInstance();
		CourseVO courselist = dao.selectCourseById(id);
		 
		request.setAttribute("course", courselist);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
