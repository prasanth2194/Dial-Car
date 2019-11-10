package com.Bean.com;

public class FeedBack {
	private String name;
	private String email;
	private long phone;
	private String feedback;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public FeedBack(String name, String email, long phone, String feedback) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.feedback = feedback;
	}
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
