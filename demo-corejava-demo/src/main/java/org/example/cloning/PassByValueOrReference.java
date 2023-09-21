package clonemethod;

class ObjectPassDemo {
    int a, b;
 
    // Constructor
    ObjectPassDemo(int i, int j)
    {
        a = i;
        b = j;
    }
 
    // Method
    boolean equalTo(ObjectPassDemo o)
    {
        // Returns true if o is equal to the invoking
        // object notice an object is passed as an
        // argument to method
        return (o.a == a && o.b == b);
    }
}
 

public class PassByValueOrReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);
 
        // Checking whether object are equal as custom
        // values
        // above passed and printing corresponding boolean
        // value
        System.out.println("ob1 == ob2: "
                           + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: "
                           + ob1.equalTo(ob3));

	}

}