package com.Bean.com;

public class BookCar {

private int car_id;
private String date;
private int cid;
private String pickuppoint;
private int km;
private int totalbill;
private String paymenttype;
private String status;
public BookCar( int car_id, String date, int cid, String pickuppoint, int km, int totalbill,
		String paymenttype, String status) {
	super();
	this.car_id = car_id;
	this.date = date;
	this.cid = cid;
	this.pickuppoint = pickuppoint;
	this.km = km;
	this.totalbill = totalbill;
	this.paymenttype = paymenttype;
	this.status = status;
}
public BookCar() {
	super();
	// TODO Auto-generated constructor stub
}

public BookCar(int car_id2, String date2, String pickuppoint2, int km2, int totalbill2, String paymenttype2,
		String status2) {
	// TODO Auto-generated constructor stub
}
public int getCar_id() {
	return car_id;
}
public void setCar_id(int car_id) {
	this.car_id = car_id;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
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