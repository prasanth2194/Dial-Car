package com.query.com;

public interface CarQuery {
	String INSERT_QUERY="insert into car values(?,?,?,?,?,?,?)";
	String SELECT_SPECIFIC_QUERY="select * from car where car_id=?";
	String SELECT_QUERY="select * from car";
	String UPDATE_QUERY="update car set  carname=?,descrption=?,type=?,price_km=?,carstrength=?,status=? where car_id=?";
	String DELETE_QUERY="delete from car where car_id=?";
	

}
