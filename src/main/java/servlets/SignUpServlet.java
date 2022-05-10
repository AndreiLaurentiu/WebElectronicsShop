package servlets;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.BasicUser;
import services.ServiceBasicUser;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String email = request.getParameter("Email");
		
		ServiceBasicUser serviceBasicUser = new ServiceBasicUser();
		List<BasicUser> list = new ArrayList<>(serviceBasicUser.getBasicUsers().size());
		Collections.addAll(list, (BasicUser[])serviceBasicUser.getBasicUsers().toArray());
		
		String duplicateCredentialErrorMessage = null;
		
		for(BasicUser user : list) {
			if(user.getUsername().equals(username)) {
				duplicateCredentialErrorMessage = "Username already in use. Please try another one.";
			}
			
			if(user.getEmail().equals(email)) {
				duplicateCredentialErrorMessage = "Email address already in use. Please try another one.";
			}
					
		}
		
		BasicUser newUser = null;
		if(duplicateCredentialErrorMessage == null) {
			newUser = new BasicUser(username, password, email);
			serviceBasicUser.addBasicUser(newUser);
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("duplicateCredentialErrorMessage", duplicateCredentialErrorMessage);
		response.sendRedirect("NewBasicUser.jsp");
			
	}
	

}
