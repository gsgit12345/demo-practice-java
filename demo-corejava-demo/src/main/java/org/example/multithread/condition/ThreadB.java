package concurrency.condition;

public class ThreadB extends Thread {
	ResourceLock lock;
	ThreadB(ResourceLock lock)
	{
		this.lock=lock;
	}
	public void run()
	{
		try
		{
			synchronized (lock) {
				for(int i=1;i<10;i++)
				{
					if(lock.flag!=2) {
						lock.wait();
					}
					System.out.println("thread BBBBBBBBBBBB==== is executing   B");
				
					Thread.sleep(1000);
					lock.flag=3;
					lock.notifyAll();
					
				}
				
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
