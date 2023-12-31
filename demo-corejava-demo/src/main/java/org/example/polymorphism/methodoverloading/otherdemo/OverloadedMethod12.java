package org.example.polymorphism.methodoverloading.otherdemo;
class OverloadedMethod12{
public void test(long i, int j) {
     System.out.println("method 1");
}
public void test(int i, Integer j) {
     System.out.println("method 2");
} 

public static void main(String[] args) {
     OverloadedMethod12 obj = new OverloadedMethod12();
     obj.test(5,6);//widening
}
}
//1-exact match
//2-widening
//3-boxing and unboxing
//varargs parameter
/*
Output:  method 1
The first method has one parameter that requires widening and another that is exact match. 
The second method has one parameter with exact match and another that requires boxing.
Since widening has precedence over boxing, the first method is chosen.
Priority goes as: Exact Match > Widening > Boxing/unboxing > Varargs

*/
