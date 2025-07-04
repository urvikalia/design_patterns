package org.practice.design.pattern.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout()
    {
        // checkout to be performed and as alost step payement to be made
        paymentStrategy.pay();

    }
}
