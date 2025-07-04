package org.practice.design.pattern.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("payment made via Credit card");
    }
}
