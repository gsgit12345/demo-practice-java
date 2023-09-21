package executerdemo.Thread;

class MyThread2 extends Thread  
{ 
  public void run()  
   {         
       System.out.println("Running");   
   } 
} 
class ThreadTest {
	   public static void main(String args[]) throws InterruptedException  
	        {         
	             Runnable r = new MyThread2(); // #1         
	               Thread myThread = new Thread(r); // #2         
	               myThread.start();     
	       } 
	}
