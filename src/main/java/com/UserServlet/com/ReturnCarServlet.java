package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UserDaoImpl.com.BookCarDaoImpl;

/**
 * Servlet implementation class ReturnCarServlet
 */
public class ReturnCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnCarServlet() {
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

        BookCarDaoImpl cd=new BookCarDaoImpl();
        String cid=request.getParameter("car_id");
        int car_id=Integer.parseInt(cid);
       
        int count=cd.returncar( car_id);
        if (count!=0){
        request.getRequestDispatcher("return.html").include(request, response);
        out.println("Car Returned Sucessfully <br>");
        out.println("Thanks for Choosing Dial Your Car");
        }
		
	}

}
