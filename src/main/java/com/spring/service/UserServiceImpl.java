package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.UserDao;
import com.spring.model.User;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao Dao;
	@Override
	public void updateUser(User user) {
		Dao.updateUser(user);
	}


	@Override
	public void deleteLoginByUserId(int UserId) {
		Dao.deleteLoginByUserId(UserId);

	}

	@Override
	public User getByUserId(int UserId) {
		return Dao.getByUserId(UserId);
	}

	@Override
	public void saveUser(User usr) {
		Dao.saveUser(usr);
		
	}

}
