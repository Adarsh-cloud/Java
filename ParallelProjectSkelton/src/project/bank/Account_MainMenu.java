package project.bank;

import java.util.*;

public class Account_MainMenu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice=0;
		AccountOperationImpl accountoperation=new AccountOperationImpl();
		do{
			System.out.println("....Welcome to Bank...");
			System.out.println("1.Create Account");
			System.out.println("2.Account Details");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Fund Transfer");
			System.out.println("6.Print Transactions");
			System.out.println("Enter Your Choice");
			choice=scan.nextInt();
		switch(choice){
		case 1:{
			System.out.println("Enter Your Name: ");
			String name=scan.next();
			System.out.println("Enter Your Account Number: ");
			int accountNo=scan.nextInt();
			System.out.println("Enter the Opening Balance: ");
			long openBalance=scan.nextLong();
			long currentBalance=openBalance;
			Accounts account=new Accounts(accountNo, name, openBalance, currentBalance);
			accountoperation.createAccount(account);
			break;
		}
		case 2:{
			System.out.println("Enter the Account no: ");
			int acc=scan.nextInt();
			accountoperation.AccountDetail(acc);
			break;
		}
		case 3:{
			System.out.println("Enter the Account no: ");
			int acc=scan.nextInt();
			System.out.println("Enter the amount to deposit...");
			long deposit=scan.nextLong();
			accountoperation.Deposit(acc,deposit);
			break;
		}
		case 4:{
			System.out.println("Enter the Account no: ");
			int acc=scan.nextInt();
			System.out.println("Enter the amount to withdraw...");
			long withdraw=scan.nextLong();
			accountoperation.Withdraw(acc,withdraw);
			break;
		}
		case 5:{
			System.out.println("Enter the From Account: ");
			int sender=scan.nextInt();
			System.out.println("Enter the Benificiary Account: ");
			int to=scan.nextInt();
			System.out.println("Enter the Amount to be transferred: ");
			long fund=scan.nextLong();
			accountoperation.fundTransfer(sender, to, fund);
			break;
		}
		case 6:{
			System.out.println("Enter the From Account: ");
			int account=scan.nextInt();
			accountoperation.printTransaction(account);
			break;
		}
		}
		}while(choice<=7);
		scan.close();
	}

}
