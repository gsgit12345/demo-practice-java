package concurrency.condition;

public class Counter implements Runnable{
public int counter=0;

public void increment()
{
	try
	{
		Thread.sleep(1000);
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
	counter++;
}
public void decrement()
{
	counter--;
}
public int getCounter()
{
	return counter;
}
@Override
public void run() {

	try
	{
	synchronized (this) {
		
	
	increment();
	System.out.println("counter is:::"+getCounter()+"thread name::"+Thread.currentThread().getName());
	
	decrement();
	System.out.println("counter is:::"+getCounter()+"thread name::"+Thread.currentThread().getName());
	}
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
}

public static void main(String arg[])
{
	Thread t1=new Thread(new Counter());
	t1.start();
	Thread t2=new Thread(new Counter());
	t2.start();

	Thread t3=new Thread(new Counter());

	t3.start();
}

}
