package practice.methodhiding;
class Parent{ 
    public static void print(){ 
    System.out.println("I am Parent"); 
    } 
}

class Child extends Parent{ 
    public static void print(){ 
    System.out.println("I am Child"); 
    } 
}
    
public class MainClass { 
    public static void main(String args[]) { 
    Parent parent = new Parent(); 
    parent.print(); 
    
    parent = new Child(); 
    parent.print(); 
    
    Child child = new Child(); 
    child.print(); 
    } 
}
/*
Explanation: No. Static methods cannot be overridden.
Static methods are not polymorphic and doesn't take part in run time or dynamic polymorphism and the decision as to which method will be called is 
resolved at compile time based on the type alone.
We can declare static methods with same signature in subclass, but it is not considered as overriding because there won’t be any run-time or 
dynamic polymorphism.
If a derived class defines a static method with same signature as a static method in base class, the method in the derived class hides 
the method in the base class.
even if caller writes like,  
Parent parent = new Parent();  
parent.print(); 
Compiler at compile time will change above line to Parent.print() because static methods need to be called in static way and is not associated to 
any instance.
Parent parent = new Child();  
parent.print();
Above line would have printed "I am Child" if static methods are polymorphic.
So internally what it does is, Compiler checks whether print() method is static, if yes, then it replace the instance to instance type.
parent object is of type Parent, so it replaces it to,
Parent.print();

*/
