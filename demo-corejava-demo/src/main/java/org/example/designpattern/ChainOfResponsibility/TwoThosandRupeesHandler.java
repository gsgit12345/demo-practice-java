package designepattern.ChainOfResponsibility;

public class TwoThosandRupeesHandler extends CashHandler {
	 public void fetchCash(long givenAmount)
	 {
	 long numberofNotesToBeFetched = givenAmount / 2000;
	 if (numberofNotesToBeFetched > 0)
	 {
	 if(numberofNotesToBeFetched >1)
	 {
	 System.out.println(numberofNotesToBeFetched + " ,Fifty Rupees notes are Fetched by FiftyRupeesHandler \n");
	 }
	 else
	 {
	 System.out.println(numberofNotesToBeFetched + " ,Fifty Rupees note is Fetched by FiftyRupeesHandler \n");
	  
	 }
	 }
	 
	 long pendingRupeesToBeProcessed = givenAmount % 5000;
	 
	 if (pendingRupeesToBeProcessed > 0)
	 {
	 rupeesHandler.fetchCash(pendingRupeesToBeProcessed);
	 
	 }
	 
	}
	 
	}

