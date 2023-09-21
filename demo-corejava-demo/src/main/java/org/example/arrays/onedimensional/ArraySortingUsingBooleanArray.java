package ArrayQuestion;

import java.util.Arrays;
//Java program to test whether an array
//can be sorted by swapping adjacent
//elements using boolean array

public class ArraySortingUsingBooleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[] = { 1, 2, 5, 3, 4, 6 };
        boolean B[] = { false, true, true, true, false };
        int n = A.length;
 
        if (sortedAfterSwap(A, B, n)) {
            System.out.println("A can be sorted");
        }
        else {
            System.out.println("A can not be sorted");
        }

        int[] array = { 1, 2, 5, 3, 4, 6 };
        int[] array2 = { 0, 1, 1, 1, 0 };
        int n1 = array.length;
     
        if (method2(array, array2, n1) == 0)
            System.out.println("A can be sorted");
        else
            System.out.println("A can not be sorted");
  
        
        
        
	}

	static boolean sortedAfterSwap(int A[], boolean B[], int n) {
		int i, j;

		// Check bool array B and sorts
		// elements for continuous sequence of 1
		for (i = 0; i < n - 1; i++) {
			if (B[i]) {
				j = i;
				while (B[j]) {
					j++;
				}
				// Sort array A from i to j
				Arrays.sort(A, i, 1 + j);
				i = j;
			}
		}

		// Check if array is sorted or not
		for (i = 0; i < n; i++) {
			if (A[i] != i + 1) {
				return false;
			}
		}

		return true;
	}

	public static int method2(int array[],int array2[],int n)
	{
        int t = 0;
        for (int i = 0; i < n - 1; i++)
        {
            if (array2[i] != 0)
            {
                if (array[i] != i + 1)
                    t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;
            }
        }
     
        // Check if array is sorted or not
        for (int i = 0; i < n; i++)
        {
            if (array[i] != i + 1)
                return 0;
        }
     
        return 1;

	}
	
}
