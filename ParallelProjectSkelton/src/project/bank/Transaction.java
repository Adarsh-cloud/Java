package project.bank;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private long amount;
	private String transDescription;
	public Transaction(){
		super();
	}
	public Transaction(long amount,String transDescription){
		super();
		setAmount(amount);
		setTransDescription(transDescription);
	}
	public void setAmount(long amount){
		this.amount=amount;
	}
	public void setTransDescription(String trans){
		transDescription=trans;
	}
	public long getAmount(){
		return amount;
		
	}
	public String getTransDescription(){
		return transDescription;
	}
	public List<String> setTransaction(long amt,String desc){
		List<String>transaction=new ArrayList<String>();
		transaction.add("Amount: "+amt+"is"+desc);
		return transaction;
	}
}
