package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;

@WebServlet("/delete")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idUser =  request.getParameter("id");
		if(idUser != null && idUser.matches("[0-9]+")) {
			UserDao.delete(Integer.parseInt(idUser));
		}
	    response.sendRedirect(request.getContextPath() + "/list");	
	}
}
