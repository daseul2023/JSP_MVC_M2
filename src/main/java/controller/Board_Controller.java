package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// http://localhost:8181/JSP_MVC_M2
@WebServlet("*.do")
public class Board_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Board_Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// get, post 요청 모두 처리됨.
		// 한글이 깨지지않도록 처리해야함.
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("do 요청을 처리하는 controller 입니다.");
		
		// URL : http://localhost:8181/JSP_MVC_M2/my.do
		// URI : /JSP_MVC_M2/my.do
		
		String uri = request.getRequestURI();
		
		System.out.println(uri);
		
		// 
		String path = uri.substring(uri.lastIndexOf("/"));  // lastIndexof는 마지막 "/" 문장을 잘라내서 가져와 달라고 요청하는 것.
		System.out.println(path);
		System.out.println("=============================");
		
		if (path.equals("/insertBoard.do")) {
			System.out.println("/insertBoard.do 요청");
			// 로직 처리
			
		}else if (path.equals("/getBoardList.do")) {
			System.out.println("/getBoardList.do 요청");
			// 로직 처리
		}else if (path.equals("/getBoard.do")) {
			System.out.println("/getBoard.do 요청");
			// 로직 처리
		}else if (path.equals("/updateBoard.do")) {
			System.out.println("/updateBoard.do 요청");
			// 로직 처리
		}else if (path.equals("/deleteBoard.do")) {
			System.out.println("/deleteBoard.do 요청");
			// 로직 처리
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
