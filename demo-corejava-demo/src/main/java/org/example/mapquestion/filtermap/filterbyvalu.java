package sortmapbykeyandvalue.filtermap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filterbyvalu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map<Integer, String> hosting = new HashMap<>();
        hosting.put(1, "linode.com");
        hosting.put(2, "heroku.com");
        hosting.put(3, "digitalocean.com");
        hosting.put(4, "aws.amazon.com");
        hosting.put(5, "aws2.amazon.com");

        
        
        Map<Integer, String> filteredMap = testbyval(hosting, x -> x.contains("linode"));
        System.out.println(filteredMap);
        Map<Integer, String> filteredMap4 = testbyval(hosting, x -> (x.length() <= 10));
        System.out.println(filteredMap4);

	}

	public static <k,v> Map<k,v> testbyval(Map<k,v> map,Predicate<v> pre) 
	{
		
		return map.entrySet().stream().filter(x->pre.test(x.getValue())).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
	}
	
}
