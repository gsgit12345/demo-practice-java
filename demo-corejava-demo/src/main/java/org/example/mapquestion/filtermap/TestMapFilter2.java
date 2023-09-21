package sortmapbykeyandvalue.filtermap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestMapFilter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<Integer, String> hosting = new HashMap<>();
        hosting.put(1, "linode.com");
        hosting.put(2, "heroku.com");
        hosting.put(3, "digitalocean.com");
        hosting.put(4, "aws.amazon.com");
        
        
      Map<Integer,String>  sort= hosting.entrySet().stream().filter(Predicate.isEqual("linode.com"))
        .collect(Collectors.toMap(k->k.getKey(), e->e.getValue()));
      
      Map<Integer,String>  sort2=  hosting.entrySet().stream().filter(map->map.getKey()==2).collect(Collectors.toMap(k->k.getKey(),e->e.getValue()));
      
      
      Map<Integer,String>  sort3=  hosting.entrySet().stream().filter(map->map.getKey()==3).
    		  collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
      
      System.out.println(sort2);

	}

}
