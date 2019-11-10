package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.CustomerDaoImpl;
import com.Bean.com.Customer;



/**
 * Servlet implementation class CView
 */
public class CViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CViewAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out=response.getWriter();  
	        CustomerDaoImpl impl=new CustomerDaoImpl();
	          
	        List<Customer> list =impl.viewallcustomers(); 
	        out.println("<!DOCTYPE html>");
	        out.println("<html>");  
	        out.println("<head>");
	        out.println("<title>DAIL YOUR CAR</title>");
	        out.println("  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css'/>");
	        
	        out.println("</head>");
	        out.println("<body>");
	        
	        out.println("<div width='100%' height='100px'>");
	        request.getRequestDispatcher("head.html").include(request, response);
	        out.println("</div>");
	        
	        out.println("<div>");
	        out.println("<table  class='table table-dark table-hover'>");
	          
	        //out.print("<table border='1' callspacing='10px' align='center' margin-top='300px' margin-left='100px'>");
	        out.println("<tr><th>CID</th><th>NAME</th><th>FORENAME</th><th>SURNAME</th><th>ADDRESS1</th><th>ADDRESS2</th><th>POSTCODE</th><th>PHONE</th><th>EMAIL</th><th></th></tr>");
	          
	        for(Customer e:list){  
	         out.println("<tr><td>");
	         out.println(e.getCid()+"</td><td>"+e.getForename()+"</td><td>"+e.getSurname()+"</td><td>"+e.getAddress1()+"</td><td>"+e.getAddress2()+
	        		 "</td><td>"+e.getPostcode()+"</td><td>"+e.getPhone()+"</td><td>"+e.getEmail()+"</td>" );
	         out.println("</tr></td>");
	        
	        }  
	        out.println("</table>");
	        out.println("</div>");
	        out.println("<div>");
	        out.println("<div width='100%' height='100px'>");
	        request.getRequestDispatcher("foot.html").include(request, response);
	        out.println("</div>");
	        out.println("</boby>");
	        out.println("</html>");
	          
	        out.close();  
		
	}

}
