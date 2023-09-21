package concurrency.condition;

public class SequenceDisplay {
	public static void main(String[] args) {

		  Thread t1 = new Thread(new SequenceDisplayImpl(1));
		  Thread t2 = new Thread(new SequenceDisplayImpl(2));
		 // Thread t3 = new Thread(new SequenceDisplayImpl(3));
		  t1.start();
		  t2.start();
		//  t3.start();

		 }
}
