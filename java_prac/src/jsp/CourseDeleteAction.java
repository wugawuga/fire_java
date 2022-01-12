package com.wuga.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.CourseDAO;

public class CourseDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		CourseDAO dao = CourseDAO.getInstance();
		dao.deleteCourse(id);
		
		response.sendRedirect("Course?command=course_list");
	}

}
