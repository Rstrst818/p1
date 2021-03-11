package com.cg.JH.model;

import java.io.Serializable;

import javax.persistence.Column;
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Column(name="door_no")
	private String doornumber;
	private String street;
	private String city;

	
	public Address() {
		
	}
	public Address(String doornumber, String street, String city) {
		super();
		this.doornumber = doornumber;
		this.street = street;
		this.city = city;
	}
	
	public String getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setPincode(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return String.format("Address [doornumber=%s, street=%s, city=%s]", doornumber, street, city);
	}

}