package org.example.micell;

import java.util.HashMap;
import java.util.Map;

public class getkeyandvaluefrommap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Map<String, String> map = new HashMap<>();
        map.put("db", "oracle");
        map.put("username", "user1");
        map.put("password", "pass1");
        
      for(Map.Entry<String, String> key:map.entrySet())  
      {
    	  String k=key.getKey();
    	  String v=key.getValue();
    	  System.out.println("key:"+k+":value:"+v);
      }
        
map.forEach((k,v)->System.out.println("key is:"+k+":value is:"+v));
      
      

	}

}
