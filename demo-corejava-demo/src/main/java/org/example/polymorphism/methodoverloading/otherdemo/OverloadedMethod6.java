package org.example.polymorphism.methodoverloading.otherdemo;
class OverloadedMethod6{
     public void test(long lng) {
     System.out.println("Long");
     }
     
     public void test(Integer integer) {
     System.out.println("Integer");
     }
     
     public static void main(String[] args) {
     OverloadedMethod6 obj = new OverloadedMethod6();
     obj.test(1);//widening rule is applicable.first widening then boxing
     }
}
/*

Output: Long
Because Widening wins over Boxing.

Note: Rules that applies for evaluating method call in overloading.
Widening wins over boxing eg. test(10) will call test(long) instead of test(Integer) if both are available.
Widening wins over var-args eg test(byte,byte) will call test(int,int) instead of test(byte...x) method.
Boxing beats var-args eg test(byte,byte) will call test(Byte,Byte) instead of test(byte...x) method.
Widening of reference variable depends on inheritance tree(so, Integer cannot be widened to Long.
 But, Integer widened to Number because they are in same inheritance hierarchy).
 You cannot widen and then box. Eg. test(int) cannot call test(Long) since to call test(Long) the compiler need to
  convert int to Integer then Integer to Long which is not possible.
You can box and then widen. Eg. An int can boxed to Integer and then widen to Object.
var-args can be combined with either boxing or widening.


*/