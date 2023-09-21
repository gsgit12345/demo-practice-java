package executerdemo.Thread;

class MyThread extends Thread { 
	  //don't override run() method 
	} 
	public class DontOverrideRun { 
	  public static void main(String[] args) { 
	         System.out.println("Started Main."); 
	         MyThread thread1=new MyThread(); 
	      thread1.start(); 
	         System.out.println("Ended Main."); 
	  } 
	} 
