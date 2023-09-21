package practice.arrayques;

import java.util.Arrays;

//dutch national flag
//sorting zero 0,1,2 in ascending order
public class Sortarraycontaing0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		int arr2[] = sort_0_1_2_asc(arr);

		System.out.println(Arrays.toString(arr2));
	}

	public static int[] sort_0_1_2_asc(int array[]) {

		int first = 0;
		int second = 0;
		int third = 0;

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 0:
				first++;
				break;
			case 1:
				second++;
				break;
			case 2:
				third++;
				break;
			}
		}

		int i = 0;
		while (first > 0) {
			array[i++] = 0;
			first--;
		}

		while (second > 0) {
			array[i++] = 1;
			second--;
		}
		while (third > 0) {
			array[i++] = 2;
			third--;
		}
		return array;
	}

}
