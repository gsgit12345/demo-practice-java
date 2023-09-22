package org.example.cloning;

class ObjectReturnDemo {
    int a;
 
    // Constructor
    ObjectReturnDemo(int i) { a = i; }
 
    // Method returns an object
    ObjectReturnDemo incrByTen()
    {
        ObjectReturnDemo temp
            = new ObjectReturnDemo(a + 10);
        return temp;
    }
}
 

public class ObjectReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ObjectReturnDemo ob1 = new ObjectReturnDemo(2);
        ObjectReturnDemo ob2;
 
        ob2 = ob1.incrByTen();
 
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

	}

}
