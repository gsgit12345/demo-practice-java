package org.example.micell;
import java.util.HashMap;
import java.util.Map;

public class HashCheckDemo {
	public static void main (String[] args)  
    { 
          
        // creating two Objects with  
        // same state 
		pojo.HashCheck g1 = new pojo.HashCheck("aditya", 1);
		pojo.HashCheck g2 = new pojo.HashCheck("aditya", 1);
          
        Map<pojo.HashCheck, String> map = new HashMap<pojo.HashCheck, String>();
        map.put(g1, "CSE"); 
        map.put(g2, "IT"); 
          
        for(pojo.HashCheck geek : map.keySet())
        { 
            System.out.println(map.get(geek).toString()); 
        } 
  
    } 
}
