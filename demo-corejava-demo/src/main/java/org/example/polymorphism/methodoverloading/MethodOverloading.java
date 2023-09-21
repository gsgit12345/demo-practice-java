package org.example.polymorphism.methodoverloading;

class overloading {
    //it is static binding
    public overloading() {

    }

    public void overloading() {
        //this is the method
    }

    public int sum(int a) {
        System.out.println("single parameter int");
        return a;
    }

    public int sum(int a, int b) {
        System.out.println("two parameter int");
        return a + b;
    }

    public void sum(String str) {
        System.out.println("string version of overload");
    }

    public void sum(String str, Object st) {
        System.out.println("string and object  version of overload");
    }

    public void sum(Integer st) {
        System.out.println("integer version");
    }

    public void sum(Object st) {
        System.out.println("object version");
    }
}


public class MethodOverloading {
    public static void main(String str[]) {

        overloading over = new overloading();
        over.sum("hello");//stringversion
        over.sum(new Integer(10));//integer version
        over.sum(10);//int version
        over.sum(new String("hello"));//string version
        over.sum(new StringBuffer("hello"));//object version
    }
}
