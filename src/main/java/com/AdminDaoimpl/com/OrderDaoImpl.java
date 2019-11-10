package com.AdminDaoimpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Admindao.com.OrdersDao;
import com.Bean.com.Orders;
import com.Utility.com.ConnectionManager;
import com.query.com.CustomerQuery;
import com.query.com.OrdersQuery;


public class OrderDaoImpl implements OrdersDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public List<Orders> viewallorders() {
		List<Orders> viewallorder= new ArrayList <Orders>();
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(OrdersQuery.SELECT_QUERY);
			rs=ps.executeQuery();
			while(rs.next())
			{
			Orders oc=new Orders(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
		 viewallorder.add(oc);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return viewallorder;
		

	}

	public Orders vieworders(int oid) {
Orders o=null;
		
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(CustomerQuery.SELECT_SPECIFIC_QUERY);
			ps.setInt(1, oid);
			rs=ps.executeQuery();
			while(rs.next())
			{
			o= new Orders(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	

	}

}
