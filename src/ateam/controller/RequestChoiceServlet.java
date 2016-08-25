package ateam.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ateam.logic.RequestLogic;
import ateam.model.User;

/**
 * Servlet implementation class RequestChoiceServlet
 */
@WebServlet("/RequestChoiceServlet")
public class RequestChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestChoiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setCharacterEncoding("UTF-8");
	    HttpSession session = request.getSession();
	    User user = (User) session.getAttribute("user");
	    String bihinID = request.getParameter("bihinID");
	    String bihinName = request.getParameter("bihinName");
	    String userID = user.getUserID();
	    String year = request.getParameter("year");
	    String month = request.getParameter("month");
	    String day = request.getParameter("day");
	    String kigen = year+"-"+month+"-"+day;
	    Date returnDay = Date.valueOf(kigen);
	    request.setAttribute("returnDay", kigen);
	    request.setAttribute("bihinName", bihinName);
        if (RequestLogic.requestBihin(bihinID, userID, returnDay)) {
            request.getRequestDispatcher("/requestSuccess.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/requestFail.jsp").forward(request, response);
        }
	}

}
