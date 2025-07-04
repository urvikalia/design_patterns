package org.practice.design.pattern.proxy;

public class Facade {

    public static void main(String[] args) {
        Compiler compiler = new CompilerFacade();
        compiler.compile();

    }
}
