package executerdemo.Thread;

import java.util.concurrent.CountDownLatch;

public class AppHealthChecker {
	 
	 public static void main(String[] args) {
	  try {
	   CountDownLatch latch = new CountDownLatch(3);
	 
	   // Initializing three dependent thread i.e. UI, database and logging
	 
	   NetworkChecker uiInitialization = new NetworkChecker(latch);
	   Thread uiThread = new Thread(uiInitialization);
	 
	   DatabaseInitialization dataBaseInitialization = new DatabaseInitialization(latch);
	   Thread databaseThread = new Thread(dataBaseInitialization);
	 
	   LoggingInitialization loggingInitialization = new LoggingInitialization(latch);
	   Thread loggingThread = new Thread(loggingInitialization);
	 
	   uiThread.start();
	   databaseThread.start();
	   loggingThread.start();
	   // Main thread will wait until above threads get completed
	   latch.await();
	 
	   System.out.println("Initialization has been completed, main thread can proceed now");
	  } catch (InterruptedException e) {
	 
	   e.printStackTrace();
	  }
	 
	 }
	}
	 