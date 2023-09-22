package org.example.designpattern.ChainOfResponsibility;

public class HundredRupeesHandler extends CashHandler
{
 
 public void fetchCash(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 100;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Hundred Rupees notes are Fetched by HundredRupeesHandler \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Hundred Rupees note is Fetched by HundredRupeesHandler \n");
  
 }
 }
 
 long pendingRupeesToBeProcessed = givenAmount % 100;
 
 if (pendingRupeesToBeProcessed > 0)
 {
 rupeesHandler.fetchCash(pendingRupeesToBeProcessed);
 
 }
 
}
 
}