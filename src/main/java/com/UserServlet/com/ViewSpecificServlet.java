package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.com.CarBook;
import com.UserDaoImpl.com.BookCarDaoImpl;

/**
 * Servlet implementation class ViewSpecificServlet
 */
public class ViewSpecificServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSpecificServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		PrintWriter pw=response.getWriter();
        BookCarDaoImpl cd=new BookCarDaoImpl();
		CarBook b=null;
		pw.println("<!DOCTYPE html>");
        pw.println("<html>");  
        pw.println("<head>");
        pw.println("<title>DAIL YOUR CAR</title>");
        pw.println("  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css'/>");
        
        pw.println("</head>");
        pw.println("<body>");
        
        pw.println("<div width='100%' height='100px'>");
        request.getRequestDispatcher("head.html").include(request, response);
        pw.println("</div>");
        
        pw.println("<div>");
        pw.println("<table  class='table table-dark table-hover'>");
	      ServletContext sc=getServletContext();
int cid=(Integer)sc.getAttribute("ci");
System.out.println(cid);
		b=cd.viewspecificcar(cid);
		System.out.println(b);
		if(b!=null)
		{
			pw.println("<table class='table table-bordered  table-hover'>");
			//pw.println("----------------------------------------");
			pw.println("<tr><th>BOOKED CAR DETAILS</th><th></th></tr>");
			//pw.println("----------------------------------------");
			pw.println("<tr><td>Bill No</td><td>"+b.getBcid()+"</td></tr>");
			pw.println("<tr><td>Car Id</td><td>"+b.getCar_id()+"</td></tr>");
			pw.println("<tr><td>Cid</td><td>"+b.getCid()+"</td></tr>");
			pw.println("<tr><td>User Name</td><td>"+b.getForename()+"</td></tr>");
			pw.println("<tr><td>User Phone</td><td>"+b.getPhone()+"</td></tr>");
			pw.println("<tr><td>Date</td><td>"+b.getDate()+"</td></tr>");
			pw.println("<tr><td>PickUpPoint</td><td>"+b.getPickuppoint()+"</td></tr>");
			pw.println("<tr><td>Km</td><td>"+b.getKm()+"</td></tr>");
			pw.println("<tr><td>TotalBill</td><td>"+b.getTotalbill()+"</td></tr>");
			pw.println("<tr><td>Status</td><td>"+b.getStatus()+"</td></tr>");
			//pw.println("----------------------------------------");
			pw.println("</table>");
			pw.println("</div>");
			
			pw.println("</body>");
			pw.println("</html>");
			pw.println("<div width='50px' height='30px'>");
			pw.println("<button type='submit'><a href='bookcar.html'>HOME</a></button>");
			
			pw.println("</div>");
		}
		else
		{
			response.sendRedirect("UserBookCarServlet");
		}
	}
}


