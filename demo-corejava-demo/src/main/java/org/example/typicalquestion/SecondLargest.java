package org.example.typicalquestion;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,34,45,23,67,89,34,87};
findSecondLargest(arr);
	}
	
	public static void findSecondLargest(int arr[])
	{
		int Largest=arr[0];
		
		int secondLargest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>Largest)
			{
				secondLargest=Largest;
				Largest=arr[i];		
			}
			else if(arr[i]>secondLargest)
			{
				secondLargest=arr[i];
			}
		}
		
		
		System.out.println("Largest:"+Largest+":secondLargest:"+secondLargest);
	}

}
