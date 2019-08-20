package com.xiyu.core.service;


import com.xiyu.core.po.User;

public interface UserService {
	public User findUser(String usercode,String password);
}
