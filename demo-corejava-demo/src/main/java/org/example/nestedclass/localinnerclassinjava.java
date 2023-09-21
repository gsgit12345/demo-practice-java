package executerdemo.nestedclass;

public class localinnerclassinjava {
	
	   void my_Method() {
		      int num = 23;
		      // method-local inner class
		      class MethodInner_Demo {
		         public void print() {
		            System.out.println("This is method inner class "+num);
		         }
		      } // end of inner class
		      // Accessing the inner class
		      MethodInner_Demo inner = new MethodInner_Demo();
		      inner.print();
		   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
