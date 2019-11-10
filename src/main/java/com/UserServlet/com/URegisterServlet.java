package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.com.Uregister;
import com.UserDaoImpl.com.URegisterDaoImpl;


/**
 * Servlet implementation class URegisterServlet
 */
public class URegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public URegisterServlet() {
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
		URegisterDaoImpl rdao=new URegisterDaoImpl();
		String forename=request.getParameter("forename");
		String surname=request.getParameter("surname");
		String address1=request.getParameter("address1");
		String address2=request.getParameter("address2");
		String post=request.getParameter("postcode");
        int postcode=Integer.parseInt(post);
		String cmobile=request.getParameter("mobile");
		Long mobile=Long.parseLong(cmobile);
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession hs=request.getSession();
		hs.setAttribute("sa", username);
		Uregister u=new Uregister(forename,surname,address1,address2,postcode,mobile,email,username,password);
		int count=rdao.register(u);
		if(count!=0)
		{
			out.println("Registered Successfully");
			RequestDispatcher rd=request.getRequestDispatcher("userlogin.html"); 
			rd.forward(request, response);
		}
		else
		{
			out.println("Not Registered");
			RequestDispatcher rd=request.getRequestDispatcher("register.html"); 
			rd.forward(request, response);
		}
	}

	}


