package org.example.polymorphism.methodoverloading.otherdemo;
public class OverloadedMethod{
  public void test(String str) {
    System.out.println("String");
  }
    
  public void test(Object obj) {
    System.out.println("Object");
  }
    
  public static void main(String[] args) {
    OverloadedMethod obj = new OverloadedMethod();
    obj.test(null);
  }
}
/*If more than one method is both accessible and applicable to a method invocation then
Java compiler uses the set of rules that the most specific method is chosen for invocation.
Compiler check the class hierarchy of method parameter and whichever class is least general one that is 
the class which is encounter first in bottom up hierarchy, that method is invoked.
Compiler will found String class as the most general class in bottom up inheritance hierarchy,
 that is why test(String) method is invoked
 */
