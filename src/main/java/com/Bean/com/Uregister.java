package com.Bean.com;

public class Uregister {
	private String forename;
	private String surname;
	private String address1;
	private String address2;
	private int post_code;
	private long phone;
	private String email;
	private String username;
	private String password;
	public Uregister( String forename, String surname, String address1, String address2, int post_code,
			long phone, String email, String username, String password) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address1 = address1;
		this.address2 = address2;
		this.post_code = post_code;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public Uregister() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getPost_code() {
		return post_code;
	}
	public void setPost_code(int post_code) {
		this.post_code = post_code;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	


}
