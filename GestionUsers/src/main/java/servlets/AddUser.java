package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.User;
import dao.UserDao;

@WebServlet("/add")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ADD_VIEW = "/WEB-INF/addUser.jsp";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher(ADD_VIEW).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("lastName");
		String prenom = request.getParameter("firstName");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		try {
			User user = new User(nom, prenom, login, password);
			UserDao.addUser(user);
			} catch (Exception e){
				
			}
		
		response.sendRedirect(request.getContextPath() + "/list");
	}

}
