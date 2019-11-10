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
 * Servlet implementation class Update1
 */
public class Update1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Update1() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CarDaoImpl impl = new CarDaoImpl();
		PrintWriter pw = response.getWriter();
		Car cs = new Car();
		// pw.println("<a href=student.html>update</a>");

		String no = request.getParameter("car_id");
		int car_id = Integer.parseInt(no);
		cs = impl.viewcar(car_id);
		response.setContentType("text/html");
		pw.println("<table border='3'>");
		if (cs != null) {
			pw.println("<table align=center cellspacing=10px cellpadding=5px>");
			pw.println("<form action=Update2>");
			pw.println("<tr><td>Car_id:</td><td><input type='text' readonly name=car_id value=" + cs.getCar_id()
					+ "></td></tr><br>");
			pw.println("<tr><td>Car Name:</td><td><input type='text' name=carname value=" + cs.getCarname()
					+ "></td></tr><br>");
			pw.println("<tr><td>Descrption:</td><td><input type='text' name=descrption value=" + cs.getDescrption()
					+ "></td></tr><br>");
			pw.println("<tr><td>Type:</td><td><input type='text' name=type value=" + cs.getType() + "></td></tr><br>");
			pw.println("<tr><td>Price_km:</td><td><input type='text' name=price_km value=" + cs.getPrice_km()
					+ "></td></tr><br>");
			pw.println("<tr><td>CarStrength:</td><td><input type='text' name=type value=" + cs.getCarstrength() + "></td></tr><br>");
			pw.println("<tr><td>Status:</td><td><input type='text' name=type value=" + cs.getStatus() + "></td></tr><br>");

			pw.println("<tr><td></td><td><input type='submit' name=submit value=Update></td></tr><br>");
			pw.println("</form>");
			pw.println("</table>");

		}

	}
}