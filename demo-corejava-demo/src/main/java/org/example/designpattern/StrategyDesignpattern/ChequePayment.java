package designepattern.StrategyDesignpattern;

public class ChequePayment implements IPayment {

	@Override
	public boolean pay(PaymentDetail payDtl) {
		// TODO Auto-generated method stub
		
		System.out.println("by check paymeny");
		return false;
	}

}
