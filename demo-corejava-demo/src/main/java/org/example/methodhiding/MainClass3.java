package practice.methodhiding;
class Parent{ 
public static void print(){ 
    System.out.println("I am Parent"); 
} 
}

class Child extends Parent{ 
public void print(){ 
    System.out.println("I am Child"); 
} 
}

public class MainClass3 { 
public static void main(String args[]) { 
    Parent parent = new Child(); 
    parent.print(); 
} 
}
/*
Output :
Compilation Error at line 8. 
Error says: "This instance method cannot override the static method from Parent"
Explanation:
An instance method from subclass cannot override static(class) method from super class.
Lets say Java allows instance method overriding static method from parent class, then "parent.print();" 
will call print() method of Parent or Child class?
print() method is static in Parent class, so call should be evaluated to Parent.print()
but at the same time print() method in subclass is not static and 
it supports polymorphic behavior. so what to do?
that is why it gives compile error and doesn't supports instance method overriding static methods from Super class. 
*/
