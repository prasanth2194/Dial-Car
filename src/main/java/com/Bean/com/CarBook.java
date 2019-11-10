package com.Bean.com;

public class CarBook {
	private int bcid;
	private int car_id;
	private int cid;
	private String forename;
	private long phone;
	private String date;
	private String pickuppoint;
	private int km;
	private int totalbill;
	private String paymenttype;
	private String status;
	public CarBook(int bcid, int car_id, int cid, String forename, long phone, String date, String pickuppoint, int km,
			int totalbill, String paymenttype, String status) {
		super();
		this.bcid = bcid;
		this.car_id = car_id;
		this.cid = cid;
		this.forename = forename;
		this.phone = phone;
		this.date = date;
		this.pickuppoint = pickuppoint;
		this.km = km;
		this.totalbill = totalbill;
		this.paymenttype = paymenttype;
		this.status = status;
	}
	public CarBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBcid() {
		return bcid;
	}
	public void setBcid(int bcid) {
		this.bcid = bcid;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPickuppoint() {
		return pickuppoint;
	}
	public void setPickuppoint(String pickuppoint) {
		this.pickuppoint = pickuppoint;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(int totalbill) {
		this.totalbill = totalbill;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
