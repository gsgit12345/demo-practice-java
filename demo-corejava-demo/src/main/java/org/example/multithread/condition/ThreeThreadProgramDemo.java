package concurrency.condition;

public class ThreeThreadProgramDemo {

	public static void main(String[] args) {
		ThreeThreadProgram thread=new ThreeThreadProgram();
		
		Thread t1=new Thread(thread,"t1");
		Thread t2=new Thread(thread,"t2");
		Thread t3=new Thread(thread,"t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
