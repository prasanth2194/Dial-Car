package com.query.com;

public interface AdminQuery {
	String ADMIN_QUERY="select * from admin where username=? and password=?";
	String USER_QUERY="select * from registration where username=? and password=?";

}
