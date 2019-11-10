package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.AdminDaoimpl.com.CarDaoImpl;
import com.Bean.com.Car;
import com.Utility.com.ConnectionManager;



/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);
    public Insert() {
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
         CarDaoImpl cd=new CarDaoImpl();
       String cid=request.getParameter("car_id");
       int car_id=Integer.parseInt(cid);
       String carname=request.getParameter("carname");  
       String descrption=request.getParameter("descrption");  
       String type=request.getParameter("type");  
       String pk=request.getParameter("price_km");
       int price_km=Integer.parseInt(pk);
       String cs=request.getParameter("carstrength");
       int carstrength=Integer.parseInt(cs);
       String status=request.getParameter("status");
         
       Car e=new Car(car_id,carname,descrption,type,price_km,carstrength,status);
       e.setCar_id(car_id);
       e.setCarname(carname);
       e.setDescrption(descrption);
       e.setType(type);
       e.setPrice_km(price_km);
       e.setCarstrength(carstrength);
       e.setStatus(status);
         
       int status1=cd.addcar(e);
       if(status1>0){  
           out.print("<p>Record saved successfully!</p>"); 
           logger.info("Record saved successfully");
           request.getRequestDispatcher("addcar.html").include(request, response);  
       }else{  
           out.println("Sorry! unable to save record"); 
           logger.info("Sorry! unable to save record");
       }  
         
       out.close();  
   }  
 

	
		

	
}
