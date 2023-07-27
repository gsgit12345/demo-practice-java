package org.example.completeable.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunAsynchDemo {
    public Void saveEmployee(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper=new ObjectMapper();
        CompletableFuture<Void> runasynch=  CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try
                {
         List<Employees> employee=       mapper.readValue(jsonFile,new TypeReference<List<Employees>>(){});
                //write the logic to save the employee in the database
                 //respository.saveAll();
                    System.out.println("current thread:::"+Thread.currentThread().getName());
                    employee.stream().forEach(System.out::println);
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });
        return runasynch.get();
    }
    public Void saveEmployeeUsingLambda(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper=new ObjectMapper();
        CompletableFuture<Void> runasynch=  CompletableFuture.runAsync(()-> {
                try
                {
                    List<Employees> employee=       mapper.readValue(jsonFile,new TypeReference<List<Employees>>(){});
                    //write the logic to save the employee in the database
                    //respository.saveAll();
                    System.out.println("current thread:::"+Thread.currentThread().getName());
                    employee.stream().forEach(System.out::println);
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }

        });
        return runasynch.get();
    }
    public Void saveEmployeeUsingCusytomeExecutor(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper=new ObjectMapper();
        Executor executor= Executors.newFixedThreadPool(5);
        //below code will not pick thread for execution from the ForkJoinPool
        CompletableFuture<Void> runasynch=  CompletableFuture.runAsync(()-> {
            try
            {
                List<Employees> employee=       mapper.readValue(jsonFile,new TypeReference<List<Employees>>(){});
                //write the logic to save the employee in the database
                //respository.saveAll();
                System.out.println("current thread:::"+Thread.currentThread().getName());
                employee.stream().forEach(System.out::println);
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }

        },executor);
        return runasynch.get();
    }
    public static void main(String str[]) throws ExecutionException, InterruptedException {
        RunAsynchDemo runas=new RunAsynchDemo();
        runas.saveEmployee(new File("employees.json"));
    }
}
