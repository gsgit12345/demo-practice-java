package concurrency.condition;

import java.util.ArrayList;

public class consumer implements Runnable {
public ArrayList array=null;
	public consumer(ArrayList array)
	{
		this.array=array;
	}
	public void consume()throws Exception
	{
		
		synchronized (array) {
			if(array.isEmpty())
			{
				array.wait();
				System.out.println("waiting threa ::"+Thread.currentThread().getName());	
			}
		
		int i=(Integer)array.remove(0);
		System.out.println("array consumer element is ::"+i);	
		array.wait(1000);
		array.notify();
		}	
		
	}
	@Override
	public void run() {
		try
		{
			while(true)
			{
			consume();
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
