package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.com.Orders;
import com.Bean.com.UOrders;
import com.UserDaoImpl.com.ACarDaoImpl;



/**
 * Servlet implementation class UserAddCart
 */
public class UserAddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAddCart() {
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
	        ACarDaoImpl  cd=new ACarDaoImpl();
	        String car=request.getParameter("car_id");
	        int car_id=Integer.parseInt("car");
	        String Order_id=request.getParameter("oid");
	        int oid=Integer.parseInt(Order_id);
	        String name=request.getParameter("name");  
	        String type=request.getParameter("type");  
	        String pk=request.getParameter("price_km");
	        int price_km=Integer.parseInt(pk);
	        String k=request.getParameter("km");
	        int km=Integer.parseInt("km");
	          
	        UOrders e=new UOrders(car_id,oid,name,type,price_km,km);
	          
	        int status=cd.Addtocart();
	        if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("index.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  

	}

}
