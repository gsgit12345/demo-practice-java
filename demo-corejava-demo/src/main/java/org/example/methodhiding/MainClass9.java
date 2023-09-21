package practice.methodhiding;
public class MainClass9 {
public static void main(String[] args){
    Parent3.print();
    Child3.print();
}
}

class Parent3 {
        public static void print() {
                System.out.println("I am Parent");
        }
}

class Child3 extends Parent3 {
        
}