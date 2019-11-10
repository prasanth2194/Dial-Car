package com.Admindao.com;

import java.util.List;

import com.Bean.com.FeedBack;



public interface FeedBackDao {
	
	int feedback(FeedBack fd);
	
	List<FeedBack> viewallfeedback();


}
