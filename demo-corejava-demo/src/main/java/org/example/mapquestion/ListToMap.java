package sortmapbykeyandvalue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));

Map<Integer,String>  listmap=list.stream().
collect(Collectors.toMap(Hosting::getId, Hosting::getName));
//System.out.println(listmap);



Map<Integer,Long> mapint=list.stream().collect(Collectors.toMap(x->x.getId() ,k->k.getWebsites()));

System.out.println(mapint);
	}

}
