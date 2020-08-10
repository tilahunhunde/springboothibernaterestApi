package com.spring.service;

import com.spring.model.User;

public interface UserService {
	public void updateUser(User user);

	public void saveUser(User usr);

	public void deleteLoginByUserId(int userId);

	public User getByUserId(int userId);

}
