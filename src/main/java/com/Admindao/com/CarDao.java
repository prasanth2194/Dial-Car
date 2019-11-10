package com.Admindao.com;

import java.util.List;

import com.Bean.com.Car;



public interface CarDao {
	int addcar(Car ec);
	Car viewcar(int car_id);
	List<Car> viewallcars();

	int updatecar(int car_id,String carname,String descrption,String type,int price_km,int carstrength,String status);
	int deletecar(int car_id);
}
