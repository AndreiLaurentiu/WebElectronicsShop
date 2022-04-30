package servlets;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session= request.getSession();
		session.removeAttribute("Username");
		session.invalidate();
		response.sendRedirect("login.jsp");
	}

}
