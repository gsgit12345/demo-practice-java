package StringJoinerex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

String joinstring=list.stream().collect(Collectors.joining("-"));
System.out.println(joinstring);

List<Game> objectjoin = Arrays.asList(
        new Game("Dragon Blaze", 5),
        new Game("Angry Bird", 5),
        new Game("Candy Crush", 5)
);

String join=objectjoin.stream().map(x->x.getName()).collect(Collectors.joining(",","{","}"));

System.out.println(join);


	}

}
