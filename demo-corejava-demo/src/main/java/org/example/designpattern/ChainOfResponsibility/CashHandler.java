package designepattern.ChainOfResponsibility;

public abstract class CashHandler {
	CashHandler rupeesHandler;
	 
	 public void nextHandler( CashHandler rupeesHandler)
	 {
	 this.rupeesHandler= rupeesHandler;
	 }
	 
	 public abstract void fetchCash( long givenAmount );
	 
	}

