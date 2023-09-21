package intermediateope;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class infinitestreamofcustomeobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp=Stream.generate(Employee::create).
				limit(20).collect(Collectors.toList());
		
		System.out.println(emp);

	}

}
 