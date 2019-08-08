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
	List<String>transaction=new ArrayList<String>();
	public void setTransaction(int amt,String desc){
		transaction.add("Amount: "+amt+"is"+desc);
	}
	public List<String> getTransaction(){
		return transaction;
	}
}
