package designepattern.StrategyDesignpattern;

public class PaymentStrategy {
	
	IPayment  payment;
	
	public void setStratgey(IPayment pay)
	{
		this.payment=pay;
	}

	public void makePayment(PaymentDetail dtl)
	{
		//set the required thing
		
		payment.pay(dtl);
	}
}
