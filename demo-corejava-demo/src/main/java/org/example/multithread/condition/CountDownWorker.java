package concurrency.condition;

import java.util.concurrent.CountDownLatch;

public class CountDownWorker implements Runnable {

	public CountDownLatch latch;
	int delay;
	String name;
	CountDownWorker(CountDownLatch latch,int delay,String name)
	{
	//Thread.currentThread().setName(name);
		this.latch=latch;
		this.delay=delay;
		this.name=name;
	}
	@Override
	public void run() {
	
		try
		{
			 Thread.sleep(delay); 
			latch.countDown();
			System.out.println("in run method:"+Thread.currentThread().getName());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
