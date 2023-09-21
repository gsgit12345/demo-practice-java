package executerdemo.Thread;

import java.util.concurrent.CountDownLatch;

public class DatabaseInitialization implements Runnable {
	 CountDownLatch latch;
	 DatabaseInitialization(CountDownLatch latch)
	 {
	  this.latch=latch;
	 }
	 @Override
	 public void run() {
	  System.out.println("Initializing Database");
	  try {
	   Thread.sleep(5000);
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  System.out.println("Done with database Initialization");
	  latch.countDown();
	 }

}
