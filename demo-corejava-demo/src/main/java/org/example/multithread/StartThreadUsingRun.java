package executerdemo.Thread;

class CustomThread extends Thread {
	 
	 public void run() {
	  for (int i = 0; i < 5; i++) {
	   try {
	    Thread.sleep(300);
	   } catch (InterruptedException e) {
	 
	    e.printStackTrace();
	   }
	   System.out.println("Thread is running :"+i);
	  }
	 
	 }
	 
	}
	 
	public class StartThreadUsingRun {
	 
	 public static void main(String[] args) {
	  CustomThread ct1 = new CustomThread();
	  CustomThread ct2 = new CustomThread();
	  ct1.run();
	  ct2.run();
	 
	 }
	 
	}
