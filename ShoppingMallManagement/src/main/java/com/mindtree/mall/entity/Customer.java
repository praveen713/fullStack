package com.mindtree.mall.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int customerId;
private String name;
@Column(unique=true)
private String email;
private String password;
private String address;
@OneToMany(mappedBy = "customers")
private List <Purchase> purchaseDetails=new ArrayList();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public List<Purchase> getPurchaseDetails() {
	return purchaseDetails;
}
public void setPurchaseDetails(List<Purchase> purchaseDetails) {
	this.purchaseDetails = purchaseDetails;
}
public Customer(int id, String name, String email, String password) {
	super();
	this.customerId = id;
	this.name = name;
	this.email = email;
	this.password = password;
}
public Customer(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public Customer(int id, String name, String email, String password, String address) {
	super();
	this.customerId = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.address = address;
}
public Customer(int customerId, String name, String email, String password, String address,
		List<Purchase> purchaseDetails) {
	super();
	this.customerId = customerId;
	this.name = name;
	this.email = email;
	this.password = password;
	this.address = address;
	this.purchaseDetails = purchaseDetails;
}

public Customer(int customerId) {
	super();
	this.customerId = customerId;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


}
