package com.AdminDaoimpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.Admindao.com.CarDao;
import com.Bean.com.Car;
import com.Utility.com.ConnectionManager;
import com.query.com.CarQuery;


public class CarDaoImpl implements CarDao {
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public int addcar(Car ec) {
		int count = 0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(CarQuery.INSERT_QUERY);
			ps.setInt(1,ec.getCar_id());
			ps.setString(2,ec.getCarname());
			ps.setString(3,ec.getDescrption());
			ps.setString(4,ec.getType());
			ps.setInt(5, ec.getPrice_km());
			ps.setInt(6, ec.getCarstrength());
			ps.setString(7, ec.getStatus());
	
			 count=ps.executeUpdate();
				return count;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("ClassNotFoundException");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("SQL Exception");
		}
		finally
		{
			try {
				ConnectionManager.release(con,ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("SQL Exception");
			}
		}
		
		return count ;	

	}

	public Car viewcar(int car_id) {
		// TODO Auto-generated method stub
		Car pd=null;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(CarQuery.SELECT_SPECIFIC_QUERY);
			ps.setInt(1, car_id);
			rs=ps.executeQuery();
			while(rs.next())
			{
			pd = new Car (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}
		finally{
			try {
				ConnectionManager.release(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error(e);
			}
		}
		
		return pd;
	
	
	}

	public List<Car> viewallcars() {
		// TODO Auto-generated method stub
		List<Car> viewallcar = new ArrayList <Car>();
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(CarQuery.SELECT_QUERY);
			rs=ps.executeQuery();
			while(rs.next()){
		Car ec= new Car (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7));
				viewallcar.add(ec);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}
		finally{
			try {
				ConnectionManager.release(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error(e);
			}
		}
		
		return viewallcar;		
	
	}

	public int updatecar(int car_id,String carname,String descrption,String type,int price_km,int carstrength,String status) {
		// TODO Auto-generated method stub
		int count=0;
		
			try {
				con=	ConnectionManager.getConnection();
				ps=con.prepareStatement(CarQuery.UPDATE_QUERY);
				ps.setString(1, carname);
				ps.setString(2, descrption);
				ps.setString(3, type);
				ps.setInt(4, price_km);
				ps.setInt(5, carstrength);
				ps.setString(6, status);
				ps.setInt(7, car_id);
count=ps.executeUpdate();
if(count!=0)
{
				System.out.println("Updated Successfully");
}
else
{
				System.out.println("Not Updated");
}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("ClassNotFoundException");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
	

			 
		
	}

	public int deletecar(int car_id) {
		// TODO Auto-generated method stub
		int count=0;
		try {
		con=	ConnectionManager.getConnection();
		ps=con.prepareStatement(CarQuery.DELETE_QUERY);
		ps.setInt(1,car_id);
		count=ps.executeUpdate();
		return count;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionManager.release(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("SQL Exception");
			}
		}
		
		return count;	
		
	}

}
