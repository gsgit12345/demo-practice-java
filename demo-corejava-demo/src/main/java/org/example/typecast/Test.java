package practice.typecast;
interface Interface1 { }
interface Interface2 { }
class Class1 implements Interface1 { }

class Test{
public static void main(){
Class1 c1 = new Class1();
String str = new String("Hello"); //OR Integer str = new Integer(1); 

Interface2 x = (Interface2)c1; //why compiler does not complain here?
Interface2 y = (Interface2)str; //why compiler complains here?
}
}
/*

It will not give Compile time Error at line 10 but gives Compile error at line 11, why?
According to Question 4, which explains rules of typecasting,
*/