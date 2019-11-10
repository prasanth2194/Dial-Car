package com.UserDaoImpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.AdminDaoimpl.com.CarDaoImpl;
import com.Bean.com.Car;
import com.UserDao.com.ACarDao;
import com.Utility.com.ConnectionManager;
import com.query.com.OrderedItemsQuery;

public class ACarDaoImpl implements ACarDao {
	public static final Logger logger = LogManager.getLogger(ConnectionManager.class);
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	CarDaoImpl ad = new CarDaoImpl();

	public int Addtocart() {
		List<Car> viewCars = ad.viewallcars();
		try {
			con = ConnectionManager.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Car pd : viewCars) {
			System.out.println(pd.getCar_id() + "\t" + pd.getCarname() + "\t" + pd.getDescrption() + "\t" + pd.getType()
					+ "\t" + pd.getPrice_km());

		}

		System.out.println("Which Car do u want to drive");
		int pid = sc.nextInt();
		System.out.println("Enter the km");
		int km = sc.nextInt();

		for (Car pd : viewCars) {
			if (pd.getCar_id() == pid) {
				try {
					ps = con.prepareStatement(OrderedItemsQuery.INSERT_QUERY);
					ps.setInt(1, pd.getCar_id());
					ps.setString(2, pd.getCarname());
					ps.setString(3, pd.getType());

					ps.setInt(4, pd.getPrice_km());
					ps.setInt(5, km);

					int count = ps.executeUpdate();
					if (count != 0)
						System.out.println("Added to cart succcessfully");
					else
						System.out.println("Not added");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				finally {
					try {
						ConnectionManager.release(con, ps);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
		return km;

	}

	public void viewCart() {
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(OrderedItemsQuery.SELECT_QUERY);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4)
						+ "\t" + rs.getInt(5));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				ConnectionManager.release(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public int update(int car_id) {
		int count = 0;

		try {
			System.out.println("Enter km");
			int km = sc.nextInt();
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(OrderedItemsQuery.UPDATE_QUERY);

			// ps=con.prepareStatement(StudentQueryConstants.UPDATE_NAME);
			ps.setInt(1, km);
			ps.setInt(2, car_id);
			count = ps.executeUpdate();
			if (count != 0) {
				System.out.println("Km updated");

			} else {
				System.out.println("Km not updated");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.release(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return count;

	}

	public int deletefromcart(int car_id) {
		int count = 0;
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(OrderedItemsQuery.DELETE_QUERY);
			ps.setInt(1, car_id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.release(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return count;

	}

	public int generateBill(int car_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
