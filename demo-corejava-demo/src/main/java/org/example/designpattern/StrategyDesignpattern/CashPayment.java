package org.example.designpattern.StrategyDesignpattern;

public class CashPayment implements IPayment {

	@Override
	public boolean pay(PaymentDetail payDtl) {
		// TODO Auto-generated method stub
		
		System.out.println("by cash payment");
		return false;
	}

}
