package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				String status;
				if(username.equals("sathya")&& password.equals("Sathya@123"))
				{
					status="Login Successful...";
				}
				else {
					status="Login fail....";
				}
				PrintWriter writer=response.getWriter();
				response.setContentType("text/html");
				writer.println("<html>");
				writer.println("<h1>Login Status</h1>"+status);
				writer.println("</html>");
				
			}
}

