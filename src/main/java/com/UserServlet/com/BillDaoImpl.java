package com.UserServlet.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Bean.com.Bill;
import com.UserDao.com.BillDao;
import com.Utility.com.ConnectionManager;

public class BillDaoImpl  implements BillDao{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public int addbill(Bill b) {
		int count = 0;
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement("insert into bill(bid,cbid,km,totalbill,status) values(?,?,?,?,?)");
			ps.setInt(1, b.getBid());
			ps.setInt(3, b.getBcid());
			ps.setInt(4, b.getKm());
			ps.setLong(5, b.getTotalbill());
			ps.setString(6, b.getStatus());
			count = ps.executeUpdate();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return count;
	
	}

	public Bill generateBill(int bid) {
		// TODO Auto-generated method stub
		Bill b = null;
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(
					"select b.bid,b.bcid,c.name,c.phone,c.date,c.pickuppoint,c.km,c.paymentype,c.status,b.totalbill,b.status from bill b,bookcar c where b.bcid=c.bcid and b.bid=?");
			ps.setInt(1, bid);
			rs = ps.executeQuery();
			if (rs.next()) {
			b = new Bill(rs.getInt(1),rs.getInt(2),	rs.getString(3), rs.getLong(4), rs.getString(5), rs.getString(6),
				rs.getInt(7), rs.getString(8),rs.getString(9), rs.getInt(10));
				/*System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4)
						+ "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "\t" + rs.getLong(7) + "\t" + rs.getInt(8)
						+ "\t" + rs.getLong(9) + "\t" + rs.getString(10));*/

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

	public List<Bill> viewAllBills() {
		List<Bill> viewBills = new ArrayList<Bill>();
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement("select b.bid,b.bcid,c.name,c.phone,c.date,c.pickuppoint,c.km,c.paymentype,c.status,b.totalbill,b.status from bill b,bookcar c where b.bcid=c.bcid and b.bid=?");

			rs = ps.executeQuery();
			while (rs.next()) {
				Bill b1 = new Bill(rs.getInt(1),rs.getInt(2),	rs.getString(3), rs.getLong(4), rs.getString(5), rs.getString(6),
						rs.getInt(7), rs.getString(8),rs.getString(9), rs.getInt(10));
				viewBills.add(b1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return viewBills;
		
	}

}
