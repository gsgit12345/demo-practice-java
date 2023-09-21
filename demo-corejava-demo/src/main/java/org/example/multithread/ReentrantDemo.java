package executerdemo;

public class ReentrantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantDemo demo = new ReentrantDemo();
		demo.outerMeth();
	}

	public synchronized void outerMeth() {
		System.out.println("outer method");
		innerDemo();
	}

	public synchronized void innerDemo() {
		System.out.println("inner demo");
	}
}
