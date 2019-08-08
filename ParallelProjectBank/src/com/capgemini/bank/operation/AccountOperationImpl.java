package com.capgemini.bank.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import com.capgemini.bank.bean.Accounts;

public class AccountOperationImpl implements AccountOperation,Serializable{
	HashMap<Integer, Accounts> hash=new HashMap<Integer,Accounts>();

	@Override
	public void createAccount(Accounts account) {
		try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Accounts.txt"))){
			hash.put(account.getAccountNo(), account);
			obj.writeObject(hash);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void AccountDetail(int accountno) {
		try(ObjectInputStream obj=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Accounts.txt")));) {
			hash=((HashMap<Integer, Accounts>) obj.readObject());
			System.out.println(hash.get(accountno));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Deposit(int accountno,long deposit) {
		long temp=hash.get(accountno).getCurrentBalance();
		temp+=deposit;
		hash.get(accountno).setCurrentBalance(temp);
	}

	@Override
	public void Withdraw(int accountno, long withdraw) {
		long temp=hash.get(accountno).getCurrentBalance();
		temp-=withdraw;
		hash.get(accountno).setCurrentBalance(temp);
	}
}
