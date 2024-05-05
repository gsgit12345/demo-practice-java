package org.example.jdk17feature.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;


public class ReentrantLockdemo {
    int count=0;

    public static void main(String str[])
    {

        ExecutorService service=Executors.newFixedThreadPool(2);

        ReentrantLock lock=new ReentrantLock();

        service.submit(()->{

            lock.lock();
            try {
               sleep(1);
            }catch(Exception ex)
            {

            }finally {
                lock.unlock();
            }

        });
        service.submit(()->{
           System.out.println("second runner::"+lock.isLocked());

            System.out.println("second::"+lock.isHeldByCurrentThread());
           boolean flag= lock.tryLock();
            System.out.println("flag runner:"+flag);



        });


service.shutdown();
    }
}
