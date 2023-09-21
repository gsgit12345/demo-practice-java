package terminaloperation;

import java.util.stream.Stream;

public class streamtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		Object[] objArray = stream.toArray();
		System.out.println("objArray length " + objArray.length);


	}

}
