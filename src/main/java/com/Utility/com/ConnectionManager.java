package com.Utility.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ConnectionManager {

	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);

	private static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		logger.info("Driver registred with DriverManager");
		// TODO Auto-generated method stub
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsharing", "root", "root");
		logger.info("Connection Interface Implementation Class :" + con);
		if (con != null)
			logger.info("Connection is established");
		else
			logger.info("Connection is not established");

		return con;
	}

	public static void release(Connection con, PreparedStatement ps) throws SQLException {
		if (ps != null)
			ps.close();
		if (con != null)
			con.close();
	}

	public static void release(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
		if (rs != null)
			rs.close();
		if (ps != null)
			ps.close();
		if (con != null)
			con.close();
	}

}
