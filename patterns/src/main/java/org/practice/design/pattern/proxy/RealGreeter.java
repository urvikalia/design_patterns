package org.practice.design.pattern.proxy;

public class RealGreeter implements Greeter {
    @Override
    public String greet() {
        return "Hello there!!";
    }
}
