package org.example.narendra.array.groupby;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class ConsumerDemo {
    public static void main(String str[])
    {
        BiConsumer<Item,Item> biConsumer=(a,b)->System.out.println(a.getName()+b.getName());

        Item item=new Item("ramesh",10,new BigDecimal(20));
        Item item2=new Item("suresh",20,new BigDecimal(120));
        biConsumer.accept(item,item);


    }
}
