package sortmapbykeyandvalue.filtermap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        
        
   List<String>  mAPLIST= map.values().stream().filter(x-> 
   !"apple".equalsIgnoreCase(x)).collect(Collectors.toList());

System.out.println(mAPLIST);
	}

}
