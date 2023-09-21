package org.example.typecast;
interface SInterface1 {}

class SampleClass11 {}

class MainTest1 {
public static void main(String[] args) {
SampleClass1 sc1 = new SampleClass1();
SInterface1 sc2 = (SInterface1) sc1;
}
}
/*
Question here is why it didn't gave Compile time error?
Compiler is really not sure here to give compile error because sc1 at runtime can be reference of 
class SampleClass1, say (class SampleClass1  implements SInterface1) in that case typecasting is
 perfectly valid. So Compiler doesn't give Compile error in this case, but when you run the program it sees that sc1 doesn't point 
 to class that implements SInterface1 and that is why it cannot be typecasted.

*/