package com.AdminServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AdminDaoimpl.com.AdminLoginImpl;
import com.Admindao.com.AdminLoginDao;





/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		javax.servlet.RequestDispatcher r=null;
		AdminLoginDao impl=new AdminLoginImpl();
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession hs=request.getSession();
		hs.setAttribute("sa", userName);
		if(userName.equals("sahithi")&password.equals("prassi"))
		{
			out.println("Login successfully");
			 r= request.getRequestDispatcher("AdminCart.html"); 
			r.forward(request, response);
		}
		else
		{
		out.println("Login not Succesfully");
		RequestDispatcher rd=request.getRequestDispatcher("awpass.html"); 
		rd.forward(request, response);
		}
		
		
		
		
	}


	}


