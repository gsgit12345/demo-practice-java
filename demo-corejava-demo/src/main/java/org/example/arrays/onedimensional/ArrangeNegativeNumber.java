package executerdemo.practice;

public class ArrangeNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= {-1,-4,5,7,11,-23,99,-34,23,-90};

int arr[]=arrangeNegativeNumberAtOneSide(array);
//shiftall(array,0,array.length-1);

for(int i:arr)
{
	System.out.println(i);
}
	}

	
public static int[] arrangeNegativeNumberAtOneSide(int array[])
	{
		int j=0;
		int temp=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>0)
			{
				if(j!=i)
				{
					 temp=array[j];
					 array[j]=array[i];
					 array[i]=temp;
					 
					
				}
                     j++;
			}
			
			
		}
		return array;
	}

//negative elements on left side
static void shiftall(int[] arr, int left,
                  int right)
{
  
 // Loop to iterate over the
 // array from left to the right
 while (left <= right)
 {
      
     // Condition to check if the left
     // and the right elements are
     // negative
     if (arr[left] < 0 && arr[right] < 0)
         left++;

     // Condition to check if the left
     // pointer element is positive and
     // the right pointer element is negative
     else if (arr[left] > 0 && arr[right] < 0)
     {
         /*int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
         left++;
         right--;*/
    	 
     }

     // Condition to check if both the
     // elements are positive
     else if (arr[left] > 0 && arr[right] > 0)
         right--;
     else
     {
         left++;
         right--;
     }
 }
 
 for(int a:arr)
 {
	 System.out.println(a);
 }
}


}
