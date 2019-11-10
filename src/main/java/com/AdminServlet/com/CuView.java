package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.CustomerDaoImpl;
import com.Bean.com.Customer;



/**
 * Servlet implementation class CuView
 */
public class CuView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		CustomerDaoImpl dao=new CustomerDaoImpl();
		response.setContentType("text/html");
		 int cid=0;
	       dao.viewcustomer(cid)  ;
	      Customer c = new Customer();
		PrintWriter out=response.getWriter();
		out.println("<table border='3px' cellspacing='5px' cellpadding='8px' align='center' margin-top='200px' margin-left='100px'>");
		out.println("<tr><th>Cid</th><th>forename</th><th>surname</th><th>address1</th><th>address2</th><th>postcode</th><th>phone</th><th>email</th></tr>");
		if(cid!=0)
		{
			out.println("<tr><td>");
			out.println(+c.getCid()+"</td><td>"+c.getForename()+"</td><td>"+c.getSurname()+"</td><td>"+c.getAddress1()+"</td><td>"+c.getAddress2()+
					"</td><td>"+c.getPostcode()+"</td><td>"+c.getPhone()+"</td><td>"+c+"</td><td>");
			out.println("</td></tr>");
		}
		

	}

}
