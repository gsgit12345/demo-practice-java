package org.example.customecollectionclass;

public class FizBuzzAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzzAlgorithmn(100);
	}

	public static void fizzBuzzAlgorithmn(int n)
	{
		for(int i=1;i<=n;i++)
		{
            if (i%15==0)                                                
                System.out.print("FizzBuzz"+" ");
            // number divisible by 5, print 'Buzz'
            // in place of the number
            else if (i%5==0)    
                System.out.print("Buzz"+" ");
 
            // number divisible by 3, print 'Fizz'
            // in place of the number
            else if (i%3==0)    
                System.out.print("Fizz"+" ");
                 
            else // print the numbers
                System.out.print(i+" ");                        

		}
        System.out.print(" ");

	}
}
