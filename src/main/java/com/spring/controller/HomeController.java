package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.User;
import com.spring.service.LoginService;

public class HomeController {
	 @Autowired
	    private LoginService accountService;
		
	  
	    @RequestMapping(value = "/User/{Username}", 
	      method = RequestMethod.GET)
	    public User 
	      getUser(@PathVariable String Username) {
	      return accountService.getByUsername(Username);
	    }
	      @RequestMapping(value = "/account/{accountId}", 
	    	      method = RequestMethod.GET)
	    	    public User 
	    	      getUserpassword(@PathVariable String password) {
	    	      return accountService.getByPassword(password);
	    }
}
