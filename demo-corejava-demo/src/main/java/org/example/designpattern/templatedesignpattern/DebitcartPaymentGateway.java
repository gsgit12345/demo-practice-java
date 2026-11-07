package org.example.designpattern.templatedesignpattern;

public class DebitcartPaymentGateway extends PaymentGateway
{
    @Override
    protected void validatePayment() {
        System.out.println("DebitcartPaymentGateway validate");
    }

    @Override
    protected void transferMoney() {
        System.out.println("DebitcartPaymentGateway transferMoney");
    }

    @Override
    protected void updateDatabase() {
        System.out.println("DebitcartPaymentGateway updateDatabase");

    }
}


