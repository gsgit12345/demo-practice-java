package streamtut.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingSalepartionBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partionBySalesData();
	}

	
	public static void partionBySalesData()
	{
		SaleData[] saleData= {
			new SaleData("Alice", "London", 200),
			new SaleData("Bob", "London", 150),
			new SaleData("Charles", "New York", 160),
			new SaleData("Dorothy", "Hong Kong", 190),	

				
		};
		
		
		List<SaleData> sale=Arrays.asList(saleData);
		Map<String,Double> averageSaleByCity=sale.stream().collect(Collectors.groupingBy(SaleData::getCity,Collectors.averagingInt(SaleData::getNumSale)));
		
		System.out.println(averageSaleByCity);
		
	}
}
