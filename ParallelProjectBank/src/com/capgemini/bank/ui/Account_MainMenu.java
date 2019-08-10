package com.capgemini.bank.ui;

import java.util.*;

import com.capgemini.bank.bean.Accounts;
import com.capgemini.bank.exception.AccountNotFoundException;
import com.capgemini.bank.service.AccountServiceImpl;

public class Account_MainMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		AccountServiceImpl accountservice = new AccountServiceImpl();
		do {
			System.out.println("....Welcome to Bank...");
			System.out.println("1.Create Account");
			System.out.println("2.Account Details");
			System.out.println("3.Show Balance");
			System.out.println("4.Deposit");
			System.out.println("5.Withdraw");
			System.out.println("6.Fund Transfer");
			System.out.println("7.Print Transactions");
			System.out.println("Enter Your Choice");
			try{
			choice = scan.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Your Name: ");
				String name = scan.next();
				System.out.println("Enter the Opening Balance: ");
				long openBalance = scan.nextLong();
				long currentBalance = openBalance;
				Accounts account = new Accounts(name, openBalance, currentBalance);
				account.info();
				accountservice.createAccount(account);
				System.out.println("Account Created successfully..");
				break;
			}
			case 2: {
				System.out.println("Enter the Account No: ");
				int acc = scan.nextInt();
				accountservice.accountDetail(acc);
				break;
			}
			case 3:{
				System.out.println("Enter the Account No: ");
				int acc = scan.nextInt();
				accountservice.showBalance(acc);
				break;
			}
			case 4: {
				System.out.println("Enter the Account no: ");
				int acc = scan.nextInt();
				System.out.println("Enter the Amount to deposit...");
				long deposit = scan.nextLong();
				accountservice.deposit(acc, deposit);
				System.out.println("Amount deposited successfully");
				break;
			}
			case 5: {
				System.out.println("Enter the Account no: ");
				int acc = scan.nextInt();
				System.out.println("Enter the Amount to withdraw...");
				long withdraw = scan.nextLong();
				accountservice.withdraw(acc, withdraw);
				System.out.println("Amount withdrawn successfully.....");
				break;
			}
			case 6: {
				System.out.println("Enter the From Account No: ");
				int sender = scan.nextInt();
				System.out.println("Enter the Benificiary Account No: ");
				int to = scan.nextInt();
				System.out.println("Enter the Amount to be transferred: ");
				long fund = scan.nextLong();
				accountservice.fundTransfer(sender, to, fund);
				System.out.println("Fund Transfer is successfully complected...");
				break;
			}
			case 7: {
				System.out.println("Enter the Account No: ");
				int account = scan.nextInt();
				accountservice.printTransaction(account);
				break;
			}
			}
			}catch(InputMismatchException | AccountNotFoundException e){
				System.err.println("Enter a vaild input...");				
			}
			System.out.println("\nTo get back to Main menu...  Type yes");
		} while (scan.next().equals("yes"));
		scan.close();
	}
}
