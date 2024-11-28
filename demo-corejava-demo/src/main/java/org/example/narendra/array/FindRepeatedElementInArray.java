package org.example.narendra.array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindRepeatedElementInArray {
    public static void main(String str[]) {
        Integer a[] = {2, 2, 3, 3, 4, 4, 5, 5, 6,7,9};
Set<Integer> set=allDuplicate(a);
        // int uni= (char)  findNonRepeatedValuUsingXOR(a);
     System.out.println(set);
    }
public static Set<Integer> allDuplicate(Integer arr[])
{
    Set<Integer> inset=new HashSet<>();

    Set<Integer>  result= Arrays.stream(arr).filter(b->!inset.add(b)).collect(Collectors.toSet());
return  result;
}
    public static int findFirstNonRepeatedValuUsingXOR(int array[])
    {
        int unique=0;
        for(int a:array)
        {
            unique=unique^a;
        }
        return unique;
    }
    public int findFirstNonRepeatedValu(int array[])
    {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int b : array) {
            if (countMap.containsKey(b)) {
                int count = countMap.get(b);
                count += 1;
                countMap.put(b, count);
            } else {
                countMap.put(b, 1);
            }
        }
        int fre = array[0];

        for (int key : countMap.keySet()) {
            if (countMap.get(key) < countMap.get(fre)) {
                fre = key;
            }
        }
        System.out.println("value :" + fre + ":frequency :" + countMap.get(fre));
    return fre;
    }
}
