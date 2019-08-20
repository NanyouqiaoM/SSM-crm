package com.xiyu.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiyu.core.dao.UserDao;
import com.xiyu.core.po.User;
import com.xiyu.core.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	//×¢ÈëUserDao
	@Autowired
	private UserDao userDao;
	public User findUser(String usercode,String password) {
		// TODO Auto-generated method stub
		
		return this.userDao.findUser(usercode, password);
	}

}
