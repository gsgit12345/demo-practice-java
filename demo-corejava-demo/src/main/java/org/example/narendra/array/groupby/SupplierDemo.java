package org.example.narendra.array.groupby;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String str[]) {
        Supplier<List<String>> supplier = () -> {
            List<String> stringList = new ArrayList<>();
            stringList.add("hello");
            stringList.add("hello11");
            stringList.add("helloww");
            return stringList;
        };

        List<String> list = supplier.get();
        System.out.println(list.toString());

        Supplier<Item> itemSupplier = () ->
        {
            return new Item("karesh", 10, new BigDecimal(20));
        };

        Item it = itemSupplier.get();
        System.out.println(it.toString());
    }
}
