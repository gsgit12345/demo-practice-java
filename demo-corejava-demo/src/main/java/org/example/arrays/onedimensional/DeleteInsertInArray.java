package org.example.arrays.onedimensional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteInsertInArray {
    public static void main(String str[]) {
        int array[] = {3, 2, 6, 7, 8, 12};

        // deleteElementFromArray(array,deleteindx);

        // deleteElementFromArrayDifferentApproach(array,deleteindx);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pos = 11;
        int value = 4;
        System.out.println("arraylength::" + arr.length);
       // insertAtSpecificPosition(arr, value, pos);

        insertElementInSortedArray(array,value);
    }

    public static int[] deleteElementFromArray(int array[], int index) {
        int length = array.length;
        int newarr[] = new int[array.length - 1];
        int k = 0;

        // if(array==null || index>array.length || index<0)
        // return array;
        for (int i = 0; i < length; i++) {
            if (array[i] == index) //delete by value
            // if (i == index) //delete by index
            {
                continue;
            }

            newarr[k++] = array[i];

            /*              if(array[i] !=index *//*||array ==null|| index<0 ||array.length>index*//*)
              {
                throw new IllegalArgumentException("Value not found in the array");
            }*/
        }
        System.out.println(Arrays.toString(newarr));
        return newarr;
    }

    public static void deleteElementFromArrayDifferentApproach(int array[], int index) {

        int deletebyindex[] = IntStream.range(0, array.length).filter(i -> i != index).map(i -> array[i]).toArray(); //delete by index
        int deletebyvalue[] = IntStream.range(0, array.length).filter(i -> index != array[i]).map(i -> array[i]).toArray();//delete by value
        System.out.println(Arrays.toString(deletebyvalue));

        //useing arraylist

        ArrayList<Integer> arrayList = (ArrayList) Arrays.stream(array).boxed().collect(Collectors.toList());

        arrayList.remove(index); //delete by index
        arrayList.remove(new Integer(index));//delete by value

        int removed[] = arrayList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("using arraylist::" + Arrays.toString(removed));
    }

    public static void insertAtSpecificPosition(int array[], int value, int pos) {
        int len = array.length + 1;
        int newarr[] = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < pos - 1)  //copy the value in new array from old array till position
            {
                newarr[i] = array[i];
            } else if (i == pos - 1) //if in old array.you find the position.insert the value at the position
            {
                newarr[i] = value;
            } else {
                newarr[i] = array[i - 1]; //copy the rest of the value from old array into new array
            }
        }
        System.out.println(Arrays.toString(newarr));

        //second way
        Integer objectArray[] = {new Integer(2), new Integer(3), new Integer(4), new Integer(7), new Integer(9), new Integer(10)};
        List<Integer> list = new ArrayList<>(
                Arrays.asList(objectArray));
        int position = 2;
        int element = 12;
        // Adding the element at position
        list.add(position - 1, element);
        System.out.println("after adding the element::" + list.toString());

    }
    public static void insertElementInSortedArray(int array[],int value)
    {

        Arrays.sort(array);
int j=0;
int i=0;

        int newarray[]=new int[array.length+1];
        for (i = 0; i < newarray.length; i++) {

            if (value <= array[i]) {
                newarray[i] = value;
                break;
            }
            else {
                newarray[i] = array[j++];
            }

        }

        // copy the remaining elements
        for (int k = i + 1; k < newarray.length; k++)
            newarray[k] = array[j++];


        System.out.println(Arrays.toString(newarray));
//second way
        Integer arr[] = { 6, 7, 8, 12, 3, 4, 5, 9, 10 };

        Set<Integer> sets
                = new HashSet<Integer>(Arrays.asList(arr));

        sets.add(1);

        arr = sets.toArray(arr);

        // print the array
        System.out.println("set is::"+Arrays.toString(arr));

    }

}
