package practice.methodhiding;
public class MainClass10 {
public static void main(String[] args){
      Parent4 parent = new Child4();
      parent.print();
      
      Child4 child = new Child4();
      child.print();
}
}

class Parent4 {
   public static void print() {
      System.out.println("I am Parent");
   }
}

class Child4 extends Parent4 {
   public static void print() {
      System.out.println("I am Child");
   }       
}