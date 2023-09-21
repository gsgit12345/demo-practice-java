package org.example.defaultmethod;

public class Shadowing2 {
	 
    // Instance variable or member variable
    String name = "Outer John";
 
    // Nested inner Class
    class innerShadowing {
 
        // Instance variable or member variable
        String name = "Inner John";
 
        // Function to print the content
        public void print(String name)
        {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Shadowing2.this.name);
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
        // Accessing an inner class
        Shadowing2 obj = new Shadowing2();
        Shadowing2.innerShadowing innerObj
            = obj.new innerShadowing();
 
        // Function Call
        innerObj.print("Parameter John");
    }
}
