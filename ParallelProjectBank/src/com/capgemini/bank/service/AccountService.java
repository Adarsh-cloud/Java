package com.capgemini.bank.service;

import com.capgemini.bank.bean.Accounts;
import com.capgemini.bank.exception.AccountNotFoundException;

public interface AccountService {
	  void createAccount(Accounts account);
      void accountDetail(int accountno) throws AccountNotFoundException;
      void deposit(int accountno,long deposit) throws AccountNotFoundException;
      void withdraw(int accountno,long withdraw) throws AccountNotFoundException;
      void fundTransfer(int senderAccountno,int BeneficiaryAccountno,long fund) throws AccountNotFoundException;
      void printTransaction(int accountno);
}
