package concurrency.condition;

public class Account {
	 public static  int INITIAL_BALANCE;
	 public int balance=0;
	 
	 public int withdraw(int amount)
	 {
		 return INITIAL_BALANCE-amount;
	 }
	 
	 public int deposit(int amount)
	 {
		 return INITIAL_BALANCE+amount;
	 }
	 public int getBalance() {
		return INITIAL_BALANCE;
	}
	public void setBalance(int balance) {
		this.balance = INITIAL_BALANCE;
	}
	public Account(int INITIAL_BALANCE)
	 {
		 this.INITIAL_BALANCE=INITIAL_BALANCE;
	 }
}
