package concurrency.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    public static final int MAX_ACCOUNT = 10;
    public static final int MAX_AMOUNT = 10;
    public static final int INITIAL_BALANCE = 100;
 
    private Account[] accounts = new Account[MAX_ACCOUNT];
 
    private Lock bankLock;
    private Condition availableFund;
 
    public Bank() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(INITIAL_BALANCE);
        }
 
        bankLock = new ReentrantLock();
        availableFund = bankLock.newCondition();
    }
 
    public void transfer(int from, int to, int amount) {
        bankLock.lock();
 
        try {
            while (accounts[from].getBalance() < amount) {
                availableFund.await();
            }
 
			accounts[from].withdraw(amount);
            accounts[to].deposit(amount);
 
            String message = "%s transfered %d from %s to %s. Total balance: %d\n";
            String threadName = Thread.currentThread().getName();
            System.out.printf(message, threadName, amount, from, to, getTotalBalance());
 
            availableFund.signalAll();
 
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }
    }
 
    public int getTotalBalance() {
 
        bankLock.lock();
 
        try {
            int total = 0;
 
            for (int i = 0; i < accounts.length; i++) {
                total += accounts[i].getBalance();
            }
 
            return total;
        } finally {
            bankLock.unlock();
        }
    }
    
    public static void main(String str[])
    {
    	int from=4;
    	int to=1;
    	int amount =13;
    	Bank b=new Bank();
    	
    	b.transfer(from, to, amount);
    	System.out.println(b.getTotalBalance());
    }
}