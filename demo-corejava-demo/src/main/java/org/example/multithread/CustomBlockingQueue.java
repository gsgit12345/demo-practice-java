package executerdemo.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueue
{
	final Lock lock=new ReentrantLock();
    // Conditions
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
 
    // Array to store element for CustomBlockingQueue
    
    
    final Object[] arr=new Object[3];
    int putIndex, takeIndex;
    int count;
 
    public void put(Object x) throws InterruptedException {
 
    	lock.lock();
    	
        try {
            while (count == arr.length){
                // Queue is full, producers need to wait
                notFull.await();
            }
 
            arr[putIndex] = x;
            System.out.println("Putting in Queue - " + x);
            putIndex++;
            if (putIndex == arr.length){
                putIndex = 0;
    }
            // Increment the count for the array
            ++count;
            // Send signal to consumer
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }
 
    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0){
                // Queue is empty, consumers need to wait
                notEmpty.await();
            }
            Object x = arr[takeIndex];
            System.out.println("Taking from queue - " + x);
            takeIndex++;
            if (takeIndex == arr.length){
                takeIndex = 0;
            }
            // reduce the count for the array
            --count;
            // send signal producer
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }
}
 


