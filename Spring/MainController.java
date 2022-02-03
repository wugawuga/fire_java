package com.wuga.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wuga.dao.BoardsDao;
import com.wuga.vo.BoardsVo;

@Controller
public class MainController {

	private BoardsDao dao;

	public void setDao(BoardsDao dao) {
		this.dao = dao;
	}
//
//	@RequestMapping("/")
//	public String list(@ModelAttribute("listCommand") ListCommand listCommand,Model model) {
//		
//		List<BoardsVo> list = dao.selectAll();	
//		model.addAttribute("Boards",list);
//
//		return "main";
//	}
	
	@RequestMapping("/")
	public String pagelist(HttpServletRequest request, HttpServletResponse response,Model model) {
	
		String _section = request.getParameter("section");
		String _pageNum = request.getParameter("pageNum");
		
		int section = Integer.parseInt((_section==null)?"1":_section);
		int pageNum = Integer.parseInt((_pageNum==null)?"1":_pageNum);
		
		int totalCnt = dao.selectAllNumBoard();
		List<BoardsVo> boardList = dao.selectTargetBoard(section, pageNum);
		
		request.setAttribute("totalCnt", totalCnt );
		request.setAttribute("section", section);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("boardList", boardList);

		model.addAttribute("Boards",boardList);
		return "main";
		
	}

}
