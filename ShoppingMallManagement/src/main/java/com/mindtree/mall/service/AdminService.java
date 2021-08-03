package com.mindtree.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mindtree.mall.entity.Admin;
import com.mindtree.mall.entity.Customer;
import com.mindtree.mall.repository.AdminRepository;
import com.mindtree.mall.repository.CustomerRepository;
import com.mindtree.mall.repository.ProductRepository;
@Service
public class AdminService implements UserDetailsService {
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Admin admin=adminRepository.findByEmail(email);
		if(admin==null)
			throw new UsernameNotFoundException("User 404");
		return new AdminPrincipal(admin);
			
	}
	
	
	public Admin signInAdmin(Admin admin) {
		return adminRepository.save(admin);
	}


	public Admin getAdminByName(String adminName) {
		// TODO Auto-generated method stub
		return adminRepository.findByName(adminName);
	}


	public void updatePassword(Admin admin, String password) {
		admin.setPassword(password);
	}

}
