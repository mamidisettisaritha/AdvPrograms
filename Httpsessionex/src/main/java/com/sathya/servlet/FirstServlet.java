package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
				String Username=request.getParameter("Username");
				int Age=Integer.parseInt(request.getParameter("Age"));
			
			//create the session object
				HttpSession session=request.getSession();
				
				//place the data into session object
				session.setAttribute("Username", Username);
				session.setAttribute("Age", Age);
				
				//Give to the next form
				RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
				dispatcher.forward(request,response);
				
			}

}
