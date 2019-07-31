package project.bank;

import java.util.HashMap;

public class AccountOperationImpl implements AccountOperation{
	
	HashMap<Integer, Accounts> hash=new HashMap<Integer,Accounts>();

	@Override
	public void createAccount(Accounts account) {
		hash.put(account.getAccountNo(), account);
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
	}
}
