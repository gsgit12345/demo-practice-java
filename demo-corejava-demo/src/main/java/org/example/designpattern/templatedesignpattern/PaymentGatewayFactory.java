package org.example.designpattern.templatedesignpattern;

public class PaymentGatewayFactory {
    public PaymentGateway getPaymentGateway(String paymentOption) {
        if (paymentOption.equals("credit card")) {
            return new CreditCardPaymentGateway();
        } else if (paymentOption.equals("netbank")) {
            return new NetBankingPaymentGateway();
        } else if (paymentOption.equals("netbank")) {
            return new DebitcartPaymentGateway();
        }
        else {
            throw new IllegalArgumentException("Invalid payment option");
        }
    }
}
