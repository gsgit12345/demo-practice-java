package org.example.designpattern.templatedesignpattern;

public class NetBankingPaymentGateway extends PaymentGateway
{
    @Override
    protected void validatePayment() {
        System.out.println("NetBankingPaymentGateway validate");
    }

    @Override
    protected void transferMoney() {
        System.out.println("NetBankingPaymentGateway transferMoney");
    }

    @Override
    protected void updateDatabase() {
        System.out.println("NetBankingPaymentGateway updateDatabase");

    }
}

