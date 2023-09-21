package org.example.polymorphism.methodoverloading.otherdemo;
class A{}
   
class B extends A{}
   
class C extends B{}
   
class OverloadedMethod2{
   public void test(B obj) {
     System.out.println("B");
   }
     
   public void test(C obj) {
     System.out.println("C");
   }
     
   public static void main(String[] args) {
     OverloadedMethod obj = new OverloadedMethod();
     obj.test(null);
   }
}

//ans -- c   a-b-c

/*
Output is "C" because test(null) method call maps to method which contains parameter as
 class which is lowest in class hierarchy. */
