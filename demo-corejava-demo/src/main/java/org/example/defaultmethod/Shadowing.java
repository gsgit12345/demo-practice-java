package org.example.defaultmethod;
//Outer Class
public class Shadowing {

 // Instance variable or member variable
 String name = "Outer John";

 // Nested inner class
 class innerShadowing {

     // Instance variable or member variable
     String name = "Inner John";

     // Function to print content of instance variable
     public void print()
     {
         System.out.println(name);
         System.out.println(Shadowing.this.name);
     }
 }

 // Driver Code
 public static void main(String[] args)
 {

     // Accessing an inner class
     Shadowing obj = new Shadowing();
     Shadowing.innerShadowing innerObj
         = obj.new innerShadowing();

     // Function Call
     innerObj.print();
 }
}
