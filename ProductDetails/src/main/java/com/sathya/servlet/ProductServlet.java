package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1:Read the requested data
			int proId=Integer.parseInt(request.getParameter("proId"));
			String proName=request.getParameter("proName");
			double proPrice=Double.parseDouble(request.getParameter("proPrice"));
			int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
			double totalbill,discount,netAmount;
			totalbill=proPrice*proQuantity;
			if(totalbill<1000)
				discount=0;
			else if(totalbill>=1000 && totalbill<5000)
				discount=0.05*totalbill;
			else if(totalbill>=5000 && totalbill<10000)
				discount=0.1*totalbill;
			else
					discount=1.5*totalbill;
			netAmount=totalbill-discount;
			//step 3:Render the response
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("<html>");
			writer.println("<body bgcolor=pink>");
			writer.println("Product ID:"+proId+"<br><br>");
			writer.println("Product Name:"+proName+"<br><br>");
			writer.println("Product Cost:"+proPrice+"<br><br>");
			writer.println("Product Quantity:"+proQuantity+"<br><br>");
			writer.println("Total Bill Amount :"+totalbill+"<br><br>");
			writer.println("Discount Amount:"+discount+"<br><br>");
			writer.println("Net Amount to Pay:"+netAmount+"<br><br>");
			writer.println("</body>");
		    writer.println("</html>");
		    
		}

}
