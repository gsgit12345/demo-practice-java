package org.example.stream.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {
    public static void main(String str[])
    {
        Map<String,String> map = new HashMap<String,String>();
        map.put("Effective Java", "Kathy Sierra");
        map.put("Spring in Action", "Craig Walls");
        map.put("Hibernate in Action", "Gavin King");
        map.put("Pro Angular", "Freeman");
        map.put("Pro Spring Boot", "Felipe Gutierrez");
//if key is present then change

       String ke= map.computeIfPresent("Effective Java",(k,v)->"hello java");
       System.out.println(map);
       //key does not present then change

        map.computeIfAbsent("xyz.com",(k)->"Craig Wall");
        System.out.println(map);

    }
}
