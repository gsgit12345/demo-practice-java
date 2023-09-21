package misc;
import java.util.HashMap;
import java.util.Map;

import pojo.*;
public class HashCheckDemo {
	public static void main (String[] args)  
    { 
          
        // creating two Objects with  
        // same state 
		HashCheck g1 = new HashCheck("aditya", 1); 
		HashCheck g2 = new HashCheck("aditya", 1); 
          
        Map<HashCheck, String> map = new HashMap<HashCheck, String>(); 
        map.put(g1, "CSE"); 
        map.put(g2, "IT"); 
          
        for(HashCheck geek : map.keySet()) 
        { 
            System.out.println(map.get(geek).toString()); 
        } 
  
    } 
}
