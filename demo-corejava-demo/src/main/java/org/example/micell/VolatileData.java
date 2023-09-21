package org.example.micell;

public class VolatileData {
	
	private volatile long counter = 0;
	private int[] volarr=new int[4];
	public int[] getVolarr() {
		return volarr;
	}

	public void setVolarr(int[] volarr) {
		this.volarr = volarr;
	}

	public long getCounter() {
		return counter;
	}
	
	public void increaseCounter() {
		++counter;
	}
}
