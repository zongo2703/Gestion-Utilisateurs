package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.User;
import dao.UserDao;
import form.AddUserForm;

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
		AddUserForm form = new AddUserForm(request);
		form.add();
		
	    
	    request.setAttribute("user", form.getUser());
		request.setAttribute("status", form.isStatus());
		request.setAttribute("statusMessage", form.getStatusMessage());
		request.setAttribute("erreurs", form.getErreurs());
		request.getServletContext().getRequestDispatcher(ADD_VIEW).forward(request, response);
		
		 if (!form.isStatus()) {
		       response.sendRedirect(request.getContextPath() + "/list");
		   } else {
		
		//response.sendRedirect(request.getContextPath() + "/list");
		  }
	}

}
