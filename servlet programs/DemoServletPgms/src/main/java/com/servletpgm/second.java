package com.servletpgm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/second")
public class second extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String a=(String) request.getAttribute("use");
		String b=(String) request.getAttribute("pas");
		
		out.println("<h1>welcome to username,"+a+"</h1>");
		out.println("<h1>welcome to password,"+b+"</h1>");
	}

}
