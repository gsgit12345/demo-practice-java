package designepattern.ChainOfResponsibility;

public class ProcessPayment {
	 private static FiveHundredRupeesHandler fivehundredRupeesHandler = new FiveHundredRupeesHandler();
	 private static HundredRupeesHandler hundredRupeesHandler = new HundredRupeesHandler();
	 private static HundredRupeesHandler   fiftyRupeesHandler   = new HundredRupeesHandler();
	 private static TwoThosandRupeesHandler  twentyRupeesHandler  = new TwoThosandRupeesHandler();
	// private static FiveRupeesHandler    fiveRupeesHandler    = new FiveRupeesHandler();
	 
	 static
	 {
	 // Construct the chain of Rupees Handlers
	 fivehundredRupeesHandler.nextHandler(hundredRupeesHandler);
	 hundredRupeesHandler.nextHandler(fiftyRupeesHandler);
	 fiftyRupeesHandler.nextHandler(twentyRupeesHandler);
	// twentyRupeesHandler.nextHandler(fiveRupeesHandler);
	 }
	 
	 public void payment( long givenAmount )
	 {
	 
	 fivehundredRupeesHandler.fetchCash(givenAmount);
	 }

}
