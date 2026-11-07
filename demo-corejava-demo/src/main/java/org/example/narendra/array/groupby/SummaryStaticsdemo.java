package org.example.narendra.array.groupby;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SummaryStaticsdemo {
    public static void main(String str[])
    {
        int[] sum={2,3,4,5,12,34,56};
     IntSummaryStatistics summaryStatistics=IntStream.of(sum).summaryStatistics();

          System.out.println(summaryStatistics.toString());
          System.out.println(summaryStatistics.getMax());

    }
}
