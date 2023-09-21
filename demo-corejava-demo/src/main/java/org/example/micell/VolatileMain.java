package misc;

public class VolatileMain {
	
	private final static int TOTAL_THREADS = 2;
	
	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData();
		
		Thread[] threads = new Thread[TOTAL_THREADS];
		for(int i = 0; i < TOTAL_THREADS; ++i)
			threads[i] = new VolatileThread(volatileData);
		
		//Start all reader threads.
		for(int i = 0; i < TOTAL_THREADS; ++i)
			threads[i].start();
		
		//Wait for all threads to terminate.
		for(int i = 0; i < TOTAL_THREADS; ++i)
			threads[i].join();
		byte a = 127; 
		byte b = 127;
		// b = a + b; 
		 b += a;
		 
		 float f=0.1f;
		 int se=3;
		 float gg=f*se;
		 System.out.println("vale is::"+gg);
		 System.out.println("JVM Bit size: " + System.getProperty("sun.arch.data.model"));
		 System.out.println("JVM Bit size: "+System.getProperty("os.arch"));
	}
}