package com.Bean.com;

public class Customer {
	private int cid;
	private String forename;
	private String surname;
	private String address1;
	private String address2;
	private int postcode;
	private long phone;
	private String email;
	public Customer(int cid, String forename, String surname, String address1, String address2, int postcode,
			long phone, String email) {
		super();
		this.cid = cid;
		this.forename = forename;
		this.surname = surname;
		this.address1 = address1;
		this.address2 = address2;
		this.postcode = postcode;
		this.phone = phone;
		this.email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int int1, String string, long long1, String string2) {
		// TODO Auto-generated constructor stub
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


}
