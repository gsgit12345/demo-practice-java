package practice.methodhiding;

public class MainClass7 {
      
      public static void main(String[] args) {
            Parent2 p = new Child2();
            p.print();
      }
}     
class Parent2 {
      public static int x = 10;
      
      public void print() {
            System.out.println(x);
      }
}     
class Child2 extends Parent2 {
      public Child2() {
            x = 30;
      }
}
/*
Child class is not hiding the x variable(hiding happens when it declares the variable with same name) but it simply changes the value of
 static variable that it has received from Parent class.
 
 */
