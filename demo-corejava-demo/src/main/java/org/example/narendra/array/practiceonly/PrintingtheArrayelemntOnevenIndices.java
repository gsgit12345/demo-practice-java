package org.example.narendra.array.practiceonly;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintingtheArrayelemntOnevenIndices {
    public static void main(String str[])
    {
        String arr[]={"hello","how","are","you","where","you","are","going"};

        AtomicInteger integer=new AtomicInteger(0);
       List<String> valueAtEvenIndex= Stream.of(arr).filter(x->integer.incrementAndGet()%2==0).collect(Collectors.toList());
       System.out.println(valueAtEvenIndex.toString());


        Stream<String> myStream = Stream.of(arr);

        // create an AtomicInteger
        AtomicInteger i = new AtomicInteger(0);

        // increment the i value by 1 everytime
        // if it is even, print the current element
       List<String> sec= myStream.filter(x -> i.getAndIncrement() % 2 == 0).collect(Collectors.toList());

        System.out.println(sec.toString());


    }

}
