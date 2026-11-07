package org.example.narendra.array.groupby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountSumOfQuantity {
    public static void main(String str[]) {
        List<Item> item = getList();
        Map<String, Integer> sumingInt = item.stream().collect(Collectors.groupingBy(ite -> ite.getName(), Collectors.summingInt(x->x.getQty())));
        System.out.println(sumingInt.toString());

        //group by price
        Map<BigDecimal, List<Item>> groupbyprice = item.stream().
                collect(Collectors.groupingBy(ite->ite.getPrice()));
        System.out.println(groupbyprice.toString());
        //group by then mapping and convert into set

     Map<BigDecimal, Set<String>>  convertInto= item.stream().collect(Collectors.groupingBy
             (it->it.getPrice(),Collectors.mapping(i->i.getName(),Collectors.toSet())));
        System.out.println(convertInto.toString());

    }

    public static List<Item> getList() {
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        return items;
    }
}
