package org.example.micell;

import java.io.FileNotFoundException;

public class Except  
{ 
    public static void main(String[] args)  throws FileNotFoundException
    {     
        try 
        { 
            throw new FileNotFoundException();
        } 
        catch (Error e)  
        { 
            try 
            { 
                throw new RuntimeException(); 
            } 
            catch (Throwable t)  
            { 
  
            } 
        } 
            System.out.println("phew"); 
    } 
} 