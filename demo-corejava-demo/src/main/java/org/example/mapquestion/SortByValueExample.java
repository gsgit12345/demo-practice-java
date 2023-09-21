package sortmapbykeyandvalue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        unsortMap.put("l", 90);
        unsortMap.put("p", 0);
        unsortMap.put("t", 101);
        unsortMap.put("h", 191);
        System.out.println("Original...");
        System.out.println(unsortMap);
        
      LinkedHashMap<String, Integer>  sorted= unsortMap.entrySet().stream().
    		  sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue ,(old,newv)->old,LinkedHashMap::new));
      System.out.println("after sorting................................");
    //  System.out.println(sorted);
      
      
     Map<String,Integer> second=new LinkedHashMap<>();
     
     unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
     forEachOrdered(x->second.put(x.getKey(),x.getValue()));
     System.out.println(second);

	}

}
