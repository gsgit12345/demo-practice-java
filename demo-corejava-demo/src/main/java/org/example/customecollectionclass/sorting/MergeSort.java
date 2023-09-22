package org.example.customecollectionclass.sorting;

import java.util.Arrays;

/* Java program for Merge Sort */
class MergeSort {
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]

	void mergeArray(int arr[]) {
		// Find sizes of two subarrays to be merged

		if (arr.length > 1) {
			int mid = arr.length / 2;

			int Left[] = new int[mid];
			int Right[] = new int[arr.length - mid];
			/* Copy data to temp arrays */
			for (int i = 0; i < mid; i++)
				Left[i] = arr[i];
			for (int j = mid; j < arr.length; j++)
				Right[j - mid] = arr[j];

			mergeArray(Left);
			mergeArray(Right);

			/* Merge the temp arrays */

			// Initial indexes of first and second subarrays
			int i = 0, j = 0;

			// Initial index of merged subarry array

			int k = 0;
			while (i < Left.length && j < Right.length) {
				if (Left[i] <= Right[j]) {
					arr[k] = Left[i];
					i++;
				} else {
					arr[k] = Right[j];
					j++;
				}
				k++;
			}

			/* Copy remaining elements of L[] if any */
			while (i < Left.length) {
				arr[k] = Left[i];
				i++;
				k++;
			}

			/* Copy remaining elements of R[] if any */
			while (j < Right.length) {
				arr[k] = Right[j];
				j++;
				k++;
			}
		}

	}

	// Main function that sorts arr[l..r] using
	// merge()
	void mergeSort(int arr[], int left, int right) {
		
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;
			// Sort first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			// Merge the sorted halves
			mergeArray(arr);
		}
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7, 1, 2, 4, 22, 55,100,0 };
		System.out.println("Given Array");

		MergeSort ob = new MergeSort();
		ob.mergeSort(arr, 0, arr.length - 1);

		
	//	[1, 2, 4, 5, 6, 7, 11, 12, 13, 22, 55]
		//[0, 1, 2, 4, 5, 6, 7, 11, 12, 13, 22, 55, 100]
System.out.println(Arrays.toString(arr));
		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println("\nSorted array");

	}
}
/* This code is contributed by Rajat Mishra */
