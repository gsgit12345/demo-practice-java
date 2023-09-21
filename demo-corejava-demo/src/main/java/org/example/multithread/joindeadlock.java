package executerdemo;

class AThread extends Thread {

	public void run() {
		System.out.println("T2 started");
		synchronized (joindeadlock.lock)

		{

			System.out.println("Hi hello");

		}
	}
}
	
public class joindeadlock implements Runnable {
	public static final String lock = "lock";
	public static final String lock1 = "lock1";
	static joindeadlock t = new joindeadlock();
	static Thread T1 = new Thread(t, "Thread T1");
	static AThread T2 = new AThread();

	public static void main(String[] args) {
		T1.start();
		Thread.yield();
		T2.start();
	}

	public void run() {
		synchronized (lock)

		{
			System.out.println("T1 started");
			try {
				System.out.println("waiting for T2 to join");
				T2.join();
			} catch (InterruptedException e) {
				System.out.println("e.getMessage() = " + e.getMessage());
			}
			System.out.println("T1 ended");
		}
	}
}
