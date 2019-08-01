package capgemini.threads;

public class InterThreadComm {

	public static void main(String[] args) {
		System.out.println("InterThread->Started...");
		Account account=new Account();
		new Thread(){
			public void run(){
				account.withdraw(15000);
			}
		}.start();
		new Thread(){
			public void run(){
				account.deposit(10000);
			}
		}.start();
		System.out.println("InterThreadComm->Ended");
	}
	

}
class Account{
	int amount=10000;

	synchronized void withdraw(int amount) {
		if(this.amount<amount){
			System.out.println("Less Balance;Waiting for deposit....");
			try{
				wait();
			} catch(Exception e){}
		}
		this.amount-=amount;;
		System.out.println("Withdraw completed....");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("Deposit complected...");
		notify();
	}
}
