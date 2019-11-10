package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.OrderDaoImpl;
import com.Bean.com.Orders;



/**
 * Servlet implementation class OViewAll
 */
public class OViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OViewAll() {
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
	        OrderDaoImpl impl=new OrderDaoImpl();
	          
	        List<Orders> list =impl.viewallorders();;  
	          
	        out.print("<table border='1' callspacing='10px' align='center' margin-top='300px' margin-left='100px'>");
			out.println("<tr><th>Oid</th><th>Cid</th><th>Km</th><th>PAYMENT</th><th>Total</th></tr>");
	          
	        for(Orders e:list){  
	         out.println("<tr><td>");
	         out.println(+e.getOid()+"</td><td>"+e.getCid()+"</td><td>"+e.getKm()+"</td><td>"+e.getPayment_type()+"</td><td>"+e.getTotal()+
						"</td><td>");
	         out.println("</tr></td>");
	        
	        }  
	        
	          
	        out.close();  
		}

	}


