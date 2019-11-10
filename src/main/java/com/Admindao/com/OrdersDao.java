package com.Admindao.com;

import java.util.List;

import com.Bean.com.Orders;



public interface OrdersDao {
	List<Orders> viewallorders();
	Orders vieworders(int oid);
}
