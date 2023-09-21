package algorithm.sorting;

import java.util.Arrays;

public class MergeSortMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 12, 11, 13, 5, 6, 7, 1, 2, 4, 22, 55, 100, 0 };
		MergeSortMy pp = new MergeSortMy();
		pp.mergeSort(array, 0, array.length - 1);

		System.out.println(Arrays.toString(array));
		for (int m : array) {
			System.out.println(m);
		}
	}

	public void mergeSort(int array[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			mergeTwoArray(array);
		}
	}

	private void mergeTwoArray(int[] array) {

		if (array.length > 1) {
			int mid = array.length / 2;

			int Left[] = new int[mid];
			int Right[] = new int[array.length - mid];

			for (int i = 0; i < mid; i++)

				Left[i] = array[i];

			for (int j = mid; j < array.length; j++)

				Right[j - mid] = array[j];

			mergeTwoArray(Left);
			mergeTwoArray(Right);

			int j = 0;
			int k = 0;
			int i = 0;
			while (i < Left.length && j < Right.length) {
				if (Left[i] <= Right[j]) {
					array[k] = Left[i];
					i++;

				} else {
					array[k] = Right[j];
					j++;
				}
				k++;
			}

			while (i < Left.length) {
				array[k] = Left[i];
				i++;
				k++;
			}

			while (j < Right.length) {
				array[k] = Right[j];

				j++;
				k++;
			}

		}

	}
}
