package concurrency.condition;

import java.util.concurrent.CountDownLatch;

public class CountDownDemo {
public static void main(String str[])
{
	CountDownLatch latch=new CountDownLatch(3);
	
	Thread t1=new Thread(new CountDownWorker(latch,1000,"firstthread"),"firstthread");
	Thread t2=new Thread(new CountDownWorker(latch,2000,"secondthread"),"secondthread");
	Thread t3=new Thread(new CountDownWorker(latch,3000,"thirdthread"),"thirdthread");
	
	t1.start();
	t2.start();
	t3.start();
	try
	{
		System.out.println("ddddcurent thread stae"+Thread.currentThread().getState());
	latch.await();
	System.out.println("curent thread stae"+Thread.currentThread().getState());
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName() + 
            " has finished"); 
}
}
