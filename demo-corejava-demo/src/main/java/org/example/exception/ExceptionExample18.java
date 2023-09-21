package org.example.exception;

class ExceptionExample18 {

public static void main(String[] args) {
System.out.println("Value of a :"+test());
  }
    
  private static int test(){
    int a = 10;
    try {
      return a;
    } catch (Exception e) {
      a = 20;
      System.out.println("a in catch : "+a);
    }finally{
      a = 30;
      System.out.println("a in finally : "+a);
    }
    a = 40;
    System.out.println("a outside try-catch : "+a);
    return a;
  }
}
//ans 30  ,10