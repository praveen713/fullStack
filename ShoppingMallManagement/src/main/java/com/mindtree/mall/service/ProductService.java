package com.mindtree.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.mall.entity.Product;
import com.mindtree.mall.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;


	public List<Product> getAllProducts() {
		
		return repository.findAll();
	}

	
	public Product updatePrice(Product product, double price) {
		product.setPrice(price);
		return repository.save(product);
		
	}

	public void deleteProduct(String productName) {
	   repository.deleteByName(productName);
		
	}

	public void insertProducts(Product products) {
		repository.save(products);
		
	}


	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return repository.findById(productId);
	}


	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		 repository.deleteById(productId);
	}
}
