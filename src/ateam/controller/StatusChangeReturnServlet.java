package ateam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ateam.logic.StatusChangeReturnLogic;
import ateam.model.Bihin;

/**
 * Servlet implementation class StatusChangeReturnServlet
 */
@WebServlet("/StatusChangeReturnServlet")
public class StatusChangeReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatusChangeReturnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Bihin bihin = new Bihin();
		StatusChangeReturnLogic.ReturnBihin(bihin);
		 request.getRequestDispatcher("returnSuccess.jsp").forward(request, response);
	}

}
