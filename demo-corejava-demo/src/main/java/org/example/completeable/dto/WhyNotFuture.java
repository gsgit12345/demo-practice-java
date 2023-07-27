package org.example.completeable.dto;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class WhyNotFuture {
    public static void main(String str[]) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        //api doing delay 1 min. in response
        System.out.println("curent thread:"+Thread.currentThread().getName());
        delay(1);
       Future<List<Integer>> future= executor.submit(()->{
         //  System.out.println(0/10); here is no way to handle the exception
            return Arrays.asList(1,2,3,4,5);
        });
        List<Integer> result=future.get();
        //here if i want to pass this list to the some api for processing
        //i can not pass because i am getting this list after one min.i can not pass to another thread.
        System.out.println(result.toString());

    }
    public  static void delay(int min)
    {
        try {
            TimeUnit.MINUTES.sleep(min);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
