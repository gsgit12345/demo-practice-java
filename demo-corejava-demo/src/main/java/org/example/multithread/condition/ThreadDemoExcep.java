package concurrency.condition;

public class ThreadDemoExcep {
	public static void main(String[] args) {
		   
		  Thread t1 = new Thread(new Runnable() {
		   @Override
		   public void run() {
		    throw new RuntimeException("Thread Exception Example");
		   }
		  });
		  t1.start();
		   
		  while(true){
		   System.out.println("ThreadDemo.main()");
		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		  }
		 }
}
