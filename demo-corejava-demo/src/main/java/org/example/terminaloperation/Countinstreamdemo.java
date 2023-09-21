package terminaloperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Countinstreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count=Stream.of("hh","po","hello","hai","op","ty").count();
		
		long count1=Stream.of(1,5,7,8,0,9,8,6).collect(Collectors.counting());
		System.out.println(count1);

	}

}
