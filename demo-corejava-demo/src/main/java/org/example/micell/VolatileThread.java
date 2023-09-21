package org.example.micell;

public class VolatileThread extends Thread {
	private final VolatileData data;
	
	public VolatileThread(VolatileData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		long oldValue = data.getCounter();
	int oldarr[]=	data.getVolarr();
	
		System.out.println("[Thread " + Thread.currentThread().getId()
				+ "]: Old value = " + oldValue);
		
        data.increaseCounter();
        oldarr[0]=12;
    	oldarr[3]=1;
    	long newValue = data.getCounter();
        
        int nearr[]=data.getVolarr();
		System.out.println("[Thread " + Thread.currentThread().getId()
				+ "]: New value = " + newValue);
		System.out.println("[array"+Thread.currentThread().getId()+"]"+"arra value:;"+nearr[0]+"===3 po"+nearr[3]);
	}
}
