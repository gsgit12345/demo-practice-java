package org.example.typecast;
class ClassA{}
class ClassB{}

interface InterfaceI{}

class MainTest11 {
public static void main(String[] args) {
InterfaceI i = (InterfaceI)(new ClassA());
//ClassA b = (ClassB)(new ClassA());
}
}
/*
It will give Compile Time Error: "Cannot cast from ClassA to ClassB" at line 9.
It will give Runt Time ClassCastException: "ClassA cannot be cast to InterfaceI" at line 8.

*/