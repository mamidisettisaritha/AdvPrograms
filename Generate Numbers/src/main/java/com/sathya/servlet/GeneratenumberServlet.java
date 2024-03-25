package com.sathya.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GeneratenumberServlet")
public class GeneratenumberServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int num1=Integer.parseInt(request.getParameter("num1"));
			int num2=Integer.parseInt(request.getParameter("num2"));
			String operation=request.getParameter("operation");
			int result=0;
			switch(operation) {
			
			case "even" : result = num1+num2;
			           break;
			
			case "odd" : result = num1-num2;
	                    break;
	        
			case "prime" : result = num1*num2;
	                     break;
	        
			case "perfect" : result = num1/num2;
	                   break;
	        
			case "strong" : result = num1%num2;
	                    break;
	}
	

}
}