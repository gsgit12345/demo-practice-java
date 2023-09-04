package org.example.arrays.onedimensional;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyInArray {
    public static void main(String str[]) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(13);
        array.add(30);
       // System.out.println(array.toString());
     //   modifiedCollection(array);
      //  System.out.println(array.toString());

        int intAray[] = {1, 2, 3, 4, 2, 2, 3, 1};
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

        //   findFrequencyInArray(intAray);
        int n = intAray.length;
        //  findFrequencyInSecondWay(arr, n);

        String word[] = {"hello", "hello", "hi", "how", "how", "hi","hi", "going", "going"};
        //   findFRequencyInWordArray(word);
        findFRequencyInWordArrayInNaiveWay(word);
        String strch="hello ho are you";
        findFrquencyInCharArray(strch);

    }

    public static void findFrequencyInArray(int array[]) {
        int frequency[] = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited) {
                frequency[i] = count;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited) {
                System.out.println(array[i] + ":find the frequency in array:" + frequency[i]);
            }
        }
    }

    public static void findFrequencyInSecondWay(int array[], int n) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        System.out.println(hashMap.toString());

    }

    public static void findFRequencyInWordArray(String array[]) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        System.out.println(hashMap.toString());
    }

    public static void findFRequencyInWordArrayInNaiveWay(String array[]) {
        int[] frequency = new int[array.length];
        int fre = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    count++;
                    frequency[j] = fre;
                }
            }
            if (frequency[i] != fre) {
                frequency[i] = count;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i]!=fre) {
                System.out.print(array[i] + "::" + frequency[i]);
            }
        }

    }

    public static void findFrquencyInCharArray(String strch)
    {
        char array[]=strch.toCharArray();
        int freq=-1;
        int frquency[]=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            int count=1;
            for(int j =i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    count++;
                    frquency[j]=freq;

                }
            }
            if(frquency[i]!=freq)
            {
                frquency[i]=count;
            }
        }
        for(int i=0;i<frquency.length;i++)
        {
            if(frquency[i]!=freq) {
                System.out.print(array[i] + ":|:" + frquency[i]);
            }
        }

    }
    public static void modifiedCollection(ArrayList array) {
        array.add(90);
    }
}
