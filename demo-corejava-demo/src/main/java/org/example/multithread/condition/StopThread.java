package concurrency.condition;

import java.util.concurrent.TimeUnit;

public class StopThread implements Runnable {
public volatile boolean  exit=false;

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new StopThread(),"firstThread");
		Thread t1=new Thread(new StopThread(),"secThread");
		Thread t2=new Thread(new StopThread(),"thirdThread");
		Thread t3=new Thread(new StopThread(),"fourthThread");
		Thread t4=new Thread(new StopThread(),"fifthThread");
		Thread t5=new Thread(new StopThread(),"sixtThread");
		Thread t6=new Thread(new StopThread(),"sevenThread");
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		new StopThread().stop2(true);
		TimeUnit.MILLISECONDS.sleep(200);
		t5.start();
		t6.start();
		
	}

	@Override
	public void run() {
		if(!exit)
		{
			System.out.println("current thread in run::"+Thread.currentThread().getName());
		}
		  System.out.println("Server is stopped....");
	}
	public void stop2(boolean indicator)
	{
		exit=indicator;	
	}
}
