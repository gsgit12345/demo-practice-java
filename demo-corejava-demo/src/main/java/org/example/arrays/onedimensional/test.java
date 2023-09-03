package org.example.arrays.onedimensional;

import java.util.HashMap;

public class test {

    public static void main(String str[])
    {
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

        // Mapping int values to string keys
        hash_map.put("Geeks", 10);
        hash_map.put("4", 15);
        hash_map.put("Geeks", 20);
        hash_map.put("Welcomes", 25);
        hash_map.put("You", 30);

        System.out.println("hash_map::"+hash_map.get("8"));

    }
}
