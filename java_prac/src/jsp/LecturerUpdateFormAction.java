package com.wuga.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.LecturerDAO;
import com.wuga.vo.LecturerVO;

public class LecturerUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idx = request.getParameter("idx");
		String url = "lecturer/lecturerUpdate.jsp";
		
		LecturerDAO dao = LecturerDAO.getInstance();
		LecturerVO lVo = dao.selectLecturerByIdx(idx);

		LecturerDAO daos = LecturerDAO.getInstance();
		List<LecturerVO> lecturerName = daos.selectLecturerNameByIdx(idx);
		
		request.setAttribute("lecturer", lVo);
		request.setAttribute("lecturerName", lecturerName);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
