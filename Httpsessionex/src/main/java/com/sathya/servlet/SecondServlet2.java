package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet2")
public class SecondServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data requested form data
				String Qualification =request.getParameter("Qualification");
				String Designation=request.getParameter("Designation");
				//create the cookies object
					Cookie cookie3=new Cookie("Qualification",Qualification);
					Cookie cookie4=new Cookie("Designation",Designation);
					//add the cookies into response object
					response.addCookie(cookie3);
					response.addCookie(cookie4);
					//give to the next form
							RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
					dispatcher.forward(request,response);
	}

}
