package output;

public class RuntimePolymorphism 
{ 
    public static void main(String[] args) 
    { 
        A a = new B(); 
        B b = new B(); 
        System.out.println( a.getValue() +  
            " " + b.getValue() + " " + b.getSuperValue()); 
    } 
} 
  
class A 
{ 
    private char c = 'A'; 
    char getValue() 
    { 
        return c; 
    } 
} 
class B extends A 
{ 
    protected char c = 'B'; 
    char getSuperValue() 
    { 
       // return super.c; 
    } 
} 