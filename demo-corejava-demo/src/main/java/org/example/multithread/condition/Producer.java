package concurrency.condition;

import java.util.ArrayList;

public class Producer implements  Runnable
{
	public ArrayList array=null;
	public int size=0;
	Producer(ArrayList array ,int size)
	{
	this.array=array;
	this.size=size;
	}
	public void produce(int num)throws Exception
	{
		synchronized (array) {
		while(array.size()==size)
			{
				System.out.println("waiting thread name is:::"+Thread.currentThread().getName());
				array.wait();
			}
		array.wait(1000);
		array.add(num)	;
		System.out.println("after in producer adding::"+array.size());
		array.notify();
		
	}
	}

	public void run() {
		int num=0;
		try
		{
			while(true)
			{
				produce	(num++);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
 

}
