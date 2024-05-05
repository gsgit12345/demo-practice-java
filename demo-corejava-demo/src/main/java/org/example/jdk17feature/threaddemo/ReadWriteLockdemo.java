package org.example.jdk17feature.threaddemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.Thread.sleep;

public class ReadWriteLockdemo {
    public static void main(String str[])
    {
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        ReadWriteLock  lock=new ReentrantReadWriteLock();
        Map<Integer,String> map=new HashMap<>();

        executorService.submit(()->{
            lock.writeLock();
           try {
               sleep(10);
               map.put(1,"hello java");
           }catch(Exception ex)
           {

           }
           finally {
               lock.writeLock().unlock();
           }
        });

        Runnable readTask=()->{
            lock.readLock();
            try
            {
             sleep(12);
         System.out.println(map.get(1));
            }catch(Exception ex)
            {

            }finally {
              lock.readLock().unlock();;
            }

    };
        executorService.submit(readTask);
        executorService.submit(readTask);

    }
}
