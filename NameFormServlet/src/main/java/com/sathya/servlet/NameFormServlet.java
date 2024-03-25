package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NameFormServlet")
	public class NameFormServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

	   
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String FirstName=request.getParameter("First Name");
			String MiddleName=request.getParameter("Middle Name");
			String LastName=request.getParameter("Last Name");
			String status;
			String FullName=FirstName+MiddleName+LastName;
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			writer.println("<html>");
			writer.println("<h1>Name Form</h1>"+FullName);
			writer.println("</html>");
	}
			
		}
