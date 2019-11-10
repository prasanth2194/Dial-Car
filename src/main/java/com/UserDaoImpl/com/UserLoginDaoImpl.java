package com.UserDaoImpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.UserDao.com.UserLoginDao;
import com.Utility.com.ConnectionManager;
import com.query.com.AdminQuery;


public class UserLoginDaoImpl implements UserLoginDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public boolean login(String userName, String password) {
		boolean flag=false;

		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(AdminQuery.USER_QUERY);
			ps.setString(1, userName);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				flag=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}




	}


