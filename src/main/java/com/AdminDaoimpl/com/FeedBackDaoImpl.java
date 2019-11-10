package com.AdminDaoimpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Admindao.com.FeedBackDao;
import com.Bean.com.CarBook;
import com.Bean.com.FeedBack;
import com.Utility.com.ConnectionManager;



public class FeedBackDaoImpl implements FeedBackDao {
	Connection con = null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public int feedback(FeedBack fd) {
		int count = 0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("insert into feedback (name,email,phone,feedback)values(?,?,?,?)");
			ps.setString(1, fd.getName());
			ps.setString(2, fd.getEmail());
			ps.setLong(3, fd.getPhone());
			ps.setString(4, fd.getFeedback());
			count=ps.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				ConnectionManager.release(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return count;
	}

	public List<FeedBack> viewallfeedback() {
List<FeedBack>list=new ArrayList<FeedBack>();
		
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("select  name,email,phone,feedback from feedback");
		rs=ps.executeQuery();
		while(rs.next())
		{
			FeedBack e=new FeedBack(rs.getString(1),rs.getString(2),rs.getLong(3),rs.getString(4));

		list.add(e);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;



	}

}
