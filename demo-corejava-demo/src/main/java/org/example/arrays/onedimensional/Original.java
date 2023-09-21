package org.example.arrays.onedimensional;
class Original {
	 
    // This function takes first element as pivot, and
    // places all the elements smaller than the pivot on the
    // left side and all the elements greater than the pivot
    // on the right side. It returns the index of the last
    // element on the smaller side
	
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
 
        while (true)
        {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);
 
            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);
 
            // If two pointers met.
            if (i >= j)
                return j;
           
            // swap(arr[i], arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
             
        }
    }
 
    // The main function that
    // implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
           
            // pi is partitioning index,
            // arr[p] is now at right place
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }
 
    // Function to print an array
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(" " + arr[i]);
       
        System.out.println();
    }
 
    // Driver Code
    static public void main(String[] args)
    {
        int[] arr = { 10, 17, 18, 9, 11, 15 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
 
        printArray(arr, n);
    }
}
