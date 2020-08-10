package com.spring.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
@Repository
public class LoginDaoImpl {
	  @PersistenceContext
	    private EntityManager entityManager;
		
	    public User getByUsername(String Username) {
	      return entityManager.find(User.class, Username);
	    }
	  
	  
	    public User getByPassword(String pass) {
	      return (User) entityManager.createQuery(
	        "from Account where password = :pass")
	        .setParameter("password", pass)
	        .getSingleResult();
	    }
}
