package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import beans.InvalidDataException;
import beans.User;
import dao.UserDao;

/**
 * Servlet implementation class Update
 */
@WebServlet("/update")
public class UpdateUser extends HttpServlet {
	private static final String UPDATE_VIEW = "/WEB-INF/update.jsp";
	private static final long serialVersionUID = 1L;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idUser = request.getParameter("id");
		if(idUser != null && idUser.matches("[0-9]+")) {
			try {
				User user = UserDao.getUser(Integer.parseInt(idUser));
				request.setAttribute("user", user);
				getServletContext().getRequestDispatcher(UPDATE_VIEW).forward(request, response);

			} catch (NumberFormatException | InvalidDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String nom = request.getParameter("lastName");
		String prenom = request.getParameter("firstName");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		try {
			User user = new User(Integer.parseInt(id), nom, prenom, login, password);
			UserDao.update(user);
			} catch (Exception e) {
				
			}
		
		response.sendRedirect(request.getContextPath() + "/list");
		}

}
