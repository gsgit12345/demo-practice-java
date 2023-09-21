package executerdemo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityBlockingQueue<Employee> PriorityBlockingQueue = new PriorityBlockingQueue<>();
        
		PriorityBlockingQueue.add(new Employee(1l, "AAA", LocalDate.now()));
		PriorityBlockingQueue.add(new Employee(4l, "CCC", LocalDate.now()));
		PriorityBlockingQueue.add(new Employee(5l, "BBB", LocalDate.now()));
		PriorityBlockingQueue.add(new Employee(2l, "FFF", LocalDate.now()));
		PriorityBlockingQueue.add(new Employee(3l, "DDD", LocalDate.now()));
		PriorityBlockingQueue.add(new Employee(6l, "EEE", LocalDate.now()));
		 
		while(true) 
		{
		    Employee e = PriorityBlockingQueue.poll();
		    System.out.println(e);
		     
		    if(e == null) break;
		}
		
		//Comparator for name field
		Comparator<Employee> nameSorter = Comparator.comparing(Employee::getName);
		 
		PriorityBlockingQueue<Employee> PriorityBlockingQueue2 = new PriorityBlockingQueue<>( 11, nameSorter );
		         
		PriorityBlockingQueue2.add(new Employee(1l, "AAA", LocalDate.now()));
		PriorityBlockingQueue2.add(new Employee(4l, "CCC", LocalDate.now()));
		PriorityBlockingQueue2.add(new Employee(5l, "BBB", LocalDate.now()));
		PriorityBlockingQueue2.add(new Employee(2l, "FFF", LocalDate.now()));
		PriorityBlockingQueue2.add(new Employee(3l, "DDD", LocalDate.now()));
		PriorityBlockingQueue2.add(new Employee(6l, "EEE", LocalDate.now()));
		 
		while(true) 
		{
		    Employee e = PriorityBlockingQueue.poll();
		    System.out.println(e);
		     
		    if(e == null) break;
		}
	}

}
