package unit01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectServlet
 */
@WebServlet("/CS")
public class ConnectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("********** get ************");
		
		String userId = request.getParameter("userid");
		String userPwd = request.getParameter("userpwd");
		String userName = request.getParameter("username");
		String gender = request.getParameter("gender");
		
		String[] hobbys = request.getParameterValues("hobby");
		
		System.out.println("아이디 : "+userId);
		System.out.println("비밀번호 : "+userPwd);
		System.out.println("이름 : "+userName);
		
		if(gender.equals("male")) {
			System.out.println("성별 : 남");
		}else if(gender.equals("female")) {
			System.out.println("성별 : 여");
		}
		
		for(String hobby:hobbys) {
			System.out.println("취미 : "+hobby);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("********** post ************");
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userid");
		String userPwd = request.getParameter("userpwd");
		String userName = request.getParameter("username");
		String gender = request.getParameter("gender");
		
		String[] hobbys = request.getParameterValues("hobby");
		
		System.out.println("아이디 : "+userId);
		System.out.println("비밀번호 : "+userPwd);
		System.out.println("이름 : "+userName);
		
		if(gender.equals("male")) {
			System.out.println("성별 : 남");
		}else if(gender.equals("female")) {
			System.out.println("성별 : 여");
		}
		
		for(String hobby:hobbys) {
			System.out.println("취미 : "+hobby);
		}
	}

}
