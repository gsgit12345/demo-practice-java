package functionalinterface.inbuiltfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        List<Hosting> list = Arrays.asList(new Hosting[]{h1, h2, h3, h4});

        List<Hosting> result = HostingRespositoryFilter.filterHosting(list, x -> x.getName().startsWith("g"));
        System.out.println("result : " + result);  // google

        List<Hosting> result2 = HostingRespositoryFilter.filterHosting(list, isDeveloperFriendly());
        System.out.println("result2 : " + result2); // linode

	}

	private static Predicate<Hosting> isDeveloperFriendly() {
		// TODO Auto-generated method stub
        return n -> n.getName().equals("linode");
	}

}
