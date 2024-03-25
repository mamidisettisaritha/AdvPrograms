package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		HttpSession session=request.getSession(false);
		writer.println("<html>");
		writer.println("<body bgcolor='pink'>");
		writer.println("<h1>Registration Details</h1>");
		writer.println("Username:"+session.getAttribute("Username")+"<br>");
		writer.println("Age:"+session.getAttribute("Age")+"<br>");
		writer.println("Qualification:"+session.getAttribute("Qualification")+"<br>");
		writer.println("Designation:"+session.getAttribute("Designation")+"<br>");
		writer.println("Email:" +request.getParameter("email")+"<br>");
		writer.println("Mobile:"+request.getParameter("mobile"));
		writer.println("</body>");
		writer.println("</html>");
		
	
	}
	}

