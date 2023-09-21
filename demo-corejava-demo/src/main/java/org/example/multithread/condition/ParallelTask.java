package concurrency.condition;

public class ParallelTask implements Runnable {
	private Thread predecessor;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		if (predecessor != null) {
			try {
				predecessor.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " Finished");
	}

	public void setPredecessor(Thread t) {
		this.predecessor = t;
	}
}
