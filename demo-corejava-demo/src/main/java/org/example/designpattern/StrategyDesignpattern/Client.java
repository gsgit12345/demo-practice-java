package org.example.designpattern.StrategyDesignpattern;
import executerdemo.Thread.NetworkChecker;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentStrategy pay=new PaymentStrategy();
		PaymentDetail dtl=new PaymentDetail();
		
		if("creditcard".equalsIgnoreCase("creditcard"))
		{
			pay.setStratgey(new CreditCardPayment() );
			pay.makePayment(dtl);
		}else if("cash".equalsIgnoreCase("cash"))
				{
			pay.setStratgey(new CashPayment());
			pay.makePayment(dtl);
				}

	}

}
