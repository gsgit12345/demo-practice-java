package org.example.multithread;

import java.text.SimpleDateFormat;

class ThreadLocalRunnable implements Runnable {

    // ThreadLocal of Integer type
   // private ThreadLocal<Integer> tl = new ThreadLocal<Integer>();

    private ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();
    ThreadLocalRunnable()
    {
    }
    //SimpleDateFormat
    @Override
    public void run() {
        threadLocal.set(new SimpleDateFormat("yyyyMMdd HHmm"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get().toLocalizedPattern());
    }
}


public class ThreadLocalMain {

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalRunnable tl = new ThreadLocalRunnable();

        Thread t1 = new Thread(tl, "Thread1");
        Thread t2 = new Thread(tl, "Thread2");

        t1.start();
        t2.start();

       // t1.join();
        //t2.join();
    }
}
