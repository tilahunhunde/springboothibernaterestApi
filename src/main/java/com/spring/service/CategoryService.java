package com.spring.service;

import java.util.List;

import com.spring.model.Category;

public interface CategoryService {
	void saveCategory(Category cat);

	void deleteCategory(int noteId);

	void updateCategory(Category category);
	public Category getByid(int id) throws ClassNotFoundException;

	List<Category> findAllCategoryByUserId();


}
