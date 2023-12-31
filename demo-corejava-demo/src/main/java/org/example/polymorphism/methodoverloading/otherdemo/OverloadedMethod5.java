package practice.overload;

class OverloadedMethod5 {
	public void test(Object obj) {
		System.out.println("Object");
	}

	public void test(char[] obj) {
		System.out.println("Char");
	}

	public void test(Integer obj) {
		System.out.println("Int");
	}

	public static void main(String[] args) {
		OverloadedMethod5 obj = new OverloadedMethod5();
	//	obj.test(null);//compile time error
	}
}

/*
Output: Compile time error.
char[] is class with name "[C" and superclass of char[] is java.lang.Object.
Integer is class and superclass of Integer is Number --> Object.
So both the classes char[] and Integer are at same level to Object class and fall in 
different hierarchy, so compiler will not able to resolve as which method to invoke.     

*/