package org.example.narendra.array.exception;

class ThreadTask implements Runnable {

    public ThreadTask() {
    }

    public ThreadTask(Thread threadToJoin) {
        try {
            threadToJoin.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Start Thread :" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End Thread :" + Thread.currentThread().getName());
    }
}

public class JoinDemo {

    public static void main(String ar[]) {
        System.out.println("Inside Main Thread");

        Thread thread1 = new Thread(new ThreadTask());
        thread1.start();

        Thread thread2 = new Thread(new ThreadTask(thread1));
        thread2.start();

        Thread thread3 = new Thread(new ThreadTask(thread2));
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Main Thread");
    }
}