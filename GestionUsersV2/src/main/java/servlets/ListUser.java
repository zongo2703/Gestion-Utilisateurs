package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.UserDao;

/**
 * Servlet implementation class ListUser
 */
@WebServlet({ "" , "/list" })
public class ListUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final static String USERS_LIST_VIEW = "/WEB-INF/listUsers.jsp";   
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("user", UserDao.listUser());
		getServletContext().getRequestDispatcher(USERS_LIST_VIEW).forward(request, response);
	}

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
