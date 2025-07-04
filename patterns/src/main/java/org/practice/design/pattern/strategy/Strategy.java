package org.practice.design.pattern.strategy;

public class Strategy {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new UPIPaymentStrategy());
        cart.checkout();

        ShoppingCart cart2= new ShoppingCart();
        cart2.setPaymentStrategy(new CreditCardPaymentStrategy());
        cart2.checkout();
    }
}
