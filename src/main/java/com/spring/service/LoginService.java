package com.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.LoginDaoImpl;
import com.spring.model.User;
@Service
public class LoginService {
	@Autowired
    private LoginDaoImpl Dao;

    @Transactional
    public User getByUsername(String usr) {
    	return  Dao.getByUsername(usr);
  
    }
	
    @Transactional
    public User getByPassword(String pass) {
      return Dao.getByPassword(pass);
    }

}
