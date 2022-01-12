package com.wuga.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.LecturerDAO;
import com.wuga.vo.LecturerVO;

public class LecturerUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LecturerVO lVo = new LecturerVO();
		
		lVo.setIdx(Integer.parseInt(request.getParameter("idx")));
		lVo.setName(request.getParameter("name"));
		lVo.setMajor(request.getParameter("major"));
		lVo.setField(request.getParameter("field"));
		
		LecturerDAO dao = LecturerDAO.getInstance();
		dao.updateLecturer(lVo);
		
		response.sendRedirect("Course?command=lecturer_list");
	}

}
