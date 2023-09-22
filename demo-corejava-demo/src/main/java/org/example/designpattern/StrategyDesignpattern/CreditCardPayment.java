package org.example.designpattern.StrategyDesignpattern;

public class CreditCardPayment  implements IPayment{

	@Override
	public boolean pay(PaymentDetail paydtl) {
		// TODO Auto-generated method stub
		System.out.println("crdeti card");
		return false;
	}

}
