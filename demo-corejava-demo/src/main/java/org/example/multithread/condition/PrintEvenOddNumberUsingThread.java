package org.example.multithread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class evenoddnum implements Runnable {
    ReentrantLock lock = new ReentrantLock();
    public Condition even = lock.newCondition();
    public Condition odd = lock.newCondition();
    int sharedResource ;

    evenoddnum(int t) {
        this.sharedResource = t;
    }
    evenoddnum()
    {
        sharedResource=0;
    }
    int max = 50;

    @Override
    public void run() {
        while (sharedResource <= max) {
            lock.lock();
            try {
                if (sharedResource % 2 == 1 && Thread.currentThread().getName().equals("even")) {
                    System.out.println("this is the odd number:" + Thread.currentThread().getName() + ":oddnum:" + sharedResource);
                    even.await();
                } else if (sharedResource % 2 == 0 && Thread.currentThread().getName().equals("odd")) {
                    System.out.println("this is the even number:" + Thread.currentThread().getName() + ":even:" + sharedResource);
                    odd.await();
                } else {
                   System.out.println(Thread.currentThread().getName() + " Thread " + sharedResource);

                }
                sharedResource += 1;

                if (sharedResource % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                    even.signal();
                } else if(sharedResource % 2 == 1 && Thread.currentThread().getName().equals("odd")){
                    odd.signal();
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }
}

public class PrintEvenOddNumberUsingThread {
    public static void main(String str[]) {
        evenoddnum obj=  new evenoddnum(2);
        Thread even = new Thread(obj,"even");
        Thread odd = new Thread(obj,"odd");
        even.start();
        odd.start();


    }
}
