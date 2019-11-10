package com.query.com;

public interface OrderedItemsQuery {
String INSERT_QUERY="insert into uorder(car_id,carname,type,price_km,km) values(?,?,?,?,?)";
String SELECT_QUERY="select * from uorder";
String UPDATE_QUERY="update uorder set km=? where car_id=?";
 String DELETE_QUERY="delete from uorder where car_id=?";
 String BILL_QUERY="select car_id,km,price_km from uorder";
}
