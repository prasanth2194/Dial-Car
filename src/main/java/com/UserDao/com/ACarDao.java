package com.UserDao.com;

public interface ACarDao {
	int Addtocart();
	void viewCart();
	int update (int car_id);
	int deletefromcart(int car_id);  
	int generateBill(int car_id);
}
