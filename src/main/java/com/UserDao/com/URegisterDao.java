package com.UserDao.com;

import com.Bean.com.Uregister;

public interface URegisterDao {
	public int register(Uregister ar);
	public boolean login(String username,String password);

}
