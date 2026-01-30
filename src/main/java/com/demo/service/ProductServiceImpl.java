package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.dao.ProductDao;
import com.demo.model.*;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private CategoryDao cd;
	
	@Autowired
	private ProductDao pd;

	@Override
	public Product addProduct(Product product, int categoryId) {
		
		Category category=cd.getById(categoryId);
		product.setCategory(category);
		return pd.save(product);
	}

	@Override
	public List<Product> findAll() {
		
		return pd.findAll();
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		
		Product existing=pd.getById(productId);
		
		existing.setProductName(product.getProductName());
		existing.setProductPrice(product.getProductPrice());
		
		return pd.save(existing);
	}

	@Override
	public void deleteProduct(int productId) {
		pd.deleteById(productId);
		
	}
	
	

}
