package concurrency.condition;

import java.util.ArrayList;

public class ProConsuWiWaiNotify {
	int number=0;
	//public ArrayList array=new ArrayList();
	public volatile  boolean flag=false;
	ProConsuWiWaiNotify()
	{
	//this.array=array;	
	}
	public void produce(ArrayList array)
	{
		
		try
		{
			while(flag)
			{
				System.out.println("produce thread"+Thread.currentThread().getName());
				Thread.sleep(1000);
				
			}
			array.add(number++);
			flag=true;
			System.out.println("produce thread"+array.size());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void consume(ArrayList array)
	{
		//int number=0;
		try
		{
		while(!flag)
			{
				System.out.println("consumer thread"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		int i=	(Integer)array.remove(0);
		flag=false;
		System.out.println("value in consumer"+i);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String str[])
	{
 	final ArrayList array=new ArrayList();
	final 	ProConsuWiWaiNotify task=new ProConsuWiWaiNotify();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			for(int i=0;i<=5;i++)
			{
				task.consume(array);
			}
			}
		},"consume").start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=5;i++)
				{
					task.produce(array);
				}
				
			}
		},"prodece").start();;
	}
}
