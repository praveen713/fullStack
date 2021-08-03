package com.mindtree.mall.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String name;
	private String catagory;
	private double price;
	@OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
	private List<Purchase> purchaseDetails = new ArrayList<>();
	
	public Product()
	{
		super();
	}

	
	public Product(int productId) {
		super();
		this.productId = productId;
	}


	public int getId() {
		return productId;
	}

	public void setId(int id) {
		this.productId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public List<Purchase> getPurchaseDetails() {
		return purchaseDetails;
	}

	public void setPurchaseDetails(List<Purchase> purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

	public Product(int productId, String name, String catagory, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.catagory = catagory;
		this.price = price;
	}

	public Product(byte productId, String name, String catagory, double price, List<Purchase> purchaseDetails) {
		super();
		this.productId = productId;
		this.name = name;
		this.catagory = catagory;
		this.price = price;
		this.purchaseDetails = purchaseDetails;
	}

}
