package concurrency.condition;

public class DeadLockCreation {

	public String strLock=new String("hello deadlock");
	public Object objlock=new Object();
	
	Thread t1=	new Thread(new Runnable() {
		public void run() {
		synchronized (objlock) {
		System.out.println("object lock"+Thread.currentThread().getName());	
		}	
		synchronized (strLock) {
			System.out.println("str lock"+Thread.currentThread().getName());	
		}
		}
	},"Fist tread");
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			synchronized (strLock) {
				System.out.println("str lock"+Thread.currentThread().getName());	
			}
			synchronized (objlock) {
				System.out.println("object lock"+Thread.currentThread().getName());	
				}
			
		}
	});
	public static void main(String str[])
	{
		DeadLockCreation dead=new DeadLockCreation();
		dead.t1.start();
		dead.t2.start();
	}
}

