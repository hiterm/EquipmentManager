package ateam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ateam.logic.MyPageLogic;
import ateam.model.Bihin;
import ateam.model.User;
import ateam.util.LoginUtil;

/**
 * Servlet implementation class StateDisplayServlet
 */
@WebServlet("/MyPageServlet")
public class MyPageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession(false);
        if (!LoginUtil.isLogined(session)) {
            request.setAttribute("errorMessage", "ログインしてください");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            User user = (User) session.getAttribute("user");

            //備品モデルのリストにロジックで作成したリストを代入していく。
            List<Bihin> list = MyPageLogic.getBihinList(user.getUserID());
            //リストをjspに渡す
            request.setAttribute("list", list);
            request.getRequestDispatcher("/myPage.jsp").forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
