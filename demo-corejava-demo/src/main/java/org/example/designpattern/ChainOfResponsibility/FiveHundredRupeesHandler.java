package designepattern.ChainOfResponsibility;

public class FiveHundredRupeesHandler  extends CashHandler{

	@Override
	public void fetchCash(long givenAmount) {
		// TODO Auto-generated method stub
		 long numberofNotesToBeFetched = givenAmount / 500;
		 if (numberofNotesToBeFetched > 0)
		 {
		 if(numberofNotesToBeFetched >1)
		 {
		 System.out.println(numberofNotesToBeFetched + " ,Five Hundred Rupees notes are Fetched by FiveHundredRupeesHandler \n");
		 }
		 else
		 {
		 System.out.println(numberofNotesToBeFetched + " ,Five Hundred Rupees note is Fetched by FiveHundredRupeesHandler \n");
		  
		 }
		 }
		 
		 long pendingRupeesToBeProcessed = givenAmount % 500;
		 
		 if (pendingRupeesToBeProcessed > 0)
		 {
		 rupeesHandler.fetchCash(pendingRupeesToBeProcessed);
		 
		 }
}
}