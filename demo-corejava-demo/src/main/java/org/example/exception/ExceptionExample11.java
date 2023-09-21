package practice.exception;

class ExceptionExample11{ 

public static final void main(String[] args) {
System.out.println(test());
}

private static boolean test() {
boolean flag = false;

try
{
return true;
}
catch(Exception e){}
finally{}

System.out.println("Outside try-catch-finally");
return flag;
} 
}
/*
Why control never reached to line "Outside try-catch-finally" because in try block JVM 
encountered return statement, which is indication for JVM to return from here, but as a 
contract to execute finally block always (except in few conditions), finally block get 
executed which doesn't contain any statement, so control returned from finally back to try 
block and method returned from there without executing statements after finally block.
*/