package hashmapexam;

public class IllegalAccessExceptionDemo {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		Class<?> classVar = ExampleClass.class;
		ExampleClass t=null;;
		try {
			t = (ExampleClass) classVar.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.testMethod();
	}

}
