package concurrency.condition;

public class SequenceThread {

	public static void main(String[] args) {
		System.out.println("main is started");
		
		Thread main=Thread.currentThread();
		SequenceThread2 thread=new  SequenceThread2();
		SequenceThread2 thread2=new  SequenceThread2();
		SequenceThread2 thread3=new  SequenceThread2();
Thread t1=new Thread(thread,"t1");
Thread t2=new Thread(thread2,"t2");
Thread t3=new Thread(thread3,"t3");
try
{
	
t1.start();
//t1.join();
t2.start();
//t2.join();
t3.start();
//t3.join();
main.join();
//Thread.currentThread().join();
}catch(Exception ex)
{
	ex.printStackTrace();
}

System.out.println("main is finished"+Thread.currentThread().getName());
	}

	

}
