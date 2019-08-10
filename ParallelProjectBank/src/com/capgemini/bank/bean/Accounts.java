package com.capgemini.bank.bean;

import java.io.Serializable;
import java.util.Scanner;

public class Accounts implements Serializable {
	private int accountNo;
	private String Name;
	private long openBalance;
	private long currentBalance;
	public static int COUNT = 100;

	Customers customer=new Customers();
	Address address=new Address();
	public Accounts() {

	}

	public Accounts(String name, long openBalance, long currentBalance) {
		super();
		COUNT++;
		setAccountNo(COUNT);
		setName(name);
		setOpenBalance(openBalance);
		setCurrentBalance(currentBalance);
	}
	public void info(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		customer.setAge(scan.nextInt());
		System.out.println("Enter Your Gender: ");
		customer.setGender(scan.next());
		System.out.println("Select your accout type:\n1.Savings \n2.Current\n");
		customer.setAccountType(scan.next());
		System.out.println("Enter your DoorNo: ");
		address.setDoorNo(scan.next());
		System.out.println("Enter your Street: ");
		address.setStreet(scan.next());
		System.out.println("Enter your Area: ");
		address.setArea(scan.next());
		System.out.println("Enter your City: ");
		address.setCity(scan.next());	
	}

	public int getAccountNo() {

		return accountNo;
	}

	public String getName() {
		return Name;
	}

	public long getOpenBalance() {
		return openBalance;
	}

	public long getCurrentBalance() {
		return currentBalance;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setOpenBalance(long openBalance2) {
		this.openBalance = openBalance2;
	}

	public void setCurrentBalance(long currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "AccountNo= " + accountNo + ", \nName= " + Name + ", \nOpenBalance= " + openBalance
				+ ", \nCurrentBalance= " + currentBalance+customer.toString()+address.toString();
	}
}