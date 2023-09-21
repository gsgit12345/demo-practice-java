package sortmapbykeyandvalue.filtermap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class convertmaptolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hosting = new HashMap<>();
        hosting.put(1, "linode.com");
        hosting.put(2, "heroku.com");
        hosting.put(3, "digitalocean.com");
        hosting.put(4, "aws.amazon.com");
        hosting.put(5, "aws2.amazon.com");
        
        List<Integer> maplist=hosting.keySet().stream().collect(Collectors.toList());
        System.out.println(maplist);
        
        List<String> mapvalue=hosting.values().stream().collect(Collectors.toList());
        System.out.println(mapvalue);

	}

}
