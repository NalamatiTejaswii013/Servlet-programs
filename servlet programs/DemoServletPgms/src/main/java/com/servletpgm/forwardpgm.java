package com.servletpgm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class forwardpgm
 */
@WebServlet("/forwardpgm")
public class forwardpgm extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set the response type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		// read the attribute name 
		String a=(String)request.getAttribute("user");
		out.println("<h1> welcome to username:"+a+"</h1>");
		String a1=(String)request.getAttribute("pass");
		out.println("<h1> Password"+a+"</h1");
		if(a.equals("Tejaswi")&& a1.equals("1234"))
		{
			out.println("<h1>Valid</h1>");
		}
			else {
				out.println("<h1>not Valid</h1>");
		
		}
	
}
}