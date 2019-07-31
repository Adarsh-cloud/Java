package project.bank;

public class Accounts {
	private int accountNo;
	private String Name;
	private long openBalance;
	private long currentBalance;
	//private static int COUNT=100000;
	public Accounts(int accountNo, String name, long openBalance, long currentBalance) {
		super();
		setAccountNo(accountNo);
		setName(name);
		setOpenBalance(openBalance);
		setCurrentBalance(currentBalance);
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return Name;
	}
	public long getOpenBalance() {
		return openBalance;
	}
	public long getCurrentBalance() {
		return currentBalance;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
		/*accountNo=COUNT;
		COUNT++;*/
	}
	public void setName(String name) {
		Name = name;
	}
	public void setOpenBalance(long openBalance2) {
		this.openBalance = openBalance2;
	}
	public void setCurrentBalance(long currentBalance) {
		this.currentBalance = currentBalance;
	}
	@Override
	public String toString() {
		return "Accounts [accountNo=" + accountNo + ", Name=" + Name + ", openBalance=" + openBalance
				+ ", currentBalance=" + currentBalance + "]";
	}
	
}
