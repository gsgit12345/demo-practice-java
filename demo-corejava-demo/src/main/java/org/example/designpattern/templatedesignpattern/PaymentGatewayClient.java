package org.example.designpattern.templatedesignpattern;


    public class PaymentGatewayClient {
        public static void main(String[] args) {
            PaymentGatewayFactory factory = new PaymentGatewayFactory();
            PaymentGateway gateway = factory.getPaymentGateway("credit card");
            gateway.makePayment();
        }
    }


