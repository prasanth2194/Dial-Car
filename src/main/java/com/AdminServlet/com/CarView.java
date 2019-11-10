package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.CarDaoImpl;
import com.Bean.com.Car;



/**
 * Servlet implementation class CarView
 */
public class CarView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarView() {
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
		response.setContentType("text/html");
        CarDaoImpl impl=new CarDaoImpl();
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
        List<Car> list =impl.viewallcars();  
          
        //out.print("<table border='1' callspacing='10px' align='center' margin-top='300px' margin-left='100px'>");
        out.println("<tr><th>CAR-ID</th><th>CARNAME</th><th>DESCRIPTION</th><th>TYPE</th><th>PRICE_KM</th><th></th><th></th></tr>");
          
        for(Car e:list){  
         out.println("<tr><td>");
         out.println(e.getCar_id()+"</td><td>"+e.getCarname()+"</td><td>"+e.getDescrption()+"</td><td>"+e.getType()+"</td><td>"+e.getPrice_km()+
        		 "</td><td>"+ "<a href=Delete?car_id="+e.getCar_id()+">DELETE</a>"+"</td><td>"+"<a href=Update1?car_id="+e.getCar_id()+">UPDATE</a>" );
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
