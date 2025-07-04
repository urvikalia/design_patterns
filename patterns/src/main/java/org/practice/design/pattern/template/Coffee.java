package org.practice.design.pattern.template;

public class Coffee extends Drink{
    @Override
    public void brew() {
        System.out.println("brewing Coffee... ");
    }

    @Override
    public void addCondiments() {
        System.out.println("Added Cinnamon ");
    }
}
