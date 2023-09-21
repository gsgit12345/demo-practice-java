package comparator.withjdk8;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Jonetimetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Clock cc=Clock.systemUTC();
		System.out.println(cc.toString());
		
		ZonedDateTime date=ZonedDateTime.now(ZoneId.of(""));
		
	}

}
