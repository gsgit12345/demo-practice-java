package org.example.designpattern.StrategyDesignpattern;

public class NetBankingPayment implements IPayment {

	@Override
	public boolean pay(PaymentDetail payDtl) {
		// TODO Auto-generated method stub
		System.out.println("netbanking");
		return false;
	}

}
