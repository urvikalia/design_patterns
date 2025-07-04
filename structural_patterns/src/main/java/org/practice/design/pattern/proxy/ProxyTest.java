package org.practice.design.pattern.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Greeter greeter = new ProxyGreeter();
        System.out.println(greeter.greet());
    }
}
