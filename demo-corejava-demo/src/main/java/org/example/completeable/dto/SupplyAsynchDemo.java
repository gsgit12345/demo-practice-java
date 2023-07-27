package org.example.completeable.dto;

import org.example.completeable.database.EmployeeDB;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsynchDemo {

    public List<Employees> getEmployee() throws ExecutionException, InterruptedException {
        
        CompletableFuture<List<Employees>> list=    CompletableFuture.supplyAsync(()->{
            System.out.println("executed by thread:"+Thread.currentThread().getName());
            return EmployeeDB.fetchDB();
        });
        return list.get();
    }
}
