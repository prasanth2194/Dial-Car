package com.UserDao.com;

import java.util.List;

import com.Bean.com.Bill;

public interface BillDao {
	public int addbill(Bill b);
	public Bill generateBill(int bid);
	public List<Bill> viewAllBills();

}
