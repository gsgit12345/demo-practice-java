package concurrency.condition;

public class ThreeThreadProgram implements Runnable {

	public Object monitor = new Object();
	  private static int i = 1;
	public boolean first = true;
	public boolean second = false;
	public boolean third = false;


	 @Override
	  public void run() {
	    try {
	   while (true) {
	        synchronized (monitor) {
	          String Tname = Thread.currentThread().getName();
	          if (first && Tname.equalsIgnoreCase("T1")) {
	            print();
	            first = false;
	            second = true;
	            monitor.notifyAll();
	            monitor.wait();
	          } else if (second && Tname.equalsIgnoreCase("T2")) {
	            print();
	            second = false;
	            third = true;
	            monitor.notifyAll();
	            monitor.wait();
	          } else if (third && Tname.equalsIgnoreCase("T3")) {
	            print();
	            third = false;
	            first = true;
	            monitor.notifyAll();
	            monitor.wait();
	          } else {
	            monitor.wait();
	          }
	        }
	        Thread.sleep(1000);
	 }
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

	  public  void print() {
		String name=  Thread.currentThread().getName();
		System.out.println("thread name:"+name);
		if(name.equalsIgnoreCase("t1"))
		{
			if(ThreeThreadProgram.i++%2==0)
			{
			    System.out.println(Thread.currentThread().getName() + " even  - "  );

			}
			else if(name.equalsIgnoreCase("t2"))
			{
			    System.out.println(Thread.currentThread().getName() + " odd  - " );

			}
			else
			{
			    System.out.println(Thread.currentThread().getName() + " common  - " + ThreeThreadProgram.i++);

			}
		}
	  }
}
