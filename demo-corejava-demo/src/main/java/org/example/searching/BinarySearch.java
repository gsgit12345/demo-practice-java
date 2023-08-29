package org.example.searching;

public class BinarySearch {
    public static void main(String str[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // binarySearch(arr);
        int low = 0;
        int high = arr.length - 1;

        int searchKey = 2;

        int index = binarySearchUsingRecursion(low, high, searchKey, arr);
        System.out.println("index is::" + index + ":and value is::" + arr[index]);
    }

    public static void binarySearch(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        System.out.println(mid);
        int key = 8;

        while (low <= high) {
            if (array[mid] == key) {
                System.out.println("element is found at index:" + mid + ":and element:" + array[mid]);
                break;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("element is not available");
        }
    }

    public static int binarySearchUsingRecursion(int low, int high, int key, int array[]) {
        int mid = (low + high) / 2;
        if (low == high) {
            if (array[low] == key)
                return low;
            else
                return -1;
            //the above algorithm is for the small problem.means array  contains only one element.
        } else {
            //if array does not contain one element.means for the big element

            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key)
                return binarySearchUsingRecursion(mid + 1, high, key, array);  //search in righ hand side because mid is smaller than the search key
            else
                return binarySearchUsingRecursion(low, mid - 1, key, array);//search in left hand side because mid is bigger than the search key
        }
    }
}
