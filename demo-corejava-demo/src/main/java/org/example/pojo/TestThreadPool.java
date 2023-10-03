package org.example.pojo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {  
    public static void main(String[] args) {  
       ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
       
       
      // Executors.newScheduledThreadPool(corePoolSize, threadFactory);
       System.out.println("Finished all threads");  
   }  
}  