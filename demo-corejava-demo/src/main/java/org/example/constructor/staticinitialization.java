package constructordemo;

class Test {
	 
    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;
 
    // Case 3: Static blocks
    static
    {
        i = 10;
        System.out.println("static block called "+i);
    }
 
    // Constructor calling
    Test() { System.out.println("Constructor called"); }
}
 
public class staticinitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t1 = new Test();
        Test t2 = new Test();

	}

}
