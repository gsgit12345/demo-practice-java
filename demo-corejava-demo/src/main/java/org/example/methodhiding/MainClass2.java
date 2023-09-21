package practice.methodhiding;
class Parent{ 
public static void print(){ 
    System.out.println("I am Parent"); 
} 
}

public class MainClass2 { 
public static void main(String args[]) { 
    Parent parent = null; 
    parent.print();
} 
}

/*
Explanation:
Parent parent = null;
parent.print();
So internally what Compiler does is it checks whether print() method is static, if yes, then it replace the instance to instance type.
parent object is of type Parent, so it replaces it to, Parent.print(); at compile time itself and at runtime there is no Null Pointer Exception.
*/
