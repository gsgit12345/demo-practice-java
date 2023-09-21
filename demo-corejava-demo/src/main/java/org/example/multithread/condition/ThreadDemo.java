package concurrency.condition;

public class ThreadDemo {
	 public static void main(String ar[]){
	 
	  final Thread mainThread = Thread.currentThread();
	  System.out.println("Inside Main Thread :"+mainThread.getName());
	 
	  new Thread(new Runnable() {
	 
	   @Override
	   public void run() {
	    Thread childThread= Thread.currentThread();
	    for(int i=0; i<3;i++){
	     System.out.println("Inside Child Thread :"+childThread.getName());
	     try {
	      Thread.sleep(1000);
	     } catch (InterruptedException e) {
	      e.printStackTrace();
	     }
	    }
	    System.out.println("Check Main Thread is alive :" + mainThread.isAlive());
	   }
	 
	  }).start();
	 
	  System.out.println("End of Main Thread");  
	 }
	}
