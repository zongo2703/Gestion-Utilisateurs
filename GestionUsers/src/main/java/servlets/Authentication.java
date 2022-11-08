package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String login = request.getParameter("nom");
		//String password = request.getParameter("password");
		
		//if(login == null || password == null) {
			 getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);;
			//rd.forward(request, response);
		//}
		
		//request.setAttribute("login", login);
		//request.setAttribute("password", password);
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp");
		//rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String message = "Echec connecion ";
		if("admin".equals(login) && "passer".equals(password)) 
		    message = "Connexion réussie";
		
		request.setAttribute("message", message);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/Status.jsp");
		rd.forward(request, response);
	}

}
