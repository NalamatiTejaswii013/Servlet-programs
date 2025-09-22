package com.servletpgm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class requestdispatcherprogram
 */
@WebServlet("/servlet1")
public class requestdispatcherprogram extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read the form data
		String username=request.getParameter("user");
		String Password=request.getParameter("pass");
		
		// set the attribute name in the form of key value pair
		request.setAttribute("user", username);
		request.setAttribute("pass", Password);
		
		
		// forward request to servlet2
		RequestDispatcher rd=request.getRequestDispatcher("forwardpgm");
		rd.forward(request, response);
		rd.include(request, response);
	}

}
