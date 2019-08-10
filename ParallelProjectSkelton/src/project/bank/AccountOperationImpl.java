package project.bank;

import java.util.HashMap;
import java.util.List;

public class AccountOperationImpl implements AccountOperation{
	
	HashMap<Integer, Accounts> hash=new HashMap<Integer,Accounts>();
	HashMap<Integer, List<String>>trans=new HashMap<Integer, List<String>>();
	Transaction t=new Transaction();

	@Override
	public void createAccount(Accounts account) {
		hash.put(account.getAccountNo(), account);
		trans.put(account.getAccountNo(), t.setTransaction(account.getOpenBalance(), "Credited to your account"));
	}

	@Override
	public void AccountDetail(int accountno) {
		System.out.println(hash.get(accountno));	
	}

	@Override
	public void Deposit(int accountno,long deposit) {
		long temp=hash.get(accountno).getCurrentBalance();
		temp+=deposit;
		hash.get(accountno).setCurrentBalance(temp);
		List<String>tempo=trans.get(accountno);
		tempo.add(deposit+"is Credited to your account");
		trans.put(accountno,tempo);
	}

	@Override
	public void Withdraw(int accountno, long withdraw) {
		long temp=hash.get(accountno).getCurrentBalance();
		temp-=withdraw;
		hash.get(accountno).setCurrentBalance(temp);
		List<String>tempo=trans.get(accountno);
		tempo.add(withdraw+"is debited from your account");
		trans.put(accountno,tempo);
	}

	@Override
	public void fundTransfer(int senderAccountno, int BeneficiaryAccountno,long fund) {
		Withdraw(senderAccountno,fund);
		Deposit(BeneficiaryAccountno, fund);
	}

	@Override
	public void printTransaction(int accountno) {
		System.out.println(trans.get(accountno));
	}
}
