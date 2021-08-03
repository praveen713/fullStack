package com.mindtree.mall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.mall.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	@Query(value="select c from Customer c where c.name like ?1%")
	public List<Customer> getCustomerDetailsByName(String name);

	//@Query(value="select c from Customer c where c.email like ?1%")
	public Customer findByEmail(String customerEmail);

}
