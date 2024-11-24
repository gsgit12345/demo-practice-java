package org.example.arrays.onedimensional.arrayQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArrays {
    public static void main(String str[]) {
        String Array1[] = {"Article", "for", "Geeks", "for", "Geeks", "hello", "how" };
        String Array2[] = {"Article", "Geeks", "Geeks" };
        // Output: [Article, Geeks]


        String Array3[] = {"a", "b", "c", "d", "e", "f" };
        String Array4[] = {"b", "d", "e", "h", "g", "c" };
        //Output: [b, c, d, e]

        //Time Complexity: O(m * n) where m and n are lengths of the input arrays.
        // Auxiliary Space: O(d) where d is the number of common elements.
        //https://www.geeksforgeeks.org/java-program-to-find-common-elements-between-two-arrays/

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{1, 3, 4, 5, 6, 9, 8};
        Set<Integer> hashint = findCommonElementsInteger(arr1, arr2);
        /* expected output {1,3,4,5,6}
           coming from the above written code
           that is right if not please correct me
        */
        System.out.println("Integer array:::" + hashint.toString());
        HashSet<String> set = (HashSet<String>) findCommonElementBetweenTwoArray(Array3, Array4);
        System.out.println("String array:::" + set.toString());

        findTheCommonElementBetweenArray(arr1,arr2);
    }

    public static Set<Integer> findCommonElementsInteger(int array[], int array2[]) {
        Set<Integer> hashset = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    hashset.add(array[i]);
                    break;
                }
            }
        }
        return hashset;
    }
public static void findTheCommonElementBetweenArray(int array[],int array2[])
{
   List<Integer> array1=  Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    List<Integer> array3=  Arrays.asList(1, 3, 4, 5, 6, 9, 8);

   List<Integer> unique= (List<Integer>) array1.stream().filter(array3::contains).collect(Collectors.toList());

   System.out.println("unique element is:::"+unique.toString());


}
    public static Set<String> findCommonElementBetweenTwoArray(String array[], String array1[]) {
        Set<String> hashSet = new HashSet<String>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array[i].equalsIgnoreCase(array1[j])) {
                    hashSet.add(array[i]);
                    break;
                }
            }
        }
        return hashSet;

    }
}
