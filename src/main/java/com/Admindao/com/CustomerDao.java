package com.Admindao.com;

import java.util.List;

import com.Bean.com.Customer;



public interface CustomerDao {
	List<Customer> viewallcustomers();
	Customer viewcustomer(int cid);
}
