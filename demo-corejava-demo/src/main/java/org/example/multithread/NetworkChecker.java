package executerdemo.Thread;

import java.util.concurrent.CountDownLatch;

public class NetworkChecker implements Runnable{
	 CountDownLatch latch;
	 NetworkChecker(CountDownLatch latch)
	 {
	  this.latch=latch;
	 }
	 @Override
	 public void run() {
	  System.out.println("checking network");
	  try {
	   Thread.sleep(3000);
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  System.out.println("Done checking network");
	  latch.countDown();
	 }
	 

}
