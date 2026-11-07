package org.example.designpattern.ChainOfResponsibility;

public class ProcessPayment {
    private static FiveHundredRupeesHandler fivehundredRupeesHandler = new FiveHundredRupeesHandler();
    private static HundredRupeesHandler hundredRupeesHandler = new HundredRupeesHandler();
    private static FiftyRupeesHandler FiftyRupeesHandler = new FiftyRupeesHandler();

    static {
        // Construct the chain of Rupees Handlers
        fivehundredRupeesHandler.nextHandler(hundredRupeesHandler);
        hundredRupeesHandler.nextHandler(FiftyRupeesHandler);
    }

    public void payment(long givenAmount) {

        fivehundredRupeesHandler.fetchCash(givenAmount);
    }

}
