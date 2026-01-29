package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
    private CategoryService cs;
	
	@PostMapping("/add")
	public Category m1(@RequestBody Category category) {
		return cs.addCategory(category);
	}

	@GetMapping("/req1")
	public List<Category> m2() {
		return cs.getAll();
	}

	@PutMapping("/req2/{id}")
	public Category updateCategory(
			@PathVariable int id,
			@RequestBody Category category) {
		return cs.updateCategory(id, category);
	}

	@DeleteMapping("/req3/{id}")
	public String delete(@PathVariable int id) {
		cs.deleteCategory(id);
		return "category deleted";
	}
	
	
}
