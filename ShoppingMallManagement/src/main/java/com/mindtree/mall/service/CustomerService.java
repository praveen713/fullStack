package com.mindtree.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mindtree.mall.entity.Customer;
import com.mindtree.mall.repository.CustomerRepository;
import com.mindtree.mall.repository.ProductRepository;
import com.mindtree.mall.repository.PurchaseRepository;
@Service
public class CustomerService implements UserDetailsService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private PurchaseRepository purchaseRepository;

	@Override
	public UserDetails loadUserByUsername(String customerEmail) throws UsernameNotFoundException {
		Customer customer=customerRepository.findByEmail(customerEmail);
		if(customer==null)
			throw new UsernameNotFoundException("User 404");
		return new CustomerPrincipal(customer);
			
	}
	
	
	public Customer signInCustomer(Customer customer) {
		return customerRepository.save(customer);
	}


	public List<Customer> getAllcustomers() {
		return customerRepository.findAll();
	}


	public List<Customer> getCustomerByName(String name) {
		return customerRepository.getCustomerDetailsByName(name);
	}


	public int getIdByEmail(String email) {
		
		Customer customer=customerRepository.findByEmail(email);
		System.out.println(customer.getCustomerId());
		return customer.getCustomerId();
	}

}
