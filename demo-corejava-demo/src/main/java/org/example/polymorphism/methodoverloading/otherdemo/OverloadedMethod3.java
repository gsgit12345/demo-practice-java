package org.example.polymorphism.methodoverloading.otherdemo;
class OverloadedMethod3{
   public void test(String obj1, Object obj2) {
      System.out.println("B");
   }
      
   public void test(Object obj1, String obj2) {
      System.out.println("C");
   }
      
   public static void main(String[] args) {
      OverloadedMethod3 obj = new OverloadedMethod3();
    //  obj.test(null, null);//ambigous method call
   }
}