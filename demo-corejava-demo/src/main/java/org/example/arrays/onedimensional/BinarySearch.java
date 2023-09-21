package practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for binary search array should be in sorted position

		int array[] = { 2, 3, 22, 30, 88, 89, 90, 95, 97, 98 };
		int low = 1;
		int high = array.length - 1;
		int key = 88;
		System.out.println(binarySearchIterative(array, key));
		System.out.println(array[4]);

	}

	public static int binarySearchIterative(int array[], int key) {
		int low = 1;
		int high = array.length;

		
		System.out.println("in search");
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == key)

				return mid;

			if (array[mid] < key)

				low = mid + 1;

			else

				high = mid - 1;

		}

		return -1;
	}

	static int binarySearch(int arr[], int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

}
