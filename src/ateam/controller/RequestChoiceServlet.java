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
import ateam.util.LoginUtil;

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
        HttpSession session = request.getSession(false);
        if (!LoginUtil.isLogined(session)) {
            request.setAttribute("errorMessage", "ログインしてください");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            request.setCharacterEncoding("UTF-8");
            User user = (User) session.getAttribute("user");
            String bihinID = request.getParameter("bihinID");
            String bihinName = request.getParameter("bihinName");
            String userID = user.getUserID();
            String returnDayStr = request.getParameter("returnDate");
            // 空文字判定
            if (returnDayStr.isEmpty()) {
                response.sendRedirect("BihinListServlet");
            } else {
                //日付が正しいか判定
                try {
                    Date returnDay = Date.valueOf(returnDayStr);
                } catch (IllegalArgumentException e) {
                    request.setAttribute("bihinName", bihinName);
                    request.setAttribute("bihinID", bihinID);
                    request.setAttribute("errorMessage", "正しい日付を入力してください");
                    request.getRequestDispatcher("/request.jsp").forward(request, response);
                }
                Date returnDay = Date.valueOf(returnDayStr);
                request.setAttribute("returnDay", returnDayStr);
                request.setAttribute("bihinName", bihinName);
                if (RequestLogic.requestBihin(bihinID, userID, returnDay)) {
                    request.getRequestDispatcher("/requestSuccess.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("/requestFail.jsp").forward(request, response);
                }
            }
        }

    }
}
