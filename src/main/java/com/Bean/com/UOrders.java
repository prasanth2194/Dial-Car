package com.Bean.com;

public class UOrders {
	private int car_id;
	private int oid;
	private String name;
	private String type;
	private int price_km;
	private int km;
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public UOrders(int car_id, int oid, String name, String type, int price_km, int km) {
		super();
		this.car_id = car_id;
		this.oid = oid;
		this.name = name;
		this.type = type;
		this.price_km = price_km;
		this.km = km;
	}
	public UOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}