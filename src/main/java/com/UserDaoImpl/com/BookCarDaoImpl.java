package com.UserDaoImpl.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Bean.com.BookCar;
import com.Bean.com.CarBook;
import com.Bean.com.Customer;
import com.UserDao.com.BookCarDao;
import com.Utility.com.ConnectionManager;

public class BookCarDaoImpl implements BookCarDao{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public int bookcar(BookCar ib) {
		int count=0;
		//int bcid=ib.getBcid();
		//System.out.println(bcid);
			
			try {
				con=ConnectionManager.getConnection();
				ps=con.prepareStatement("insert into bookcar (car_id,date,cid,pickuppoint,km,totalbill,paymenttype,status)values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, ib.getCar_id());
				ps.setString(2, ib.getDate());
				ps.setInt(3, ib.getCid());
				ps.setString(4,ib.getPickuppoint());
				ps.setInt(5,ib.getKm());
				ps.setInt(6, ib.getTotalbill());
				ps.setString(7, ib.getPaymenttype());
				ps.setString(8, ib.getStatus());
				count=ps.executeUpdate();
				if(count>0){
				 PreparedStatement ps5=con.prepareStatement("select carstrength from car");
				 rs=ps5.executeQuery();
				 while(rs.next())
				 {
					 int q=(rs.getInt(1)-1);
					 PreparedStatement ps2=con.prepareStatement("update car set carstrength=? where car_id=?");
					 ps2.setInt(1,q);
					 ps2.setInt(2, ib.getCar_id());
					 count=ps2.executeUpdate();
					 if(count!=0)
						 System.out.println("carstrength updated");
					 
					 else
						 System.out.println("not updated carstrength");
					 String status1="Not Avaliable";
					 PreparedStatement ps3=con.prepareStatement("update car set status=? where car_id=?");
					 ps3.setString(1, status1);
					 ps3.setInt(2, ib.getCar_id());
					 count=ps3.executeUpdate();
					 if(count!=0)
						 System.out.println("Status updated");
					 
					 else
						 System.out.println("not updated Status");
				 }
				
				}
			}
					
			 catch (Exception e) {
				System.out.println(e);
			}
			finally
			{
				try {
					ConnectionManager.release(con, ps, rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
				

		return count;
	}
				

	public int returncar( int car_id) {
int count=0;
		
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("update car set status='Avaliable' where  car_id=?");
		//ps.setInt(1, cbid);
		ps.setInt(1, car_id);
		count=ps.executeUpdate();
		
			 PreparedStatement ps5=con.prepareStatement("select carstrength from car");
			 rs=ps5.executeQuery();
			 while(rs.next())
			 {
				 int p=(rs.getInt(1)+1);
				 PreparedStatement ps2=con.prepareStatement("update car set carstrength=? where car_id=? ");
				 ps2.setInt(1,p);
				 ps2.setInt(2, car_id);
				 
				int status1=ps2.executeUpdate();
				 if(status1!=0)
					 System.out.println("CarStrength updated");
				 else
					 System.out.println(" CarStrength not updated ");
			 }
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				ConnectionManager.release(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return count;
		
		
	}

	public List<CarBook> viewBookedCar() {
		// TODO Auto-generated method stub
List<CarBook>list=new ArrayList<CarBook>();
		
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("select b.bcid,b.car_id,r.cid,r.forename,r.phone,b.date,b.pickuppoint,b.km,b.totalbill,b.paymenttype,b.status from bookcar b,registration r where b.cid=r.cid");
		rs=ps.executeQuery();
		while(rs.next())
		{
			CarBook e=new CarBook(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11));

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


	public CarBook viewspecificcar(int cid) {

		CarBook b = null;
		try {
			con = ConnectionManager.getConnection();
			ps=con.prepareStatement("select b.bcid,b.car_id,r.cid,r.forename,r.phone,b.date,b.pickuppoint,b.km,b.totalbill,b.paymenttype,b.status from bookcar b,registration r where b.cid=r.cid and r.cid=? ");
			ps.setInt(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				b=new CarBook(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11));
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	
	}


	public int PriceDetalis(int car_id) {
		int price=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("select price_km from car  where car_id=?");
			ps.setInt(1, car_id);
			rs=ps.executeQuery();
			while(rs.next())
			{
			price=rs.getInt(1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return price;

	
	}


	public int retrivecid(String username) {
		// TODO Auto-generated method stub
		int id=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("select cid from carsharing.registration  where username=?");
			ps.setString(1, username);
			rs=ps.executeQuery();
			while(rs.next())
			{
			id=rs.getInt(1);
			System.out.println(id);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	
	
	}


	public List<Customer> viewCustomer() {
List<Customer>list=new ArrayList<Customer>();
		
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("select cid,forename,phone,email from registration where cid=? ");
		rs=ps.executeQuery();
		while(rs.next())
		{
			Customer e=new Customer(rs.getInt(1),rs.getString(2),rs.getLong(3),rs.getString(4));

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
