package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				long mobile=Long.parseLong(request.getParameter("mobile"));
				String email=request.getParameter("email");
				String gender=request.getParameter("gender");
				String dob=request.getParameter("dob");
				String[] quals=request.getParameterValues("quals");
				String country=request.getParameter("country");
				String[] langs =request.getParameterValues("comments");
				
				//step 2:process the data
				String q=String.join(",", quals);
				String l=String.join("-",langs);
				response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("<html>");
				writer.println("<body bgcolor='pink'>");
				writer.println("Your username:"+username+"<br><br>");
				writer.println("Your password:"+password+"<br><br>");
				writer.println("Your mobile number:"+mobile+"<br><br>");
				writer.println("Your email:"+email+"<br><br>");
				writer.println("Your gender:"+gender+"<br><br>");
				writer.println("Your dob:"+dob+"<br><br>");
				writer.println("Your qualification:"+q+"<br><br>");
				writer.println("Your Country:"+country+"<br><br>");
				writer.println("Your languages:"+l+"<br><br>");
				writer.println("Comments:");
				writer.println("</body>");
				writer.println("</html>");
				
		}
		}
