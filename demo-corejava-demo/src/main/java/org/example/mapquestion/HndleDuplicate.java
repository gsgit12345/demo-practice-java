package sortmapbykeyandvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HndleDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));       
        list.add(new Hosting(6, "linode.com", 100000)); // new line
        
   // Map<String,Long>  mapint=  list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
        
//System.out.println(mapint);
//2.2 To solve the duplicated key issue above, pass in the third mergeFunction argument like this :

Map<String,Long>  remvedup=  list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,(old,newv)->old));

System.out.println(remvedup);
	}

}
