package hashmapexam;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IdentityHashMapExample {
    
    public static void main(String[] args) { 
 
           
       // Created HashMap and IdentityHashMap objects

        Map hashmapObject = new HashMap();
        Map identityObject = new IdentityHashMap();
        
       
       // Putting  keys and values in HashMap and IdentityHashMap Object

        hashmapObject.put(new String("key") ,"Google"); 
        hashmapObject.put(new String("key") ,"Facebook"); 
       

        identityObject.put(new String("identityKey") ,"Google"); 
        identityObject.put(new String("identityKey") ,"Facebook"); 
        identityObject.put(new String("identityKey") ,"Facebook"); 

        // Print HashMap and IdentityHashMap Size : After adding  keys
       
        System.out.println("HashMap after adding key :"+ hashmapObject);
        System.out.println("IdentityHashMap after adding key :"+ identityObject); 
        
        TreeMap<Integer, Integer> kk=new TreeMap<>();
        
        String s1="java";
        String s2="java";
        s1="c++";
        System.out.println("s1:"+s1+":s2:"+s2);
        
                            
 }
}
