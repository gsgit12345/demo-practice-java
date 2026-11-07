package org.example.narendra.array.practiceonly;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndParallelStreamDemo {

    public static void main(String str[])
    {
       List<String> dd=Arrays.asList("I am not a person","how");

       // dd.stream().forEach(System.out::println);

        dd.parallelStream().forEach(System.out::println);

    }
}
