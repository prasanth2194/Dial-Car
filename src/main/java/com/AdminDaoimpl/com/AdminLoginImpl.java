package com.AdminDaoimpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.Admindao.com.AdminLoginDao;
import com.Utility.com.ConnectionManager;
import com.query.com.AdminQuery;


public class AdminLoginImpl implements AdminLoginDao {
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public boolean admin(String userName, String password) {
		boolean flag=false;

		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(AdminQuery.ADMIN_QUERY);
			ps.setString(1, userName);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				flag=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}
		return flag;

	}

}
