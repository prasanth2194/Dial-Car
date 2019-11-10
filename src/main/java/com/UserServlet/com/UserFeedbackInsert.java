package com.UserServlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.AdminDaoimpl.com.FeedBackDaoImpl;
import com.Bean.com.FeedBack;
import com.Utility.com.ConnectionManager;

/**
 * Servlet implementation class UserFeedbackInsert
 */
public class UserFeedbackInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);

    public UserFeedbackInsert() {
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
	FeedBack fd=null;
		FeedBackDaoImpl fdao=new  FeedBackDaoImpl();
		String  name=request.getParameter("name");
		String email=request.getParameter("email");
		String p=request.getParameter("phone");
		Long phone=Long.parseLong(p);
		String feedback=request.getParameter("feedback");
          
FeedBack f=new FeedBack(name,email,phone,feedback);          
        int status=fdao.feedback(f);
        if(status>0){  
            out.print("<p>Feedback saved successfully!</p>"); 
            logger.info("Feedback saved successfully");
            request.getRequestDispatcher("Aboutus.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record"); 
            logger.info("Sorry! unable to save record");
        }  
          
        out.close();  

}
		

	}


