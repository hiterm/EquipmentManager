package ateam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ateam.logic.ReturnBihinLogic;
import ateam.model.User;

/**
 * Servlet implementation class ReturnBihinServlet
 */
@WebServlet("/ReturnBihinServlet")
public class ReturnBihinServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnBihinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        //String bihinID = request.getParameter("userID");
        ReturnBihinLogic.returnBihin(user.getUserID());

        request.getRequestDispatcher("/returnSuccess.jsp").forward(request, response);

    }

}
