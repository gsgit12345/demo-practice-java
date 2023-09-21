package org.example.micell;

public class bubblesort {

	public static void main(String[] args) {
		int array[]= {23,89,1,34,56,0,89,15,87};
		
	int arr[]=	getArray(array);
	bubbleSort(array,array.length);
	for(int c:arr)
	{
		System.out.println("sorted::"+c);
	}

	}

	
	public static  int[] getArray(int array[])
	{
		boolean  flag=true;
		
		//int temp=0;
		
		while(flag)
		{
			flag=false;
			
			for(int i=0;i<array.length-1;i++)
			{
			if(array[i]<=array[i+1])
			{
				int temp=array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
				flag=true;
			}
			}
			if (flag == false) 
	             break; 
		}
		 
		
		return array;
	}
	
	static void bubbleSort(int arr[], int n) 
    { 
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
        
        for(int c:arr)
    	{
    		System.out.println("sorted::"+c);
    	}   
        
    } 
	
	
}
