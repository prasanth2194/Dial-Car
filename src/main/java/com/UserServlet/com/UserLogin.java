package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.UserDaoImpl.com.UserLoginDaoImpl;
import com.Utility.com.ConnectionManager;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);
    public UserLogin() {
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
		UserLoginDaoImpl udao=new UserLoginDaoImpl  ();
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		boolean flag=udao.login(userName, password);
		if(flag)
		{
			out.println("Login Successfully");
			logger.info("Login Successfully");
			RequestDispatcher rd=request.getRequestDispatcher("Customermenu.html"); 
			rd.forward(request, response);
		}
		else
		{
			out.println("Login not Succesfully");
			RequestDispatcher rd=request.getRequestDispatcher("wpass.html"); 
			rd.forward(request, response);
		}
	}

	}


