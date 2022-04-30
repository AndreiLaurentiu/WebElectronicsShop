package servlets;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		
		if(username.equals("Andrei") && password.equals("pass1")) {
			HttpSession session = request.getSession();
			session.setAttribute("Username", username);
			response.sendRedirect("welcome.jsp");
		}
		
		else {
			response.sendRedirect("login.jsp");
		}
	}

}
