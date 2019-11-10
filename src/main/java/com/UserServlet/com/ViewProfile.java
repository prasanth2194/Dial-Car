package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.com.Customer;
import com.Bean.com.FeedBack;
import com.UserDaoImpl.com.BookCarDaoImpl;

/**
 * Servlet implementation class ViewProfile
 */
public class ViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		BookCarDaoImpl v= new BookCarDaoImpl();
		
		List<Customer> list = v.viewCustomer();
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
        out.println("<html>");  
        out.println("<head>");
        out.println("<title>DAIL YOUR CAR</title>");
        out.println("  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css'/>");
        
        out.println("</head>");
        out.println("<body>");
        
        out.println("<div width='100%' height='100px'>");
        request.getRequestDispatcher("Head1.html").include(request, response);
        out.println("</div>");
        
        out.println("<div>");
        out.println("<table  class='table table-dark table-hover'>");
		out.println("<tr><th>CID</th><th>FORENAME</th><th>PHONE</th><th>EMAIL</th></tr>");
			out.println("<tr><td>");
			//out.println(getCid()+"</td><td>"+getForename()+"</td><td>"+getPhone()+"</td><td>"+getEmail());
			out.println("</td></tr>");
		
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
	 
	}


