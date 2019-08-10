package com.capgemini.bank.bean;

import java.io.Serializable;

public class Customers implements Serializable {
	
	private String accountType;
	private int age;
	private String gender;
	
	public Customers(){
		super();
	}
	public Customers(String accountType,int age,String gender){
		super();
		setAccountType(accountType);
		setAge(age);
		setGender(gender);
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAccountType() {
		return accountType;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString(){
		return "\nAge: "+age+"\nAccount Type: "+accountType+"\nGender: "+gender;
	}
}
