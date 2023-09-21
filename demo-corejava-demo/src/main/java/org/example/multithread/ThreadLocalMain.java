package executerdemo.Thread;

 class ThreadLocalRunnable implements Runnable {
	 
    // ThreadLocal of Integer type
    private ThreadLocal<Integer> tl = new ThreadLocal<Integer>();
 
    @Override
    public void run() {
        tl.set( (int) (Math.random() * 10) );
 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
 
        System.out.println(Thread.currentThread().getName()+":"+tl.get());
    }
}
 

public class ThreadLocalMain {
	 
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalRunnable tl = new ThreadLocalRunnable();
 
        Thread t1 = new Thread(tl,"Thread1");
        Thread t2 = new Thread(tl,"Thread2");
 
        t1.start();
        t2.start();
 
        t1.join();
        t2.join();
    }
}
