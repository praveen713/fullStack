package com.mindtree.mall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.mall.entity.Purchase;
@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Integer>{
  
	@Query(value="call purchaseList()", nativeQuery = true)
	public List<Purchase> findAll();
}
