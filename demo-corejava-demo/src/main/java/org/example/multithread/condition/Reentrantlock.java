package concurrency.condition;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrantlock implements Runnable{
	String thradName;
	ReentrantLock lock;
	int counter=0;
	Reentrantlock(String thradName,ReentrantLock lock)
	{
		this.thradName=thradName;
		this.lock=lock;
	}
	@Override
	public void run() {
		try
		{
			lock.lock();
			System.out.println("current thread::"+Thread.currentThread().getName());
			counter++;
			System.out.println("current hold thread::"+lock.getHoldCount());
			methoda();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			lock.unlock();
			System.out.println("current hold in finaly count thread::"+lock.getHoldCount());
		}
		
		
	}
	public void methoda()
	{
		try
		{
			System.out.println("current in method thread::"+Thread.currentThread().getName());
			lock.lock();
			System.out.println("current in method hold count thread::"+lock.getHoldCount());
		}catch(Exception ex)
		{
		ex.printStackTrace();	
		}finally
		{
			lock.unlock();
			System.out.println("current hold in finaly method  count thread::"+lock.getHoldCount());

		}
	}

}
