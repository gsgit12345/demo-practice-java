package practice.methodhiding;
public class MainClass6 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        System.out.println(p.getObject().x);
    }
}
    
class Parent1 {
    int x = 10;
    
    public Parent1 getObject() {
       // return new Parent1();//10
        return new Child1();//10
    }
} 
    
class Child1 extends Parent1 {
    int x = 20;
    
    public Child1 getObject() {
        return new Child1();
    }
}

/*
Explanation:
Variables doesn't exhibit polymorphic behavior but exhibits inheritance.
p.getObject().x
In this case, Compiler checks the type of "p" which is "Parent" and at compile time it just checks whether Parent class has "getObject()" method or not. 
If not then it throws "The method getObject() is undefined for the type Parent"
If yes then it just check the return type of getObject() method because ultimately "x" is going to be invoked on that reference and in our case it is Parent, 
So p.getObject().x will be evaluated to Parent.x at compile time logically.
If you change the return type of getObject method in Parent class to Child then output will be 20.

*/

