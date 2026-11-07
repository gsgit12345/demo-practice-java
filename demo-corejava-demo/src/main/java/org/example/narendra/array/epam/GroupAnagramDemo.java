package org.example.narendra.array.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramDemo {
    public static void main(String str[]) {
        String arr[] = {"cat", "dog", "tac", "god", "act" };
        printAnagram(arr);

    }

    public static void printAnagram(String arr[]) {
        HashMap<String, List<String>> listHashMap = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            String st = arr[i];
            Arrays.sort(arr);

            if (listHashMap.containsKey(st)) {
                listHashMap.get(st).add(st);
            } else {
                ArrayList<String> str = new ArrayList<String>();
                str.add(st);
                listHashMap.put(st, str);
            }
        }

        for(List<String> ss:listHashMap.values())
        {
            System.out.println(ss.toString());
        }
    }
}
