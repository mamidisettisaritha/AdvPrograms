package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ThirdServlet3")
public class ThirdServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data requested form data
		String Email=request.getParameter("Email");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		Cookie[] cookies=request.getCookies();
		writer.println("<html>");
		writer.println("<body bgcolor='green'>");
		writer.println("<pre style='color:Green'>");
		writer.println("Username:"+cookies[0].getValue()+"<br>");
		writer.println("User Age:"+cookies[1].getValue()+"<br>");
		writer.println("User Qualification:"+cookies[2].getValue()+"<br>");
		writer.println("User Designation:"+cookies[3].getValue()+"<br>");
		writer.println("User Email:" +request.getParameter("email")+"<br>");
		writer.println("Mobile:"+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
		}
	}
