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
import com.Utility.com.ConnectionManager;



/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CarDaoImpl impl = new CarDaoImpl();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String no=request.getParameter("car_id");
		int car_id=Integer.parseInt(no);
		int count=impl.deletecar(car_id);
		if(count!=0)
		{
			pw.println("Data deleted");
			logger.info("Data deleted");
			pw.println("<a href=CarView>viewRecords</a>");
		}
		else
		{
			pw.println("Data not Deleted");
			logger.info("Data deleted");
			pw.println("<a href=View>viewRecords</a>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
