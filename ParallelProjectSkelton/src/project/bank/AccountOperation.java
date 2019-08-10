package project.bank;

public interface AccountOperation {
	  void createAccount(Accounts account);
      void AccountDetail(int accountno);
      void Deposit(int accountno,long deposit);
      void Withdraw(int accountno,long withdraw);
      void fundTransfer(int senderAccountno,int BeneficiaryAccountno,long fund);
      void printTransaction(int accountno);
}
