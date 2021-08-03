package com.mindtree.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.mall.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	public void deleteByName(String productName);
	
	public Product findById(int productId);

}
