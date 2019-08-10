package com.capgemini.bank.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Transaction implements Serializable {
	private long amount;
	private String transDescription;

	public Transaction() {
		super();
	}

	public Transaction(long amount, String transDescription) {
		super();
		setAmount(amount);
		setTransDescription(transDescription);
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setTransDescription(String trans) {
		transDescription = trans;
	}

	public long getAmount() {
		return amount;

	}

	public String getTransDescription() {
		return transDescription;
	}

	public List<String> setTransaction(long amt, String desc) {
		List<String> transaction = new ArrayList<String>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm: a");
		transaction.add("  Amount: " + amt + " is" + desc + " from " + formatter.format(LocalDateTime.now()));
		return transaction;
	}
}
