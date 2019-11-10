package com.Bean.com;

public class Car {
	private int car_id;
	private String carname;
	private String descrption;
	private String type;
	private int price_km;
	private int carstrength;
	private String status;
	public Car(int car_id, String carname, String descrption, String type, int price_km, int carstrength,
			String status) {
		super();
		this.car_id = car_id;
		this.carname = carname;
		this.descrption = descrption;
		this.type = type;
		this.price_km = price_km;
		this.carstrength = carstrength;
		this.status = status;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice_km() {
		return price_km;
	}
	public void setPrice_km(int price_km) {
		this.price_km = price_km;
	}
	public int getCarstrength() {
		return carstrength;
	}
	public void setCarstrength(int carstrength) {
		this.carstrength = carstrength;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	


}
