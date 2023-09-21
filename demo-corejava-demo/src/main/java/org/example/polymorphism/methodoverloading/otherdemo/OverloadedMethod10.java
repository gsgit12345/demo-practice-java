package practice.overload;

class OverloadedMethod10 {
	public void test(Character c) {
		System.out.println("Character");
	}

	public void test(Integer i) {
		System.out.println("Integer");
	}

	public void test(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		OverloadedMethod obj = new OverloadedMethod();
		byte b = 10;
		obj.test(b);
	}
}
/*
Output:  Object 
"You cannot widen and then box" but "You can box and then widen".
 obj.test(b) can be resolved to either test(Integer i) or test(Object obj).
 For resolving to test(Integer i), It has to first widen byte to int and then box it to Integer.
 It is not permissible in java that is "You cannot widen and then box"
 For resolving to test(Object i), It has to first box to Integer and then widen to Object.
 It is permissible in java that is "You can box and then widen". and that is why output is  
 "Object".
*/
