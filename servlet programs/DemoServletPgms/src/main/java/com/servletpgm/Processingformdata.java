package com.servletpgm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Processingformdata
 */
@WebServlet("/process")
public class Processingformdata extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// how to read the form data
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		String[] sub=request.getParameterValues("fruits");
		
		// set the response type for form data
		response.setContentType("text/html");
		
		// response the client
		PrintWriter out=response.getWriter();
		
		out.println("<h1> welcome to,"+username+" </h1>");
		out.println("<h1> welcome to,"+password+" </h1>");
		for(String string:sub) {
			out.println("<h1> The fruits name is "+string+ "</h1>");
		}
		if(username.equals("Tejaswi")&& password.equals("1234"))
		{
			out.println(" <h1>Valid</h1>");
		}
			else {
				out.println("<h1>not Valid</h1>");
		
		}
		String[] fruits =request.getParameterValues("fruits");
	}

}
