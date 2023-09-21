package org.example.micell;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoAccessOrderLinkedHashMap {
	 
    public static void main(String[] args) {
        Map<Integer, String> mapVehicleNoAndOwner = new LinkedHashMap<>(2,0.75f,true);
         
        mapVehicleNoAndOwner.put(1000, "Federer");
        mapVehicleNoAndOwner.put(2000, "Bradman");
        mapVehicleNoAndOwner.put(3000, "Jordan");
        mapVehicleNoAndOwner.put(4000, "Woods");
        mapVehicleNoAndOwner.put(5000, "Ali");
         
        System.out.println("1. Iterating default LinkedHashMap: ");
        demoIterate_AccessOrder(mapVehicleNoAndOwner);      
        int key = 1000;
        System.out.printf("2. Accessting value at key: %d is %s\n",key,mapVehicleNoAndOwner.get(key));
         
        key = 3000;
        System.out.printf("3. Accessting value at key: %d is %s\n",key,mapVehicleNoAndOwner.get(key));
         
        System.out.println("4. Iterating LinkedHashMap, least accessed to most accessed keys: ");
        demoIterate_AccessOrder(mapVehicleNoAndOwner);
         
    }
 
    private static void demoIterate_AccessOrder(Map<Integer, String> mapSportsPersonality) {
 System.out.println("after access::"+mapSportsPersonality);
        mapSportsPersonality.forEach((key, value) -> {
            System.out.println("Key:"+ key + ", Value:" + value);
        });     
    }
}