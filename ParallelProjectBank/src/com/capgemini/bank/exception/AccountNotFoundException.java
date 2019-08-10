package com.capgemini.bank.exception;

public class AccountNotFoundException extends Exception {
	@Override
	public String getMessage(){
		return "Enter a valid Account number";
	}

}
