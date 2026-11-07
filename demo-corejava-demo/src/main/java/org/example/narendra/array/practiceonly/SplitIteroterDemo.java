package org.example.narendra.array.practiceonly;

import java.util.Arrays;
import java.util.List;

public class SplitIteroterDemo {
    public static void main(String str[])
    {
        List<Integer> integerList= Arrays.asList(2,1,2,3,4,4,5);

       long ll= integerList.spliterator().estimateSize();
       integerList.spliterator().forEachRemaining(x->System.out.println(x));

        System.out.println(ll);
    }
}
