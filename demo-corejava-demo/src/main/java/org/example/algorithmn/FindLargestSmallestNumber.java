package org.example.algorithmn;

public class FindLargestSmallestNumber {

	 public static void main(String[] args) {

	  //numbers array
	  int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};

	  //assign first element of an array to largest and smallest
	  int smallest = numbers[0];
	  int largetst = numbers[0];

	  for (int i = 1; i< numbers.length; i++) {
	   if (numbers[i]> largetst)
	    largetst = numbers[i];
	   else if (numbers[i]< smallest)
	    smallest = numbers[i];
	  }

	  System.out.println("Largest Number is : " + largetst);
	  System.out.println("Smallest Number is : " + smallest);
	 }
	}