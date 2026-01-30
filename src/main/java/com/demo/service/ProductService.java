package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	Product addProduct(Product product,int categoryId);
	
	List<Product> findAll();
	
	Product updateProduct(int productId, Product product);
	
	void deleteProduct(int productId);
}
