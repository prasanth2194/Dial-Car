package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.com.Bill;
import com.Bean.com.Car;
import com.Bean.com.CarBook;
import com.UserDaoImpl.com.BookCarDaoImpl;

/**
 * Servlet implementation class ViewSpecBillServlet
 */
public class ViewSpecBillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSpecBillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
        BookCarDaoImpl cd=new BookCarDaoImpl();

	//	List<CarBook>list=new ArrayList<CarBook>();
        List<CarBook> list =cd.viewBookedCar();  


		PrintWriter out=response.getWriter();
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
		out.println("<tr><th>Bcid</th><th>Car_id</th><th>Cid</th><th>forename</th><th>Phone</th><th>Date</th><th>PickUpPoint</th><th>Km</th><th>Total Bill</th><th> Payment Type</th><th> Status</th><th></th><th></th></tr>");
		for(CarBook b:list)
		{
			out.println("<tr><td>");
			out.println(b.getBcid()+"</td><td>"+b.getCar_id()+"</td><td>"+b.getCid()+"</td><td>"+b.getForename()+"</td><td>"+b.getPhone()+"</td><td>"+b.getDate()+"</td><td>"+b.getPickuppoint()+"</td><td>"+b.getKm()+"</td><td>"+b.getTotalbill()+"</td><td>"+b.getPaymenttype()+"</td><td>"+b.getStatus());
			out.println("</td></tr>");
		}
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
	}


