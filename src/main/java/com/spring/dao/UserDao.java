package com.spring.dao;

import com.spring.model.User;

public interface UserDao {
	public void updateUser(User user);

	public void saveUser(User usr);

	public void deleteLoginByUserId(int userId);

	public User getByUserId(int userId);

}
