package org.example.designpattern.templatedesignpattern;

public class CreditCardPaymentGateway  extends PaymentGateway
{
    @Override
    protected void validatePayment() {
        System.out.println("CreditCardPaymentGateway validate");
    }

    @Override
    protected void transferMoney() {
        System.out.println("CreditCardPaymentGateway transferMoney");
    }

    @Override
    protected void updateDatabase() {
        System.out.println("CreditCardPaymentGateway updateDatabase");

    }
}
