package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String operation=request.getParameter("operation");
		int result=0;
		switch(operation) {
		
		case "+" : result = num1+num2;
		           break;
		
		case "-" : result = num1-num2;
                    break;
        
		case "*" : result = num1*num2;
                     break;
        
		case "/" : result = num1/num2;
                   break;
        
		case "%" : result = num1%num2;
                    break;
		}           
        //step 3 :Render the response           
                    response.setContentType("text/html");
                	
            	    PrintWriter writer=response.getWriter();
            	    
            		writer.println("<html>");
            		
            		writer.println("<body bgcolor=pink>");
            		
            		writer.println("<p>:Your Results....</p>"+"<br><br>");
            		
            		writer.println("<p>Your First Number:"+num1+"</p>"+"<br><br>");
            		
            		writer.println("<p>Your Second Number:"+num2+"</p>"+"<br><br>");
            		
            		writer.println("<p>Your Operation Symbol..:"+operation+"</p>"+"<br><br>");
            		
            		writer.println("<p>Your Result..:"+result+"</p>"+"<br><br>");
            		
   
            		writer.println("</body>");
            	    writer.println("</html>");            
		           
		           
		
	}

	}

