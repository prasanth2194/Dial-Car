package com.UserDaoImpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Bean.com.Car;
import com.UserDao.com.UCarDao;
import com.Utility.com.ConnectionManager;
import com.query.com.UCarsQuery;


public class UCarsDaoImpl implements UCarDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public List<Car> ViewEconomyCar() {
		List<Car> viewallcar = new ArrayList <Car>();

	
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(UCarsQuery.SELECT_QUERY);
			rs=ps.executeQuery();
			while(rs.next())
			{
		Car	p = new Car (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
		viewallcar.add(p);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				ConnectionManager.release(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return viewallcar;
		
	
	

	}
	public List<Car> ViewUltraCar() {
		List<Car> viewallcar = new ArrayList <Car>();


		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(UCarsQuery.SELECT_QUERY1);
			rs=ps.executeQuery();
			while(rs.next())
			{
		Car	p = new Car (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
		viewallcar.add(p);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				ConnectionManager.release(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return viewallcar;
		
	
		
	}
	public List<Car> ViewPremiumCar() {
		List<Car> viewallcar = new ArrayList <Car>();

		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(UCarsQuery.SELECT_QUERY2);
			rs=ps.executeQuery();
			while(rs.next())
			{
		Car	p = new Car (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
			viewallcar.add(p);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				ConnectionManager.release(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return viewallcar;
	
		
		
	
	}
			
	}

	
	


