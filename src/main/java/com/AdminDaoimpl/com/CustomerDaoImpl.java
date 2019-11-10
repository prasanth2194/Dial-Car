package com.AdminDaoimpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Admindao.com.CustomerDao;
import com.Bean.com.Customer;
import com.Utility.com.ConnectionManager;
import com.query.com.CustomerQuery;


public class CustomerDaoImpl implements CustomerDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public List<Customer> viewallcustomers() {
		List<Customer> viewallcustomer = new ArrayList <Customer>();

		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(CustomerQuery.SELECT_QUERY);
			rs=ps.executeQuery();
			while(rs.next())
			{
			Customer ce=new Customer( rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getLong(7),rs.getString(8));
			viewallcustomer.add(ce);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return viewallcustomer;
	
	}

	public Customer viewcustomer(int cid) {
Customer c=null;
		
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(CustomerQuery.SELECT_SPECIFIC_QUERY);
			ps.setInt(1, cid);
			rs=ps.executeQuery();
			while(rs.next())
			{
			c= new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getLong(7),rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;

	}

}
