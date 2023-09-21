package concurrency.condition;

class SequenceDisplayImpl implements Runnable {

	  int threadId;
	  static Object monitor = new Object();

	  static boolean one = true;
	  static boolean two = false;
	  static boolean three = false;
	  SequenceDisplayImpl(int threadId) {
	   this.threadId = threadId;
	  }

	  public void run() {
	   print();
	  }

	  private void print() {
	   try {
	    while (true) {
	     Thread.sleep(500);
	     synchronized (monitor) {
	      if (1 == threadId) {
	       if (!one) {
	        monitor.wait();
	       } else {
	        System.out.print(threadId + " ");
	        one = false;
	        two = true;
	        three = false;
	        monitor.notifyAll();
	       }
	      }
	      if (2 == threadId) {
	       if (!two) {
	        monitor.wait();
	       } else {
	        System.out.print(threadId + " ");
	        one = true;
	        two = false;
	       // three = true;
	        monitor.notifyAll();
	       }
	      }
	     /* if (3 == threadId) {
	       if (!three) {
	        monitor.wait();
	       } else {
	        System.out.print(threadId + " ");
	        one = true;
	        two = false;
	        three = false;
	        monitor.notifyAll();
	       }
	      }*/
	     }
	    }
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }

	  }

	 }

