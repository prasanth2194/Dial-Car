package com.UserDao.com;

import java.util.List;

import com.Bean.com.BookCar;
import com.Bean.com.CarBook;
import com.Bean.com.Customer;

public interface BookCarDao {
	int bookcar(BookCar ib);
	int returncar(int car_id);
	List<CarBook> viewBookedCar();
	CarBook viewspecificcar(int cid);
	int PriceDetalis(int car_id);
	int retrivecid(String username);
	List<Customer>viewCustomer();


}
