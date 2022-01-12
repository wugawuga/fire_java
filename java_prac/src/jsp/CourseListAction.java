package com.wuga.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.CourseDAO;
import com.wuga.vo.CourseVO;

public class CourseListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String url = "/course/courseList.jsp";
		
		CourseDAO dao = CourseDAO.getInstance();
		List<CourseVO> courselist = dao.selectAllCourse();
		
		request.setAttribute("courseLists", courselist);
		
		request.getRequestDispatcher(url).forward(request, response);
	}
	
}