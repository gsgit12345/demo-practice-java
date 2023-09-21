import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class findminandmaxdateinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate start=LocalDate.now();
		LocalDate end=LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("start:"+start);
		System.out.println("end:"+end);
		
		List<LocalDate> allDate=Stream.iterate(start, date->date.plusDays(1)).limit(ChronoUnit.DAYS.between(start, end)).
				collect(Collectors.toList());
		//allDate.forEach(System.out::println);
		
		LocalDate max=allDate.stream().max(Comparator.comparing(LocalDate::toEpochDay)).get();
		LocalDate min=allDate.stream().min(Comparator.comparing(LocalDate::toEpochDay)).get();
		
		
		System.out.println(max);
		System.out.println(min);
		
		

	}

}
