package concurrency.condition;

public class ThreadA extends Thread {
	ResourceLock lock;

	ThreadA(ResourceLock lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				for (int i = 1; i <= 10; i++) {
					if (lock.flag != 1) {
						lock.wait();
					}
					System.out.println("threadAAAAAAAAA======== is executiong  A");
					
					Thread.sleep(1000);
					lock.flag = 2;
					lock.notifyAll();
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
