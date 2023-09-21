package practice.overload;
public class OverloadedMethod1{
    public void test(String str) {
     System.out.println("String");
    }
     
    public void test(StringBuffer obj) {
     System.out.println("Object");
    }
     
    public static void main(String[] args) {
     OverloadedMethod obj = new OverloadedMethod();
     obj.test(null);
    }
}
//ans--compile time error

/*
StringBuffer and String class are both at same level in Object hierarchy, So in this case Compiler will not able to resolve 
which method to invoke and it gives Compile time error. */


