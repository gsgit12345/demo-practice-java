package designepattern.ChainOfResponsibility;

public class WithdrawMonyClient {

	
	public static void main(String str[])
	{
		ProcessPayment pay=new ProcessPayment();
		pay.payment(2000);
	}
}
