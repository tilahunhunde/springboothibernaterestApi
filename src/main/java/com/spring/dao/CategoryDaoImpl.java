package com.spring.dao;

import java.util.List;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.spring.model.Category;



public class CategoryDaoImpl extends AbstractDao implements CategoryDao {
	
	public void saveCategory(Category cat) {
		  persist(cat);
		
	}

	@SuppressWarnings("rawtypes")
	public void deleteCategory(int Id) {
		
		Query query = getSession().createSQLQuery("delete from Category where UserId = :?");
        query.setInteger("UserId", Id);
        query.executeUpdate();
	}

	@Override
	public void updateCategory(Category category) {
		 getSession().update(category);
		
	}

	@Override
	public Category getByid(int id) throws ClassNotFoundException {
		 Criteria criteria = getSession().createCriteria(Category.class);
	        criteria.add(Restrictions.eq("Id",id));
	        return (Category) criteria.uniqueResult();
	}

	@Override
	public List<Category> findAllCategoryByUserId() {
		 Criteria criteria = getSession().createCriteria(Category.class);
	        return (List<Category>) criteria.list();
	}

	
}
