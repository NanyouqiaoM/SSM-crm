package com.xiyu.core.dao;

import org.apache.ibatis.annotations.Param;

import com.xiyu.core.po.User;

public interface UserDao {
	
	//��ѯ�û�
	public User findUser(@Param("usercode")String usercode,@Param("password")String password);
}
