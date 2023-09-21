package practice.methodhiding;
class Parent{ 
      public int var = 10;
     
      public void print(){ 
     int var = 20;
          
     System.out.println("I am Parent 1:"+var);
     System.out.println("I am Parent 2:"+this.var);
      }
}
      
class Child extends Parent{ 
      public int var = 30;
     
      public void print(){ 
     int var = 40;
          
     System.out.println("I am Child 1:"+var);
     System.out.println("I am Child 2:"+this.var);
     System.out.println("I am Child 3:"+super.var);
      } 
}
      
public class MainClass5 {
      
      public static void main(String[] args) {
     Parent p = new Parent();
     System.out.println(p.var); //10
     p.print();//20 10
     System.out.println("---------------");
           
     Child c = new Child();
     System.out.println(c.var);
     c.print(); //40  30 10
     System.out.println("---------------");
           
     Parent pc = new Child(); //(OR p = c)
     System.out.println(pc.var);//10
     pc.print(); //40 30 10
     System.out.println("---------------");
      }
}

/*
Explanation:
Variables doesn't exhibit polymorphic behavior but exhibits inheritance
Subclass will have access to both variables, one from parent and one of its own.
If you declare a variable of the same name in subclass, that's called hiding. 
You can access the one from the superclass with super.var or ((SuperClass)this).var.
The variables don't even have to be of the same type; they are just two variables sharing a same name, much like two overloaded methods.
The scope of field being accessed(super class field or subclass field) will be determined at compile time by the type of the class that 
the field is being referenced from.
Example:
Superclass sc = new Subclass()
System.out.println(sc.var);
The compile time type of sc is Superclass, so var of superclass is binded at compile time.
This is resolved at compile time and not at run time.
Resolving anything at compile time doesn't exhibit polymorphic behavior.
If the variable "var" is made static at both parent class and in subclass or at either class, 
it will be perfectly valid and there would be no change in output.

*/
