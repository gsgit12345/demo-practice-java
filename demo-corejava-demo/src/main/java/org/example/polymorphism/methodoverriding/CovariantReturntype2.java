package org.example.polymorphism.methodoverriding;

class A {
}
 
// Class 2
class B extends A {
}
 
// Class 3
// Helper class (Base class)
class Base {
 
    // Method of this class of class1 return type
    A fun()
    {
        // Display message only
        System.out.println("Base fun()");
 
        return new A();
    }
}
 
// Class 4
// Helper class extending above class
class Derived extends Base {
 
    // Method of this class of class1 return type
    B fun()
    {
        // Display message only
        System.out.println("Derived fun()");
 
        return new B();   //covariant return type
    }
}
 

public class CovariantReturntype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating object of class3 type
        Base base = new Base();
 
        // Calling method fun() over this object
        // inside main() method
        base.fun();
 
        // Creating object of class4 type
        Derived derived = new Derived();
 
        // Again calling method fun() over this object
        // inside main() method
        derived.fun();

	}

}
