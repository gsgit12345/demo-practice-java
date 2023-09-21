package executerdemo.Thread;

public class CustomBlockingQueueMain {
	 
    public static void main(String[] args) {
        CustomBlockingQueue customBlockingQueue = new CustomBlockingQueue();
        // Creating producer and consumer threads
        Thread producer = new Thread(new Producer(customBlockingQueue));
        Thread consumer = new Thread(new Consumer(customBlockingQueue));
 
        producer.start();
        consumer.start();
    }
}
 
class Producer implements Runnable {
 
    private CustomBlockingQueue cbq;
 
    public Producer(CustomBlockingQueue cbq){
        this.cbq = cbq;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                cbq.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
}
 
class Consumer implements Runnable {
    private CustomBlockingQueue cbq;
 
    public Consumer(CustomBlockingQueue cbq){
        this.cbq = cbq;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                cbq.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
}
