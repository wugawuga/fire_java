package com.wuga.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuga.dao.LecturerDAO;
import com.wuga.vo.LecturerVO;

public class LecturerListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/lecturer/lecturerList.jsp";
		
		LecturerDAO dao = LecturerDAO.getInstance();
		List<LecturerVO> lecturerlist = dao.selectAllLecturer();
		
		request.setAttribute("lecturerlists", lecturerlist);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
