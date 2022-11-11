package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONNECTION_VIEW = "/WEB-INF/connection.jsp";
	private static final String ERROR_MESSAGE = " Données non exactes ";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher(CONNECTION_VIEW).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String isConnected = "false";
		
		if(login != null && "admin".equals(login) && 
				password != null && "passer".equals(password)) {
	
			isConnected = "true";
			response.sendRedirect(request.getContextPath() + "/list");
		} else {
			request.setAttribute("errorMessage", ERROR_MESSAGE);
			response.sendRedirect(request.getContextPath() + "/connection");
		}
		
		session.setAttribute("status", isConnected);
	}

}
