package concurrency.condition;

import java.util.concurrent.locks.ReentrantLock;

public class rentrantdemo {

	public static void main(String[] args) {
	ReentrantLock lock=new ReentrantLock();
	Thread t1=new Thread(new Reentrantlock("thread1",lock)); 
	Thread t2=new Thread(new Reentrantlock("thread2",lock)); 
	Thread t3=new Thread(new Reentrantlock("thread3",lock)); 
	t1.start();
	t2.start();
	t3.start();
	}

}
