package practice.overload;

class OverloadedMethod9{       
      public void test(Integer i) {
            System.out.println("Integer");
      }
      public void test(Long l) {
            System.out.println("Long");
      } 
      
      public static void main(String[] args) {
            OverloadedMethod obj = new OverloadedMethod();
            short s = 10;
            obj.test(s);
      }
}
/*
Output:  Compile time error. It is breaking rule "You cannot widen and then box"
For short primitive type to be resolved to either Integer or Long wrapper class, it has to 
first widen short to int and then box it to Integer, which is not possible.

*/