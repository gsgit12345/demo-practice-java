package sortmapbykeyandvalue.filtermap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class filtermap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map<Integer, String> hosting = new HashMap<>();
        hosting.put(1, "linode.com");
        hosting.put(2, "heroku.com");
        hosting.put(3, "digitalocean.com");
        hosting.put(4, "aws.amazon.com");
        
     Map<Integer,String>   cltm=hosting.entrySet().stream().filter(x->x.getValue().equals("linode.com")).
        collect(Collectors.toMap(k-> k.getKey(),e->e.getValue()));
     
     System.out.println(cltm);

     String  result="";
     result = hosting.entrySet().stream()
             .filter(x -> {
                 if (!x.getValue().contains("amazon") && !x.getValue().contains("digital")) {
                     return true;
                 }
                 return false;
             })
             .map(map -> map.getValue())
             .collect(Collectors.joining(","));

     
     System.out.println(result);
	}

}
