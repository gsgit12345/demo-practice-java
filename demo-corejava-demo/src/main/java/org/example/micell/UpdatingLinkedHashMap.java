package org.example.micell;

import java.util.LinkedHashMap;

class UpdatingLinkedHashMap {
	  
    public static void main(String args[])
    {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm
            = new LinkedHashMap<Integer, String>();
  
        // Insert mappings using put() method
        hm.put(3, "Geeks");
        hm.put(2, "Geeks");
        hm.put(1, "Geeks");
  
        // print mappings to the console
        System.out.println("Initial map : " + hm);
  
        // Update the value with key 2
        hm.put(2, "For");
  
        // print the updated map
        System.out.println("Updated Map : " + hm);
    }
}
