package com.query.com;

public interface Uregister_Query {
	public static String INSERT_Query="insert into registration (forename,surname,address1,address2,postcode,phone,email,username,password) values(?,?,?,?,?,?,?,?,?)";
	public static String SELECT_QUERY="select * from registration where username=? and password=?";

}
