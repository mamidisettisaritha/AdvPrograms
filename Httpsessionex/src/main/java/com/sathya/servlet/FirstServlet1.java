package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet1")
public class FirstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data requested form data
		String Username=request.getParameter("Username");
		String Age=request.getParameter("Age");
		//create the cookies object
			Cookie cookie1=new Cookie("Username", Username);
			Cookie cookie2=new Cookie("Age", Age);
			//add the cookies into response object
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			//give to the next form
					RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
			dispatcher.forward(request,response);
	}
	

}
