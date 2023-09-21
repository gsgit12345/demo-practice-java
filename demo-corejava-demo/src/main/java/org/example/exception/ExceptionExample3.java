package practice.exception;

import java.io.IOException;

class ExceptionExample {
   private static void test(){
  try { } catch (IOException e) {}     
   }
}
// ans---unreachable code
/*
It is not allowed to catch a Checked Exception which is not thrown from try block except for class 
Exception and Throwable which has RuntimeException as subclass for which decision is taken at run time and not compile time.

*/