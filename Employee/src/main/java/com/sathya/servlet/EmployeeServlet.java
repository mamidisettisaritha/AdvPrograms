package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
	    int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		double basicsalary=Double.parseDouble(request.getParameter("basicsalary"));
		double hra,da,pf,GrossSalary;

		if(basicsalary>=50000)
		{
			hra=(30*basicsalary)/100;
	    	da=(10*basicsalary)/100;
	    	pf=(6*basicsalary)/100;
	    	GrossSalary=basicsalary+hra+da-pf;
		}
		else if(basicsalary<50000 && basicsalary>25000)
	       {
	    		hra=(20*basicsalary)/100;
		        da=(5*basicsalary)/100;
		        pf=(3*basicsalary)/100;
    	        GrossSalary=basicsalary+hra+da-pf;
	       }
	    	
		else 
    	{
    	    hra=(10*basicsalary)/100;
    		da=(3*basicsalary)/100;
    		pf=(2*basicsalary)/100;
        	GrossSalary=basicsalary+hra+da-pf;
	    }
        	
        	response.setContentType("text/html");
        	
    	    PrintWriter writer=response.getWriter();
    	    
    		writer.println("<html>");
    		
    		writer.println("<body bgcolor=pink>");
    		
    		writer.println("Employee ID:"+empid+"<br><br>");
    		
    		writer.println("Employee Name:"+empname+"<br><br>");
    		
    		writer.println("Employee Basicsalary:"+basicsalary+"<br><br>");
    		
    		writer.println("HRA Amount:"+hra+"<br><br>");
    		
    		writer.println("DA Amount :"+da+"<br><br>");
    		
    		writer.println("PF Amount:"+pf+"<br><br>");
    		
    		writer.println("Gross Salary:"+GrossSalary+"<br><br>");
    		
    		writer.println("</body>");
    	    writer.println("</html>");
	}

}
