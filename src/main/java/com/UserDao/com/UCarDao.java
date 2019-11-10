package com.UserDao.com;

import java.util.List;

import com.Bean.com.Car;

public interface UCarDao {
	List<Car> ViewEconomyCar();
	List<Car> ViewUltraCar();
	List<Car> ViewPremiumCar();
}
