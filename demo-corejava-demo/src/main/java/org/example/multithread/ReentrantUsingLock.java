package executerdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantUsingLock {
	Lock l=new ReentrantLock();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantUsingLock lo=new ReentrantUsingLock();
		lo.outerDemo();
	}
public void outerDemo()
{
	l.lock();
	
	System.out.println("in outer method");
	inner();
	l.unlock();
}

public  synchronized void inner()
{
	l.lock();
	System.out.println("in inner method");
	
	l.unlock();
}
}
