package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdminDaoimpl.com.OrderDaoImpl;
import com.Bean.com.Orders;

/**
 * Servlet implementation class OView
 */
public class OView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OView() {
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
		PrintWriter pw = response.getWriter();
		OrderDaoImpl odao = new OrderDaoImpl();
		response.setContentType("text/html");
		int oid = 0;
		odao.vieworders(oid);
		Orders c = new Orders();
		PrintWriter out = response.getWriter();
		out.println(
				"<table border='3px' cellspacing='5px' cellpadding='8px' align='center' margin-top='200px' margin-left='100px'>");
		out.println("<tr><th>Oid</th><th>cid</th><th>km</th><th>payment</th><th>total</th></tr>");
		if (oid != 0) {
			out.println("<tr><td>");
			out.println(+c.getOid() + "</td><td>" + c.getCid() + "</td><td>" + c.getKm() + "</td><td>"
					+ c.getPayment_type() + "</td><td>" + c.getTotal() + "</td><td>");
			out.println("</td></tr>");

		}
	}
}
