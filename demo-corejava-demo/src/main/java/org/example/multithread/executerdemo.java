package executerdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService exe=Executors.newSingleThreadExecutor();
		
		exe.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("executing the run method");
				
			}
		});

		
		exe.shutdown();
	}

}
