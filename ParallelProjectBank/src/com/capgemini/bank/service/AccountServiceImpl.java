package com.capgemini.bank.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

import com.capgemini.bank.bean.Accounts;
import com.capgemini.bank.bean.Transaction;
import com.capgemini.bank.exception.AccountNotFoundException;

public class AccountServiceImpl implements AccountService {

	HashMap<Integer, Accounts> hash = new HashMap<Integer, Accounts>();
	HashMap<Integer, List<String>> trans = new HashMap<Integer, List<String>>();
	Transaction t = new Transaction();

	public void hashstream() {
		try (ObjectOutputStream obj1 = new ObjectOutputStream(new FileOutputStream(
				"C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Accounts.txt"))) {
			obj1.writeObject(hash);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void streamtrans() {

		try (ObjectOutputStream obj2 = new ObjectOutputStream(new FileOutputStream(
				"C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Transactions.txt"))) {
			obj2.writeObject(trans);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void createAccount(Accounts account) {
		hash.put(account.getAccountNo(), account);
		hashstream();
		trans.put(account.getAccountNo(),
				t.setTransaction(account.getOpenBalance(), " your opening account balance \n"));
		streamtrans();
		System.out.println("Your Account no is: " + hash.get(account.getAccountNo()).getAccountNo());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void accountDetail(int accountno) throws AccountNotFoundException {
		try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(new File(
				"C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Accounts.txt")));) {
			hash = ((HashMap<Integer, Accounts>) obj.readObject());
			if (hash.containsKey(accountno)) {
				System.out.println(hash.get(accountno));
			} else {
				throw new AccountNotFoundException();
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(int accountno, long deposit) throws AccountNotFoundException {
		if (hash.containsKey(accountno)) {
			long temp = hash.get(accountno).getCurrentBalance();
			temp += deposit;
			hash.get(accountno).setCurrentBalance(temp);
			hashstream();
			List<String> tempo = trans.get(accountno);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm a");
			tempo.add(deposit + " is Credited to your account at " + formatter.format(LocalDateTime.now()) + "\n");
			trans.put(accountno, tempo);
			streamtrans();
		} else {
			throw new AccountNotFoundException();
		}
	}

	@Override
	public void withdraw(int accountno, long withdraw) throws AccountNotFoundException{
		if (hash.containsKey(accountno)) {
			if (hash.get(accountno).getCurrentBalance() < withdraw) {
				System.out.println("Insufficient balance");
			} else {
				long temp = hash.get(accountno).getCurrentBalance();
				temp -= withdraw;
				hash.get(accountno).setCurrentBalance(temp);
				hashstream();
				List<String> tempo = trans.get(accountno);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm a");
				tempo.add(
						withdraw + " is debited from your account at " + formatter.format(LocalDateTime.now()) + "\n");
				trans.put(accountno, tempo);
				streamtrans();
			}
		} else {
			throw new AccountNotFoundException();
			//System.out.println("Enter a valid Account no");
		}

	}

	@Override
	public void fundTransfer(int senderAccountno, int BeneficiaryAccountno, long fund) throws AccountNotFoundException {
		withdraw(senderAccountno, fund);
		deposit(BeneficiaryAccountno, fund);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void printTransaction(int accountno) {
		try (ObjectInputStream obj3 = new ObjectInputStream(new FileInputStream(new File(
				"C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Transactions.txt")));) {
			trans = ((HashMap<Integer, List<String>>) obj3.readObject());
			System.out.println(trans.get(accountno));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void showBalance(int acc) throws AccountNotFoundException {
		try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(new File(
				"C:\\Users\\shakthk\\Desktop\\capgemini\\Eclipse Workspace\\ParallelProjectBank\\Accounts.txt")));) {
			hash = ((HashMap<Integer, Accounts>) obj.readObject());
			if (hash.containsKey(acc)) {
				System.out.println("Current Balance"+hash.get(acc).getCurrentBalance());
			} else {
				throw new AccountNotFoundException();
				//System.out.println("Enter a vaild Account no:");
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
