package org.example.polymorphism.methodoverloading.otherdemo;

class OverloadedMethod9{       
      public void test(Integer i) {
            System.out.println("Integer");
      }
      public void test(Long l) {
            System.out.println("Long");
      } 
      
      public static void main(String[] args) {
            OverloadedMethod9 obj = new OverloadedMethod9();
            short s = 10;
          //  obj.test(s);//you can not widen and then box
      }
}
/*
Output:  Compile time error. It is breaking rule "You cannot widen and then box"
For short primitive type to be resolved to either Integer or Long wrapper class, it has to 
first widen short to int and then box it to Integer, which is not possible.

*/