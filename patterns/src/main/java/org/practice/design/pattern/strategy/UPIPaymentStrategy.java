package org.practice.design.pattern.strategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("payment made via UPI successful");
    }
}
