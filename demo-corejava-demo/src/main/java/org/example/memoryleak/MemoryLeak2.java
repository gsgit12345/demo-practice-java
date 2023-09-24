package org.example.memoryleak;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeak2 {
    public static void main(String string[])
    {
        Map<person, Integer> map = new HashMap<>();
        for(int i=0; i<100; i++) {
            map.put(new person("jon"), 1);
        }
        if(map.size() == 1){
            System.out.println("size is one");
        }else {
            System.out.println("size is not one"+map.size());
        }
//since we haven’t defined the proper equals() method, the duplicate objects pile up and increase the memory
    }
}
