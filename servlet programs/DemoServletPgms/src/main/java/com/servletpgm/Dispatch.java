package com.servletpgm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Dispatch
 */
@WebServlet("/first")
public class Dispatch extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read the form data
		String username=request.getParameter("user");
		String Password=request.getParameter("pass");
		
		request.setAttribute("use",username);
		request.setAttribute("pas",Password);
		
		RequestDispatcher rd=request.getRequestDispatcher("second");
		rd.include(request, response);
	}

}
