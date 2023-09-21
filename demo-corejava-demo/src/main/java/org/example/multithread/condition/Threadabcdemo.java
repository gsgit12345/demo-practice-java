package concurrency.condition;

public class Threadabcdemo {

	public static void main(String[] args) {
		ResourceLock resource=new ResourceLock();
		
		ThreadA a=new ThreadA(resource);
		ThreadB b=new ThreadB(resource);
		ThreadC c=new ThreadC(resource);
		
		a.start();
		b.start();
		c.start();
	}

}
