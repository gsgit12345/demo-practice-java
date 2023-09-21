package java8miscs;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> fullname=Optional.of("tom");
		fullname=Optional.ofNullable(null);
		
		System.out.println("full name is set:"+fullname.isPresent());
		System.out.println("full name is:"+fullname.orElseGet(()->"[non]"));
		
		System.out.println(fullname.map(s->"hey"+s+"|").orElse("hey"));
		
	}

}
