package concurrency.condition;

public class ThreadC  extends Thread{
	
	ResourceLock lock;
	public ThreadC(ResourceLock lock)
	{
	this.lock=lock;	
	}
	public void run()
	{
		try
		{
		synchronized (lock) {
			
			for(int i=0;i<10;i++)
			{
				if(lock.flag!=3)
				{
					lock.wait();
				}
				System.out.println("thread ccccccccccccc========== is  C");
			
				Thread.sleep(1000);
				lock.flag=1;
				lock.notifyAll();
			}
			
		}	
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
