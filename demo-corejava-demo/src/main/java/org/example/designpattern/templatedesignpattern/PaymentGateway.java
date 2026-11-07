package org.example.designpattern.templatedesignpattern;

public abstract class PaymentGateway {
        public final void makePayment() {
            validatePayment();
            transferMoney();
            updateDatabase();
            System.out.println("making a payment using payment gateway");
        }
        protected abstract void validatePayment();
        protected abstract void transferMoney();
        protected abstract void updateDatabase();
    }


