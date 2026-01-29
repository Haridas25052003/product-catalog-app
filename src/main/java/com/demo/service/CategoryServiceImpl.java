package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao cd;

	@Override
	public Category addCategory(Category category) {
		
		return cd.save(category);
	}

	@Override
	public List<Category> getAll() {
		
		return cd.findAll();
	}

	@Override
	public Category updateCategory(int id, Category category) {
		
		return cd.save(category);
	}

	@Override
	public void deleteCategory(int id) {
		cd.deleteById(id);
		
	}
	
}
