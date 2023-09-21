package org.example.algorithmn;

public class maxproduct {

	public static void main(String str[])
	{
		int[] arr = { 52, 12, 34, 10, 6, 40, 0, 12, 40, 52, -56, -78, -99, 68 };
		int max=findMaxProduct(arr);
		
		System.out.println("max is::"+max);
	}
	
	public static int findMaxProduct(int arr[])
	{
		int firstMax = 0, secondMax = 0;
        int firstNegMax = 0, secondNegMax = 0;
		
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]<0)
        	{
        		secondNegMax = firstNegMax;
                firstNegMax = arr[i];
        		if(arr[i]>firstNegMax)
        		{
        			secondNegMax=firstNegMax;
        			firstNegMax=arr[i];
        		}else if(arr[i]>secondNegMax)
        		{
        			secondNegMax=arr[i];
        		}
        	}
        	
        	if(arr[i]>=0)
        	{
        		if(arr[i]>firstMax)
        		{
        			secondMax=firstMax;
        			firstMax=arr[i];
        		}else if(arr[i]>secondMax)
        		{
        			secondMax=arr[i];
        		}
        	}
        	
        }
        
        
        int positivemax=firstMax*secondMax;
        System.out.println("first positive max::"+firstMax+"second positive max::"+secondMax+"max is:;"+positivemax);
        
        int negativeMath=firstNegMax*secondNegMax;
        System.out.println("first negativbe max::"+firstNegMax+"second negative max::"+secondNegMax+"max is :;"+negativeMath);

		return 0;
	}
}
