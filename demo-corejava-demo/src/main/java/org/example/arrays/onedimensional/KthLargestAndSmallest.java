package org.example.arrays.onedimensional;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestAndSmallest {
    public static void main(String str[]) {
        int array[] = {4, 5, 2, 6, 7};
        String[] strr = new String[]{"Yuri", "Interview", "Nordstrom", "Cat", "Dog", "Telephone", "AVeryLongString", "This code puzzle is easy"};

        int kthlargest = 0;
        int ktsmall = 0;
        int largest = kthLargest(array, kthlargest);
        System.out.println("kth largest::" + largest);
        int small = kthSmallest(array, ktsmall);
        System.out.println("kth small::" + small);
        usingArrayKthSmallestAndLargest(array, kthlargest);
        String longeststr=kthLongestString(strr,kthlargest);
        System.out.println("longest string::"+longeststr);
    }

    public static int kthLargest(int[] array, int kthlarge) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i <= kthlarge; i++) {
            queue.add(array[i]);
        }
        for (int i = kthlarge; i < array.length; i++) {
            if (queue.peek() < array[i]) {
                queue.poll();
                queue.add(array[i]);
            }
        }
        return queue.peek();
        //in case of the largest or by default queue implement the  min heap.
    }

    public static String kthLongestString(String[] array, int kthlarge) {
        PriorityQueue<String> queue = new PriorityQueue<>((a, b)->b.length()-a.length());//here if you are doing ,you will find ktlangeststring
       // PriorityQueue<String> smallest = new PriorityQueue<>((a, b)->a.length()-b.length());//here if you are doing ,you will find ktsmalleststring


        for(String strr:array)
        {
            queue.add(strr);
        }
        if(kthlarge>0)
        {
            queue.poll();
            kthlarge--;
        }
       return  queue.peek();
    }

    public static int kthSmallest(int array[], int ktsmall) {
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());
        for (int i = 0; i <= ktsmall; i++) {
            queue.add(array[i]);
        }
        System.out.println(queue.toString());
        for (int i = ktsmall; i < array.length; i++) {
            if (queue.peek() > array[i]) {
                queue.poll();
                queue.add(array[i]);
            }
        }
        return queue.peek();

    }
//in case of the largest or by default queue implement the  max heap.

    public static int usingArrayKthSmallestAndLargest(int array[], int kthLargest) {
        int length = array.length;
        int largest=0;
        for (int j = 0; j < length - 1; j++) {
            // Checking the condition for two
            // simultaneous elements of the array
          /*  if (array[j] > array[j + 1]) {  //this is to find kthsmallest
*/                // Swapping the elements.
            if (array[j] < array[j + 1]) {   //to find the kthsmallets
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
            if(j==kthLargest-1)
            {
                largest=array[kthLargest];

            }
        }
            System.out.println("largest is :;"+largest);
            return 0;
        }
    }

