package com.Bean.com;

public class Bill {
	private int bid;
	private int bcid;
	private String name;
	private Long mobile;
	private  String  date;
	private String pickuppoint;
	private  int km;
	private String payment;
	private String status;
	private int totalbill;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(int bid, int bcid, int km, int totalbill, String status) {
		super();
		this.bid = bid;
		this.bcid = bcid;
		this.km = km;
		this.totalbill = totalbill;
		this.status = status;
	}

	public Bill(int bid, int bcid, String name, Long mobile, String date, String pickuppoint, int km, String payment,
			String status, int totalbill) {
		super();
		this.bid = bid;
		this.bcid = bcid;
		this.name = name;
		this.mobile = mobile;
		this.date = date;
		this.pickuppoint = pickuppoint;
		this.km = km;
		this.payment = payment;
		this.status = status;
		this.totalbill = totalbill;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getBcid() {
		return bcid;
	}

	public void setBcid(int bcid) {
		this.bcid = bcid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
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

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTotalbill() {
		return totalbill;
	}

	public void setTotalbill(int totalbill) {
		this.totalbill = totalbill;
	}
	
	
}
