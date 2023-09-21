package org.example.exception;

class ExceptionExample6 {
   public static void main(String[] args) {
      test();
   }
   private static void test(){
      try{
         System.out.println("In try");
         throw new ArithmeticException();
      } catch(Exception e){
         System.out.println("In catch");
         throw new ArrayIndexOutOfBoundsException();
      } finally{
         System.out.println("In finally");
         throw new NullPointerException();
      }
   }
}
/*  in try 
in catch
nullpointerexception
in finally */