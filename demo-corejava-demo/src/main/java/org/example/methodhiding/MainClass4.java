package org.example.methodhiding;
class Parent3{
    public void print(){ 
   System.out.println("I am Parent"); 
    } 
}

class Child3 extends Parent3{
    //public static void print(){
   //System.out.println("I am Child");
  //  can not overridee static method .compile time error
   // }
}
    
public class MainClass4 { 
    public static void main(String args[]) { 
   Parent3 parent = new Child3();
   parent.print(); 
    } 
}

/*
Compilation Error at line 8. 
Error says: "This static method cannot hide the instance method from Parent"
Explanation:
An static method from subclass cannot hide instance method from super class.
Lets say Java allows static method hiding instance method from parent class, then "parent.print();" 
will call print() method of Parent or Child class?
print() method is not static in Parent class, it will check whether Subclass has provided overridden version of print(), 
yes it has, so it should call print() of Child class, but print method of child class is static and
and call can be resolved to both child and parent class print() method, now which method to invoke? so to remove this ambiguity 
java doesn't allows static method from subclass hiding instance method from super class..
that is why it gives compile error and doesn't supports static method hiding instance methods from Super class. 

*/
