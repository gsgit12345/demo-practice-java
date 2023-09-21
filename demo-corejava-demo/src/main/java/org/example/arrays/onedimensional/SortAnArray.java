package ArrayQuestion;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int []arr = {10, 7, 9, 2, 8,
                3, 5, 4, 6, 1};
int n = arr.length;

// for sort an array
int arr2[]=sortArrayNtoN(arr, n);

// for print all the
// element in sorted way
for (int i = 0; i < n; i++)
System.out.print(arr2[i] + " ");
}

	public static int[] sortArrayNtoN(int array[],int n)
	{
        for (int i = 0; i < n; i++)
        {
        	array[i]=i+1;
            
        }
    	return array;

	}
	
}
