package com.wuga.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.CourseDAO;
import com.wuga.vo.CourseVO;

public class CourseUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourseVO cVo = new CourseVO();
		
		cVo.setId(request.getParameter("id"));
		cVo.setName(request.getParameter("name"));
		cVo.setLecturer(Integer.parseInt(request.getParameter("lecturer")));
		cVo.setCredit(Integer.parseInt(request.getParameter("credit")));
		cVo.setWeek(Integer.parseInt(request.getParameter("week")));
		cVo.setStart_hour(Integer.parseInt(request.getParameter("start_hour")));
		cVo.setEnd_hour(Integer.parseInt(request.getParameter("end_hour")));
		
		CourseDAO dao = CourseDAO.getInstance();
		dao.updateBoard(cVo);
		
		response.sendRedirect("Course?command=course_list");
	}

}
