package ateam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ateam.logic.LoginLogic;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cnt =0;
		request.setCharacterEncoding("UTF-8");
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");

		cnt = LoginLogic.login(userID , password);

		if(cnt == 1) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userID", userID);
			request.getRequestDispatcher("/MyPageServlet").forward(request, response);
		}
		else{
			request.getRequestDispatcher("/loginFailed.jsp").forward(request, response);
		}
		/*if(LoginLogic.login(request.getParameter("userID"), request.getParameter("password"))){
			request.getRequestDispatcher("topPage.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("loginFailed.jsp").forward(request, response);
		}*/

	}

}
