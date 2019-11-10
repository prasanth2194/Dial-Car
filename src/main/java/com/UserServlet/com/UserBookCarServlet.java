package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.CarDaoImpl;
import com.Bean.com.BookCar;
import com.Bean.com.Car;
import com.UserDaoImpl.com.BookCarDaoImpl;

/**
 * Servlet implementation class UserBookCarServlet
 */
public class UserBookCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserBookCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();  
        BookCarDaoImpl cd=new BookCarDaoImpl();
      String cid1=request.getParameter("car_id");
      int car_id=Integer.parseInt(cid1);
      
      String date=request.getParameter("date");  
      String cid2=request.getParameter("cid");
      int cid=Integer.parseInt(cid2);
      
      ServletContext cs=getServletContext();
      cs.setAttribute("ci", cid);
      String pickuppoint=request.getParameter("pickuppoint");
      String pkm=request.getParameter("km");
      int km=Integer.parseInt(pkm);
      int totalbill=0;
      int p=cd.PriceDetalis(car_id);
     totalbill=km*p;
      String paymenttype=request.getParameter("paymenttype");
      String status="NotBooked";  
      if(totalbill!=0)
      {
    	  status="Booked";
      }

    	  BookCar e=new BookCar(car_id,date,cid,pickuppoint,km,totalbill,paymenttype,status);
     // int status1=cd.bookcar(e);
      out.println("<br>");
		/*out.println("<table border=3px cellpadding=10px cellspacing=5px>");
		out.println("<tr><th>Total Bill</th></tr><tr><td>" + e.getTotalbill() + "</td></tr>");
		out.println("</table>");
		out.println("<br>");*/

		int count = cd.bookcar(e);
		if (count != 0) {
			//out.println("Inserted");
			//out.println("You can Print bill here");
			request.getRequestDispatcher("ViewSpecificServlet").forward(request, response);
			//out.println("<button type='submit' class='btn btn-default'><a href='ViewSpecificServlet'>Print</a></button>");
		} else {
			out.println("Not Inserted");

		}
      out.close();  
  }  
	}


