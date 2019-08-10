package com.capgemini.bank.bean;

import java.io.Serializable;

public class Address implements Serializable{
	private String doorNo;
	private String street;
	private String area;
	private String city;
	public Address() {
		super();
	}
	public Address(String doorNo, String street, String area, String city) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nDoorNo=" + doorNo + "\n Street=" + street + "\n Area=" + area + "\n City=" + city;
	}
	
}
