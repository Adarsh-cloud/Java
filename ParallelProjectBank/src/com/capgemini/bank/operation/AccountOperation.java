package com.capgemini.bank.operation;

import com.capgemini.bank.bean.Accounts;

public interface AccountOperation {
	  void createAccount(Accounts account);
      void AccountDetail(int accountno);
      void Deposit(int accountno,long deposit);
      void Withdraw(int accountno,long withdraw);
}
