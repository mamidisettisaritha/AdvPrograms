package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String Qualification=request.getParameter("Qualification");
			String Designation=request.getParameter("Designation");
			HttpSession session=request.getSession(false);
			session.setAttribute("Qualification",Qualification );
			session.setAttribute("Designation",Designation );
			RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
			dispatcher.forward(request, response);
			
	}

}
