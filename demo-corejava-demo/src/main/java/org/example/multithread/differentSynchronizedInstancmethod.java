package executerdemo;

public class differentSynchronizedInstancmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		differentSynchronizedInstancmethod obj=new differentSynchronizedInstancmethod();
		
		differentSynchronizedInstancmethod obj1=new differentSynchronizedInstancmethod();
		obj.synchronizedMethod1();
		obj.synchronizedMethod2();
	}

	  public synchronized void synchronizedMethod1() {
		   System.out.println("synchronizedMethod1 called");
		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		   System.out.println("synchronizedMethod1 done");
		  }

		  public synchronized void synchronizedMethod2() {
		   System.out.println("synchronizedMethod2 called");
		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		   System.out.println("synchronizedMethod2 done");
}
}
