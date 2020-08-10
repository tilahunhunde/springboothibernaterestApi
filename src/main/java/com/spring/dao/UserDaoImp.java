package com.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.Category;
import com.spring.model.User;

public class UserDaoImp extends AbstractDao implements UserDao {

	@Override
	public void updateUser(User user) {
		getSession().update(user);
		
	}

	@Override
	public void saveUser(User usr) {
		  persist(usr);
		
	}

	@Override
	public void deleteLoginByUserId(int userId) {
		Query query = getSession().createSQLQuery("delete from Category where UserId = :?");
        query.setInteger("UserId",userId);
        query.executeUpdate();
	}

	@Override
	public User getByUserId(int userId) {
		 Criteria criteria = getSession().createCriteria(User.class);
	        criteria.add(Restrictions.eq("Id",userId));
	        return (User) criteria.uniqueResult();
	}
	
}
