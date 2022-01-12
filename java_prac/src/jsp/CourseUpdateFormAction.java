package com.wuga.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.CourseDAO;
import com.wuga.dao.LecturerDAO;
import com.wuga.vo.CourseVO;
import com.wuga.vo.LecturerVO;

public class CourseUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String url = "course/courseUpdate.jsp";
		
		CourseDAO dao = CourseDAO.getInstance();
		CourseVO cVo = dao.selectCourseById(id);
		
		LecturerDAO daos = LecturerDAO.getInstance();
		List<LecturerVO> lecturerlist = daos.selectAllLecturer();
		
		request.setAttribute("lecturerlists", lecturerlist);

		request.setAttribute("course", cVo);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
