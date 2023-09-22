package org.example.designpattern.BuilderPattern;

public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust=new Customer.
				CustomerBuilder("Dinesh", "singh", "loyalblue", "09/11/2022", 6000)
				.addAge("56").addMidName("kumar").build();
		
		
		System.out.println("customer is::"+cust);
		
		

	}

}
