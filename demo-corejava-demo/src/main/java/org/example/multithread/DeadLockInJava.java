package executerdemo.Thread;


	
class thread1 
{
String name;
String object="helloo";
String object2="hello22";
Thread t1=new Thread(new Runnable() {
	
	@Override
	public void run() {
		
		synchronized (object) {
			
			System.out.println("in synchronized block object t1 ");
			
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			synchronized (object2) {
				System.out.println("in  object2synchronized block t1");
			}
		}
		
	}
});

Thread t2=new Thread(new Runnable() {
	
	@Override
	public void run() {
		 
		 synchronized (object2) {
				
				System.out.println("in synchronized t2 block object2");
				try
				{
				Thread.sleep(1000);	
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
				synchronized (object) {
					System.out.println("in synchronized t2 block object");
				}
			}
	}
});


}

public class DeadLockInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread1 t=new thread1();
		t.t1.start();
		t.t2.start();

	}

}
