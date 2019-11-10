package com.UserDaoImpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Bean.com.Uregister;
import com.UserDao.com.URegisterDao;
import com.Utility.com.ConnectionManager;
import com.query.com.Uregister_Query;


public class URegisterDaoImpl implements URegisterDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;


	public int register(Uregister ar) {
		int count = 0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(Uregister_Query.INSERT_Query);
			ps.setString(1, ar.getForename());
			ps.setString(2, ar.getSurname());
			ps.setString(3, ar.getAddress1());
			ps.setString(4, ar.getAddress2());
			ps.setInt(5, ar.getPost_code());
			ps.setLong(6, ar.getPhone());
			ps.setString(7, ar.getEmail());
			ps.setString(8, ar.getUsername());
			ps.setString(9, ar.getPassword());
			count=ps.executeUpdate();
			if(count!=0)
			{
				System.out.println("user registered");
			}
			else{
				System.out.println("user not registered");
			}
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;	

	}

	public boolean login(String username, String password) {
		boolean flag=false;
		// TODO Auto-generated method stub
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(Uregister_Query.SELECT_QUERY);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	
	}

	}


