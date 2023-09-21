package org.example.polymorphism.methodoverloading.otherdemo;
class OverloadedMethod88{        
       public void test(int i) {
       System.out.println("Int=");
       }
       public void test(char... c) {
       System.out.println("Char varargs");
       } 
       
       public static void main(String[] args) {
    	   OverloadedMethod88 obj = new OverloadedMethod88();
       obj.test('x');
       obj.test(97);
       }
}

/*
Note: Methods with varargs (...) have the lowest priority.
Priority goes as Widening --> Boxing --> Var args.
Logical reason behind Var-args having least priority is varargs were added late in Java API, 
Giving variable arguments a extremely low priority is also necessary for backwards-compatibility, 
otherwise giving high priority to variable argument will mess already written overloaded methods.
*/
