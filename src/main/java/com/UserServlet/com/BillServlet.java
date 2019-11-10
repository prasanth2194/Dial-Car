package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BillServlet
 */
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		BillDaoImpl bdao = new BillDaoImpl();
		String id = request.getParameter("bid");
		int bid = Integer.parseInt(id);
		String id1=request.getParameter("bcid");
		int bcid=Integer.parseInt(id1);
		String km1 = request.getParameter("km");
		int km=Integer.parseInt(km1);
		//int totalbill=km*
		//int up=	bdao.unitPriceDetails(csid);

	}

}
