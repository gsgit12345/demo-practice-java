package concurrency.condition;

public class PrintSequenceRunnable implements Runnable{
	 
	public int PRINT_NUMBERS_UPTO=20;
	static int  number=1;
	int remainder;
	static Object lock=new Object();
 
	PrintSequenceRunnable(int remainder)
	{
		this.remainder=remainder;
	}
 
	@Override
	public void run() {
		try {
	
	
		while (number < PRINT_NUMBERS_UPTO-1) {
			synchronized (lock) {
				while (number % 3 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
			Thread.sleep(1000);
		}
	
	
		
	}catch(Exception ex)
		{
		ex.printStackTrace();
		}
	}
}
