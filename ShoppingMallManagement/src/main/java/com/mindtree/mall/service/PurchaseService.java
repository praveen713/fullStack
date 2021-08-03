package com.mindtree.mall.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.mall.entity.Customer;
import com.mindtree.mall.entity.Product;
import com.mindtree.mall.entity.Purchase;
import com.mindtree.mall.repository.PurchaseRepository;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepository purchaseRepository;

	public List<Purchase> getAllProducts() {
		// TODO Auto-generated method stub
		return purchaseRepository.findAll();
	}

	public Purchase addPurchaseDetails(int customerId, int productId) {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//		   LocalDateTime now = LocalDateTime.now(); 
//		   String date=dtf.format(now)+"";
//		   System.out.println(dtf.format(now));
//		Purchase purchase=new Purchase(date,new Product(productId),new Customer(customerId));
//		purchaseRepo.save(purchase);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   String date=dtf.format(now);
		Purchase purchase=new Purchase(date,new Product(productId),new Customer(customerId));
		return purchaseRepository.save(purchase);
	}

}
