package com.mindtree.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.mall.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{

	public Admin findByEmail(String customerEmail);

	public Admin findByName(String adminName);

}
