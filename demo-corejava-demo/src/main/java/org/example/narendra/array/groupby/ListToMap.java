package org.example.narendra.array.groupby;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String str[]) {
        List<Item> item = CountSumOfQuantity.getList();

        Map<String, BigDecimal> listMap = item.stream().collect(Collectors.
                toMap(Item::getName, Item::getPrice, (a, b) -> a));
        System.out.println(listMap.toString());

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        List<Integer> intt = list.stream().mapToInt(a -> a * 10).boxed().collect(Collectors.toList());

        Consumer<List<Integer>> listConsumer = (list1) ->
        {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, i + 23);
            }
        };
        Consumer<List<Integer>> display = (lisy) -> System.out.println(lisy.toString());
        listConsumer.andThen(display);

        System.out.println(intt.toString());

        Consumer<Integer> integerConsumer=(a)->System.out.println(a);
        integerConsumer.accept(10);

    }

}
