package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.CarDaoImpl;

/**
 * Servlet implementation class Update2
 */
public class Update2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Update2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		CarDaoImpl impl = new CarDaoImpl();
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String id = request.getParameter("car_id");
		int car_id = Integer.parseInt(id);
		String carname = request.getParameter("carname");
		String descrption = request.getParameter("descrption");
		String type = request.getParameter("type");
		String price = request.getParameter("price_km");
		int price_km = Integer.parseInt(price);
		String cs=request.getParameter("carstrength");
	       int carstrength=Integer.parseInt("cs");
	       String status=request.getParameter("status");
	         

		impl.updatecar(car_id, carname, descrption, type, price_km,carstrength,status);
		
		pw.println("<a href=CarView>Home</a>");

	}

}
