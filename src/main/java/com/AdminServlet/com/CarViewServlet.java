package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.CarDaoImpl;
import com.Bean.com.Car;



/**
 * Servlet implementation class CarViewServlet
 */
public class CarViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();  
        CarDaoImpl impl=new CarDaoImpl();
        
          int car_id=0;
       impl.viewcar(car_id);  
       Car e = new Car();
          
        out.print("<table border='1' callspacing='10px' align='center' margin-top='300px' margin-left='100px'>");
        out.println("<tr><td>CAR-ID</td><td>CARNAME<td>CARNAME</td><td>DESCRIPTION</td><td>TYPE</td><td>PRICE/KM</td></tr>");
        
        if(car_id!=0){
        	 out.println("<tr><td>");
             out.println(e.getCar_id()+"</td><td>"+e.getCarname()+"</td><td>"+e.getDescrption()+"</td><td>"+e.getType()+"</td><td>"+e.getPrice_km()+
            		 "</td><td>"+ "<a href=Delete?car_id="+e.getCar_id()+">DELETE</a>"+"</td><td>"+"<a href=Update?car_id="+e.getCar_id()+">UPDATE</a>" );
             out.println("</tr></td>");
  
  
        }
        else{
        	out.println("Entered car id is not found");
        	out.println("<a href='view.html'>View a Car</a>");
        }
          
	}

	}


