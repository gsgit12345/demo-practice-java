package org.example.polymorphism.methodoverloading.otherdemo;
class OverloadedMethod13{    
public void test(int... i) {
      System.out.println("method 1");
}
public void test(Integer... i) {
      System.out.println("method 2");
} 

public static void main(String[] args) {
      OverloadedMethod13 obj = new OverloadedMethod13();
   //   obj.test(1);
}
}
/*
Output:  Compile time error
Why it gave Compile Error? 
 Java overloaded method call is resolved using 3 steps,
 STEP 1: Compiler will try to resolve call without boxing and unboxing and variable 
                 argument.
STEP 2: Compiler will try to resolve call by using boxing and unboxing.
STEP 3: Compiler will try to resolve call by using boxing/unboxing and variable argument.
If call is not resolved by using any of the 3 ways then it gives compile error.
In our case, method call, test(1) is not resolved by using STEP 1 because,
In STEP 1,compiler will try data type widening and see whether call is resolved but no in 
our case.
In STEP 2, Compiler tries to resolve call using Boxing and Un-Boxing and see whether call 
is resolved but no in our case.
In STEP 3, Compiler tries to resolve call using Boxing and Un-Boxing along with variable 
argument and see whether call is resolved. In our case at this step compiler will find both 
method test(int...) and test(Integer...) is applicable and call  resolved to 2 methods that is 
why it gave compile error.

*/
