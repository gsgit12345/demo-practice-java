package concurrency.condition;

import java.util.ArrayList;

public class WaitNotifyDemo {

	public static void main(String[] args) {
	ArrayList array=new ArrayList();
	int size=1;
		Thread t1=new Thread(new Producer(array, size), "ProducerThread");
		Thread t2=new Thread(new consumer(array), "ConsumerThread");
		t1.start();
		t2.start();
	}

}
