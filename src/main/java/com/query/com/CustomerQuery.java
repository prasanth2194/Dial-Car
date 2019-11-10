package com.query.com;

public interface CustomerQuery {
	public static String SELECT_QUERY="select cid, forename,surname,address1,address2,postcode,phone,email from registration";
	public static String SELECT_SPECIFIC_QUERY="select * from registration where cid=?";


}
