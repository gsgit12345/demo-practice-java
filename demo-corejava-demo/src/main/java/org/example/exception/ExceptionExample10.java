package org.example.exception;
class ExceptionExample10{ 
    
    public static final void main(String[] args) {
        System.out.println(test());
    }
    
    private static String test() {
        try {
            String str = null;
            return str.toString();
            
        }finally {
            return "hello finally";
        }
    } 
}
/*
How come NullPointerException is not thrown? So as we see in previous example, 
finally block if present will always be a deciding block for return value of method if return
statement is present in finally block irrespective of return present in try and catch block.

In try block NullPointerException is thrown but and as it is Unchecked exception compiler 
didn't complain for handling it and it is generated at run time. 

After executing try block NullPointerException is generated but that is not the output of 
the program as finally block was present in method which is returning "hello finally", 
So control went to finally block and it encountered return statement there, which is final 
return of method and exception which JVM planned to return after final block execution
get lost.

*/
