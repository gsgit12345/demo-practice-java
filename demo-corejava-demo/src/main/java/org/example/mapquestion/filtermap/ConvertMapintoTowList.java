package sortmapbykeyandvalue.filtermap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapintoTowList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        
        int a=9088;
        
        
        List<Integer> sortedKey=new ArrayList<>();
        List<String> valuemap=new ArrayList<>();

        valuemap= map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
        .peek(e->sortedKey.add(e.getKey())).map(x->x.getValue()).collect(Collectors.toList());
        
        System.out.println(valuemap);
        System.out.println(sortedKey);

	}

}
