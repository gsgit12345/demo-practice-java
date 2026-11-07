package org.example.designpattern.ChainOfResponsibility;

public class FiftyRupeesHandler extends CashHandler {
    public void fetchCash(long givenAmount) {
        long numberofNotesToBeFetched = givenAmount / 50;
        if (numberofNotesToBeFetched > 0) {
                System.out.println(numberofNotesToBeFetched + " ,Fifty Rupees notes are Fetched by FiftyRupeesHandler \n");
            } else {
                System.out.println(numberofNotesToBeFetched + " ,Fifty Rupees note is  not Fetched by FiftyRupeesHandler \n");


        }

        long pendingRupeesToBeProcessed = givenAmount % 50;
        if (pendingRupeesToBeProcessed > 0) {
            rupeesHandler.fetchCash(pendingRupeesToBeProcessed);

        }

    }

}

