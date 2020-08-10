package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.CategoryDao;
import com.spring.model.Category;

public class CategoryServiceImpl implements CategoryService {

	/*
	 * Create a new category
	 */
	@Autowired
	private CategoryDao dao;
	@Override
	public void saveCategory(Category cat) {
		dao.saveCategory(cat);
		
	}
	@Override
	public void deleteCategory(int id) {
		dao.deleteCategory(id);
	}

		

	@Override
	public void updateCategory(Category category) {
		dao.updateCategory(category);
	}
	

	@Override
	public List<Category> findAllCategoryByUserId() {
		return dao.findAllCategoryByUserId();
	}


	@Override
	public Category getByid(int id) throws ClassNotFoundException {
		return dao.getByid(id);
	}


}
