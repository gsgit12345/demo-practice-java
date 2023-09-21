package executerdemo.typicalquest;

import java.util.stream.IntStream;

public class findPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int findPrime(int num)
	{
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);

	}
}
