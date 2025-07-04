package org.practice.design.pattern.proxy;

public class ProxyGreeter implements Greeter {

    Greeter greeter ;

    @Override
    public String greet() {
        if(greeter == null){
            greeter = new RealGreeter();
        }
        return greeter.greet();

    }
}
