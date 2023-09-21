package concurrency.condition;

public class SequenceThread2 implements Runnable {
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		System.out.println("t1 is running==="+name);
		if(name.equalsIgnoreCase("t1"))
		{
			
			try
			{
		Thread.currentThread().join();
		Thread.sleep(10000);
			System.out.println("t1 is running");
		
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}else if(Thread.currentThread().getName().equalsIgnoreCase("t2"))
		{
			try
			{
		Thread.currentThread().join();
		Thread.sleep(10000);
			System.out.println("t2 is running");
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else
		{
			try
			{
		Thread.currentThread().join();
		Thread.sleep(10000);
			System.out.println("t3 is running");
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}
