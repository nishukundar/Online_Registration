package com.webapp_practice4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
	@Table(name="registration")
	public class RegistrationEntity {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="name", nullable=false, length=100)
	private String name;

	@Column(name="email", nullable=false, unique=true, length=255)
	private String email;

	@Column(name="mobile", nullable=false, unique=true, length=10)
	private String mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name){
	this.name=name;
	}

	public String getName(){
	return name;
	}

	public void setEmail(String email){
	this.email=email;
	}


	public String getEmail(){
	return email;
	}

	public void setMobile(String mobile){
	this.mobile=mobile;
	}

	public String getMobile(){
	return mobile;
	}
	
}
