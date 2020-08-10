package com.spring.dao;

import java.util.List;

import com.spring.model.Category;


public interface CategoryDao {
	void saveCategory(Category cat);

	void deleteCategory(int noteId);

	void updateCategory(Category category);
	public Category getByid(int id) throws ClassNotFoundException;

	List<Category> findAllCategoryByUserId();

}
