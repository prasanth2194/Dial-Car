package com.Bean.com;

public class Orders {
	private int oid;
	private int cid;
	private int km;
	private String payment_type;
	private int total;
	public Orders(int oid, int cid, int km, String payment_type, int total) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.km = km;
		this.payment_type = payment_type;
		this.total = total;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	


}
