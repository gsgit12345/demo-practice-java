package org.example.narendra.array.practiceonly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String str[]) {
        List<Integer> arraysLis = Arrays.asList(1, 2, 6, 7, 34, 89, 12, 88);
//printin all even numbefr
        List<Integer> oddeven = arraysLis.stream().reduce(new ArrayList(),
                (a, b) -> {
                    if (b % 2 == 0)
                        a.add(b);
                    return a;
                },
                (a, b) -> {
                    a.addAll(b);
                    return a;
                }
        );

        int re=0%2;
        System.out.println(re);

        System.out.println(oddeven);
    }
}
