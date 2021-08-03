package com.mindtree.mall.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String password;
@Column(unique=true)
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Admin(int id, String name, String password, String email) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.email = email;
}
public Admin(String password, String email) {
	super();
	this.password = password;
	this.email = email;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}


}
