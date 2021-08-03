package com.mindtree.mall.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String date;
	@ManyToOne(targetEntity = Product.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product products;
	@ManyToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customers;

	public Purchase() {
		super();
	}

	public Purchase(String date, Product products, Customer customers) {
		super();
		this.date = date;
		this.products = products;
		this.customers = customers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Purchase(int id, String date, Product products, Customer customers) {
		super();
		this.id = id;
		this.date = date;
		this.products = products;
		this.customers = customers;
	}

}
