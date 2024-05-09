package org.example.Collection;

import java.util.HashMap;
import java.util.Map;

public class CollisionInHashMapDemo {
    //https://www.baeldung.com/java-hashmap-advanced#:~:text=A%20collision%2C%20or%20more%20specifically,bucket%20location%20or%20array%20index.
    public static void main(String str[])
    {
        Map<MyKey,String> hashMap=new HashMap<>();
        MyKey k1 = new MyKey(1, "firstKey");
        MyKey k2 = new MyKey(2, "secondKey");
        MyKey k3 = new MyKey(2, "thirdKey");

        hashMap.put(k1,"firstvalue");
        hashMap.put(k2,"secondvalue");
        hashMap.put(k3,"thirdvalue");

        System.out.println("get:"+hashMap.get(k1));
        System.out.println("get:"+hashMap.get(k2));
        System.out.println("get::"+hashMap.get(k3));

    }

}
